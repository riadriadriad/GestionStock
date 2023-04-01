import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DepotsComponent } from './depots/depots.component';
import { FamilleProduitComponent } from './famille-produit/famille-produit.component';
import { ProduitsComponent } from './produits/produits.component';
import { StockComponent } from './stock/stock.component';

const routes: Routes = [
  {path :"stock",component:StockComponent,children:[{path:'familleproduit',component:FamilleProduitComponent},
  {path:'produits',component:ProduitsComponent},{
    path:'depots',component:DepotsComponent
  }]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
