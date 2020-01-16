import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { TestComponent } from './test/test.component';


const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'register',component:UserRegistrationComponent},
  {path:'test',component:TestComponent},
  {path:'login',component:UserLoginComponent},
  {path:'',redirectTo:'/home',pathMatch:'prefix'},
 



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
