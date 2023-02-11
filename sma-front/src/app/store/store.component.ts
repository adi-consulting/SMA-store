import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { AddStoreComponent } from './components/add-store/add-store.component';
import { Store } from './models/store.model';
import { StoreToDisplay } from './models/storeToDisplay';
import { StoreService } from './services/store.service';

@Component({
  selector: 'app-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.scss']
})
export class StoreComponent implements OnInit {

  constructor(private storeService: StoreService, public dialog: MatDialog, private router: Router) { }


  requestInProgress = true;

  DEFAULT_PAGE_SIZE = 10;
  sizeChanged = false;

  displayedColumns = ['code', 'shopName', 'groupId', 'manage'];


  /*id: number;
    groupId?: number;
    code?: string;
    shopName?: string;
    idAddress?: number;
    active?: boolean**/


  dataSource: MatTableDataSource<StoreToDisplay>;

  storeData: Store[];

  ngOnInit() {
    this.loadAllStore();
  }


   loadAllStore() {
    this.storeService.getAllStore().subscribe((res: Store[]) => {
      this.storeData = res;
      this.createDataSource();
    });
  }

  createDataSource() {
    const stores = [];
    for (const storeApi of this.storeData) {
      const data: StoreToDisplay = {
        shopName: storeApi.shopName,
        code: storeApi.code,
        groupId: storeApi.groupId
      };
      stores.push(data);
    }
    this.dataSource = new MatTableDataSource(stores);

  }


  /**
   * opens dialog to add a region
   */
  openDialogAdd() {
    const dialogRef = this.dialog.open(AddStoreComponent, {
      width: '40vw'
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (result !== undefined) { // result is undefined when dialog is closed w\ submit
        //this.loadRegions();
      }
    });
  }

  editStore(){
    this.router.navigate(['store-edit']);
  }

  getIdByCode(code: string) {
    return this.storeData.find(store => store.code === code).id;
  }

}
