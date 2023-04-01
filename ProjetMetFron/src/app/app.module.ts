import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StockComponent } from './stock/stock.component';
import { ProduitsComponent } from './produits/produits.component';
import { FamilleProduitComponent } from './famille-produit/famille-produit.component';
import { DepotsComponent } from './depots/depots.component';
import {HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    StockComponent,
    ProduitsComponent,
    FamilleProduitComponent,
    DepotsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
