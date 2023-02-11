import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-store',
  templateUrl: './edit-store.component.html',
  styleUrls: ['./edit-store.component.scss']
})
export class EditStoreComponent implements OnInit {

  id:string;



  constructor(private activatedRoute: ActivatedRoute) { 

    this.id = this.activatedRoute.snapshot.paramMap.get('idStore');
    alert(this.id);
  }

  ngOnInit(): void {
  }

}
