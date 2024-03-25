import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { localStorageSession } from '../../shared/localStorage';
import {
  MatSnackBar,
  MatSnackBarHorizontalPosition,
  MatSnackBarModule,
  MatSnackBarVerticalPosition,
} from '@angular/material/snack-bar';
import { AdminService } from '../../services/admin.service';
import { saveAs } from 'file-saver';

@Component({
  selector: 'app-addtour',
  templateUrl: './greeting.component.html',
  styleUrl: './greeting.component.css',
})
export class GreetingComponent {
  UserName = '';
  UserBookingTour: any[] = [];
  List: any[] = [];
  UserID = 0;
  ID = 0;
  selectedFile: any;
  ReceipesDocURL = '';
  IsEdit = false;
  Name: any = '';
  horizontalPosition: MatSnackBarHorizontalPosition = 'end';
  verticalPosition: MatSnackBarVerticalPosition = 'bottom';
  constructor(
    private router: Router,
    private serviceService: UserService,
    private _localStorage: localStorageSession,
    private _snackBar: MatSnackBar,
    private route: ActivatedRoute,
    private businessService: AdminService
  ) {
    this.UserID = Number(this._localStorage.getItem('User-Id'));
    this.UserName = this._localStorage.getItem('User-Email');
  }

  ngOnInit(): void {
    this.GetUserReceipeList();
  }

  GetUserReceipeList() {
    this.serviceService.GetUserReceipeList(this.UserID).subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.List = result;
      },
      error: (error: any) => {
        console.log('Error : ', error);
      },
    });
  }

  openSnackBar(message: string) {
    this._snackBar.open(message, '', {
      horizontalPosition: this.horizontalPosition,
      verticalPosition: this.verticalPosition,
      duration: 3000,
    });
  }

  handleCopy(data: any) {
    $('#name').val(data.name);
    this.ID = data.id;
    this.ReceipesDocURL = data.fileURL;
    this.IsEdit = true;
  }

  handleDelete(id: any) {
    this.serviceService.DeleteUserReceipe(id).subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.GetUserReceipeList();
        this.openSnackBar('Delete User Receipes Successfully');
        this.handleClear();
      },
      error: (error: any) => {
        console.log('Error : ', error);
        this.openSnackBar('Something went wrong');
      },
    });
  }

  handleSubmit() {
    if (this.IsEdit) {
      this.handleEdit();
    } else {
      this.handleAdd();
    }
  }

  handleValidation() {
    $('#nameHelp').hide();
    $('#fileHelp').hide();
    let Value = false;
    if ($('#name').val() === '') {
      $('#nameHelp').show();
      Value = true;
    }
    if (!this.IsEdit && this.selectedFile === undefined) {
      $('#fileHelp').show();
      Value = true;
    }

    return Value;
  }

  handleAdd() {
    if (this.handleValidation()) {
      return;
    }

    this.Name = $('#name').val();

    const data: FormData = new FormData();
    data.append('UserID', this.UserID.toString());
    data.append('Name', this.Name.toString());
    data.append('File', this.selectedFile);

    this.serviceService.AddUserReceipe(data).subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.GetUserReceipeList();
        this.openSnackBar('Add User Receipes Successfully');
        this.handleClear();
      },
      error: (error: any) => {
        console.log('Error : ', error);
        this.openSnackBar('Something went wrong');
      },
    });
  }

  handleEdit() {
    if (this.handleValidation()) {
      return;
    }
    // debugger;
    this.Name = $('#name').val();

    const data: FormData = new FormData();
    data.append('Id', this.ID.toString());
    data.append('UserID', this.UserID.toString());
    data.append('Name', this.Name.toString());
    data.append('FileURL', this.ReceipesDocURL.toString());
    data.append('File', this.selectedFile);

    this.serviceService.UpdateUserReceipe(data).subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.GetUserReceipeList();
        this.openSnackBar('Update User Receipes Successfully');
        this.handleClear();
      },
      error: (error: any) => {
        console.log('Error : ', error);
        this.openSnackBar('Something went wrong');
      },
    });
  }

  handleClear() {
    $('#name').val('');
    this.selectedFile = '';
    this.ReceipesDocURL = '';
    this.IsEdit = false;
  }

  onFileSelected(event: any): void {
    this.selectedFile = event.target.files[0];
    console.log('File : ', this.selectedFile);
    this.ReceipesDocURL = '';
  }

  handledownload(url: any) {
    saveAs(url, 'Receipe Document.pdf');
  }
}
