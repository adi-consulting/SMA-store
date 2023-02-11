import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { EditStoreComponent } from './store/components/edit-store/edit-store.component';
import { StoreComponent } from './store/store.component';

const routes: Routes = [
  {path: 'stores', component: StoreComponent},
  {path: 'stores/edit/:storeId', component: EditStoreComponent},
  {path: '', redirectTo: '/stores', pathMatch: 'full'},
  {path: 'products', component: ProductComponent},
  {path: 'customers', component: CustomerComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
