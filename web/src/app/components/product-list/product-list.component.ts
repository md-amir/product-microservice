import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/Product';
import { ApiService } from 'src/app/services/api.service'

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  public products: Product[];

  constructor(private api: ApiService) { }

  ngOnInit(): void {

    this.api.getAllProducts().subscribe(
      res => {

        this.products = res
      }
    )

  }

}
