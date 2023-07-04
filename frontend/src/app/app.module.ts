import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ProblemsComponent } from './problems/problems.component';
import { ExploreComponent } from './explore/explore.component';

import { ProblemService } from './services/problem.service';
import { ExploreService } from './services/explore.service';

@NgModule({
  declarations: [
    AppComponent,
    ProblemsComponent,
    ExploreComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProblemService, ExploreService],
  bootstrap: [AppComponent]
})
export class AppModule { }