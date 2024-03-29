import { Component, Input, OnInit } from '@angular/core';
import { Product } from 'src/app/models/Product';

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent implements OnInit {

  @Input() passedProduct: Product;


  constructor() { }

  ngOnInit(): void {
    // this.product = {
    //   id: 1,
    //   name: "shirt",
    //   description: "description goes here ",
    //   price: 1000, url: "",
    //   ratings: 5
    // }
  }

}
