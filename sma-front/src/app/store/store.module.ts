import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StoreComponent } from './store.component';
import { AddStoreComponent } from './components/add-store/add-store.component';

import {MatTableModule} from '@angular/material/table';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import {MatDialogModule} from '@angular/material/dialog';
import { MatTooltipModule } from '@angular/material/tooltip';
import {MatDividerModule} from '@angular/material/divider';
import { EditStoreComponent } from './components/edit-store/edit-store.component';
import { EditStoreInfoComponent } from './components/edit-store/edit-store-info/edit-store-info.component';
import { EditStoreManageComponent } from './components/edit-store/edit-store-manage/edit-store-manage.component';



@NgModule({
  declarations: [StoreComponent, AddStoreComponent, EditStoreComponent, EditStoreInfoComponent, EditStoreManageComponent],
  imports: [
    CommonModule,
    MatTableModule,
    RouterModule,
    FormsModule,
    MatFormFieldModule,
    MatDialogModule,
    ReactiveFormsModule,
    MatTooltipModule,
    MatDividerModule,
  ]
})
export class StoreModule { }
