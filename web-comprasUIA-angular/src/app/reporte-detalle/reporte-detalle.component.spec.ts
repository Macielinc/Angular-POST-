import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReporteDetalleComponent } from './reporte-detalle.component';

describe('ReporteDetalleComponent', () => {
  let component: ReporteDetalleComponent;
  let fixture: ComponentFixture<ReporteDetalleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReporteDetalleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReporteDetalleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
