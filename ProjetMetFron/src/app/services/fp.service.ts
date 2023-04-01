import { Injectable } from '@angular/core';
import{ HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FpService  {
  private host:string ="http://localhost:8080"
  constructor(private http :HttpClient) { }
public getFamilles(){
  return this.http.get(this.host+"/familleproduits")

}

}
