import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemService } from '../../services/item.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
})
export class HomePage implements OnInit {

  items: Array<any>;
  

  constructor(
    private router: Router,
    public itemService: ItemService
  ){}
  
  removeItem(item){
    let index = this.items.indexOf(item);

    if(index > -1){
      this.items.splice(index, 1);
    }
}

  
  ngOnInit(){
    this.items = this.itemService.getItems();
  }
  get

}
