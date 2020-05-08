import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TutorenPage } from './tutoren.page';

const routes: Routes = [
  {
    path: '',
    component: TutorenPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TutorenPageRoutingModule {}
