import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EquipmentListComponent} from './component/equipment/equipment-list/equipment-list.component';
import {EquipmentAddComponent} from './component/equipment/equipment-add/equipment-add.component';
import {EquipmentEditComponent} from './component/equipment/equipment-edit/equipment-edit.component';


const routes: Routes = [
  {path: 'equipment-list', component: EquipmentListComponent},
  // {path: 'equipment-add', component: EquipmentAddComponent},
  // {path: 'equipment-edit/:id', component: EquipmentEditComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
