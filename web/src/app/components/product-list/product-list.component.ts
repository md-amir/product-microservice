import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/Product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  public products: Product[];

  constructor() { }

  ngOnInit(): void {

    this.products = [
      {
        "id": 1,
        "name": "shirt",
        "price": 3000,
        "description": "Some text about the shirt. Super slim and comfy lorem ipsum lorem jeansum. Lorem jeamsun denim lorem jeansum.",
        "ratings": 1,
        "url": "https://images.pexels.com/photos/4553134/pexels-photo-4553134.jpeg",
      },
      {
        "id": 2,
        "name": "pant",
        "price": 2000,
        "description": "Some text about the pant. Super slim and comfy lorem ipsum lorem jeansum. Lorem jeamsun denim lorem jeansum.",
        "ratings": 1,
        "url": "https://images.pexels.com/photos/297933/pexels-photo-297933.jpeg"
      },
      {
        "id": 3,
        "name": "shari",
        "price": 5000,
        "description": "Some text about the shari. Super slim and comfy lorem ipsum lorem jeansum. Lorem jeamsun denim lorem jeansum.",
        "ratings": 1,
        "url": "https://images.pexels.com/photos/4427641/pexels-photo-4427641.jpeg?"
      }
    ]

  }

}
