import { Component } from '@angular/core';
import {
  MatSnackBar,
  MatSnackBarHorizontalPosition,
  MatSnackBarModule,
  MatSnackBarVerticalPosition,
} from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { localStorageSession } from '../../shared/localStorage';
import { AdminService } from '../../services/admin.service';
@Component({
  selector: 'app-adminhalllist',
  templateUrl: './adminreview.component.html',
  styleUrl: './adminreview.component.css',
})
export class AdminReviewComponent {
  List: any[] = [];
  IsEdit = false;
  ID = 0;
  horizontalPosition: MatSnackBarHorizontalPosition = 'end';
  verticalPosition: MatSnackBarVerticalPosition = 'bottom';
  constructor(
    private router: Router,
    private serviceService: UserService,
    private _localStorage: localStorageSession,
    private _snackBar: MatSnackBar,
    private route: ActivatedRoute,
    private businessService: AdminService
  ) {}

  ngOnInit(): void {
    this.GetUserReviewList();
  }

  GetUserReviewList() {
    this.serviceService.GetUserReviewList().subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.List = result;
      },
      error: (error: any) => {
        console.log('Error : ', error);
      },
    });
  }


 
  handleDeleteComment(id: any) {
    this.serviceService.DeleteUserReview(id).subscribe({
      next: (result: any) => {
        console.log('Result : ', result);
        this.openSnackBar('Delete Review Successfully');
        this.GetUserReviewList();
      },
      error: (error: any) => {
        console.log('Error : ', error);
        this.openSnackBar('Something Went wrong');
      },
    });
  }

  handleClear() {
    $('#city').val('');
    $('#theaterName').val('');
    this.IsEdit = false;
  }

  handleAdd() {
    $('#cityHelp').hide();
    $('#theaterNameHelp').hide();
    let Value = false;
    if ($('#city').val() === '') {
      $('#cityHelp').show();
      Value = true;
    }

    if ($('#theaterName').val() === '') {
      $('#theaterNameHelp').show();
      Value = true;
    }

    if (Value) {
      this.openSnackBar('Please Enter Required Value');
      return;
    }

    let data = {
      city: $('#city').val(),
      theater: $('#theaterName').val(),
    };
    // this.businessService.AddTheater(data).subscribe({
    //   next: (result: any) => {
    //     console.log('Result : ', result);
    //     this.openSnackBar('Add Theater Successfully');
    //     this.handleClear();
    //     this.handleGetTheaterList();
    //   },
    //   error: (error: any) => {
    //     console.log('Error : ', error);
    //     this.openSnackBar('Something Went wrong');
    //   },
    // });
  }

  handleEdit() {
    $('#cityHelp').hide();
    $('#theaterNameHelp').hide();
    let Value = false;
    if ($('#city').val() === '') {
      $('#cityHelp').show();
      Value = true;
    }

    if ($('#theaterName').val() === '') {
      $('#theaterNameHelp').show();
      Value = true;
    }

    if (Value) {
      this.openSnackBar('Please Enter Required Value');
      return;
    }

    let data = {
      id: this.ID,
      city: $('#city').val(),
      theater: $('#theaterName').val(),
    };
    // this.businessService.UpdateTheater(data).subscribe({
    //   next: (result: any) => {
    //     console.log('Result : ', result);
    //     this.openSnackBar('Add Theater Successfully');
    //     this.handleClear();
    //     this.handleGetTheaterList();
    //   },
    //   error: (error: any) => {
    //     console.log('Error : ', error);
    //     this.openSnackBar('Something Went wrong');
    //   },
    // });
  }

  handleEditDetail(id: any) {
    this.router.navigate(['/admindashboard/userdata/' + id + '/true']);
  }

  handleDeleteBooking(id: any) {
    // this.businessService.DeleteTheater(id).subscribe({
    //   next: (result: any) => {
    //     console.log('Result : ', result);
    //     this.openSnackBar('Delete Theater Successfully');
    //     this.handleClear();
    //     this.handleGetTheaterList();
    //   },
    //   error: (error: any) => {
    //     console.log('Error : ', error);
    //     this.openSnackBar('Something Went wrong');
    //   },
    // });
  }

  openSnackBar(message: string) {
    this._snackBar.open(message, '', {
      horizontalPosition: this.horizontalPosition,
      verticalPosition: this.verticalPosition,
      duration: 3000,
    });
  }
}
