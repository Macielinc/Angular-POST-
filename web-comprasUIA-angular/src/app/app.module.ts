import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReportesComponenteComponent } from './reportes-componente/reportes-componente.component';
import { HttpClientModule } from '@angular/common/http';
import { ReporteDetalleComponent } from './reporte-detalle/reporte-detalle.component';

@NgModule({
  declarations: [
    AppComponent,
    ReportesComponenteComponent,
    ReporteDetalleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
