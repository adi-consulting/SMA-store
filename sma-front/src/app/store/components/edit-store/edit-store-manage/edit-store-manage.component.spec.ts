import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditStoreManageComponent } from './edit-store-manage.component';

describe('EditStoreManageComponent', () => {
  let component: EditStoreManageComponent;
  let fixture: ComponentFixture<EditStoreManageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditStoreManageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditStoreManageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
