import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductItemComponent } from './componets/product-item/product-item.component';
import { ProductComponent } from './componets/product/product.component';

const routes: Routes = [
  { path: 'products', component: ProductComponent },
  { path: 'products/:id', component: ProductItemComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
