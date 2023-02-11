import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navigation-menu',
  templateUrl: './navigation-menu.component.html',
  styleUrls: ['./navigation-menu.component.scss']
})
export class NavigationMenuComponent implements OnInit {

  constructor( private router: Router) { }

  ngOnInit(): void {
  }

  openProducts(){
    this.router.navigate(['products']);
  }

  openCustomers(){
    this.router.navigate(['customers']);
  }

}
