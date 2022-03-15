import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { BehaviorSubject, Observable, of } from "rxjs";
import { IReporte } from "./iReporte"
import { map, tap, catchError } from "rxjs/operators";
import { HttpHeaders } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
  })
export class ReportesService {

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  reportesUrl = "http://localhost:8080/reportes";
  itemsUrl = "http://localhost:8080/item-rsi";

    constructor(private http: HttpClient) {        
    }

    public getReportes()
    {
         return this.http.get<IReporte[]>(this.reportesUrl)
        .pipe(
          tap(_ => console.log('extrayendo reportes')),
        catchError(this.handleError<IReporte[]>('loadReporte', []))
      );
    }
    
    private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {      
          // TODO: send the error to remote logging infrastructure
          console.error(error); // log to console instead      
          // TODO: better job of transforming error for user consumption
          console.log(`${operation} failed: ${error.message}`);      
          // Let the app keep running by returning an empty result.
          return of(result as T);
        };
      }

      /** POST: add a new Reporte to the server */
  public agregaReporte(Reporte: IReporte): Observable<IReporte> {
    return this.http.post<IReporte>(this.itemsUrl, Reporte, this.httpOptions).pipe(
      tap((newReporte: IReporte) => console.log(`added Reporte w/ id=${newReporte.id}`)),
      catchError(this.handleError<IReporte>('addReporte'))
    );
  }
}
