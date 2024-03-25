import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserReviewComponent } from './userreview.component';

describe('UserhalllistComponent', () => {
  let component: UserReviewComponent;
  let fixture: ComponentFixture<UserReviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UserReviewComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserReviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
