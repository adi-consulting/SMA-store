import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Store } from '../models/store.model';

import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  

  private fromEditUser = false;

  constructor(private http: HttpClient) { }

  getAllStore(): Observable<Store[]> {
    return this.http.get<Store[]>(`${environment.host}:${environment.port_2}/getAllStore`);
  }

  addRStore(store: Store): Observable<Store> {
    return this.http.post<Store>(`${environment.host}:${environment.port_2}/addStore`, store);
  }
}
