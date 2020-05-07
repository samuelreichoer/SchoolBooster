import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TutorenPageRoutingModule } from './tutoren-routing.module';

import { TutorenPage } from './tutoren.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TutorenPageRoutingModule
  ],
  declarations: [TutorenPage]
})
export class TutorenPageModule {}
