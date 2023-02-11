import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TopNavigationBarComponent } from './components/top-navigation-bar/top-navigation-bar.component';
import { NavigationMenuComponent } from './components/navigation-menu/navigation-menu.component';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatListModule} from '@angular/material/list';
import {MatIconModule} from '@angular/material/icon';





@NgModule({
  declarations: [TopNavigationBarComponent, NavigationMenuComponent],
  imports: [
    CommonModule,
    MatExpansionModule,
    MatListModule,
    MatIconModule,
  ],
  exports: [
    NavigationMenuComponent,
    TopNavigationBarComponent
  ]

})
export class SharedModule { }
