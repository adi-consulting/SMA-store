import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Store } from '../../models/store.model';
import { StoreService } from '../../services/store.service';

@Component({
  selector: 'app-add-store',
  templateUrl: './add-store.component.html',
  styleUrls: ['./add-store.component.scss']
})
export class AddStoreComponent implements OnInit {

  form: FormGroup;

  // Data input 
  store: Store = new Store();

  /** control for the selected bank for multi-selection */
  public factoryMultiCtrl: FormControl = new FormControl();
  /** control for the MatSelect filter keyword multi-selection */
  public factoryMultiFilterCtrl: FormControl = new FormControl();


  constructor(fb: FormBuilder,
              public storeService: StoreService
              ) {
   

    this.form = fb.group({
      name : new FormControl('', Validators.required),
      siren : new FormControl('', Validators.required),
      group : new FormControl('', Validators.required),
    }, {});
  }

  ngOnInit() {
  }


  addStore() {
    this.store.shopName = this.form.value.name;
    this.store.code = this.form.value.siren;
    this.store.groupId = this.form.value.group;
    this.store.active = true;
    this.storeService.addRStore(this.store).subscribe(data => {
    });
  }

}
