import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { BuyerSignupComponent } from './buyer-signup/buyer-signup.component';
import { SellerSignupComponent } from './seller-signup/seller-signup.component';
import { SearchComponent } from './search/search.component';
import { SearchResultComponent } from './searchResult/searchResult.component';
import { ItemDetailComponent } from './itemDetail/itemDetail.component';
import { CartComponent } from './cart/cart.component';
import { PurchaseHistoryComponent } from './purchaseHistory/purchaseHistory.component';
import { ItemAddComponent } from './itemAdd/itemAdd.component';
import { ViewstockComponent } from './viewstock/viewstock.component';
import { ReportComponent } from './report/report.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'buyerSignup', component: BuyerSignupComponent},
  { path: 'sellerSignup', component: SellerSignupComponent},
  { path: 'search', component: SearchComponent},
  { path: 'searchResult', component: SearchResultComponent},
  { path: 'items/:itemId', component: ItemDetailComponent},
  { path: 'cart', component: CartComponent},
  { path: 'purchaseHistory', component: PurchaseHistoryComponent},
  { path: 'itemAdd', component: ItemAddComponent},
  { path: 'viewstock', component: ViewstockComponent},
  { path: 'report', component: ReportComponent}
];

@NgModule({
   imports: [
      RouterModule.forRoot(routes)
   ],
   exports: [
      RouterModule
   ],
   declarations: [
   ]
})
export class AppRoutingModule { }
