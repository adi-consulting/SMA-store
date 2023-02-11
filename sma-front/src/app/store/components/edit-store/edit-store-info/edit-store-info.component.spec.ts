import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditStoreInfoComponent } from './edit-store-info.component';

describe('EditStoreInfoComponent', () => {
  let component: EditStoreInfoComponent;
  let fixture: ComponentFixture<EditStoreInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditStoreInfoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditStoreInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
