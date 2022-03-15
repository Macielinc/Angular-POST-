import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReportesComponenteComponent } from './reportes-componente.component';
import {FormsModule} from '@angular/forms'

describe('ReportesComponenteComponent', () => {
  let component: ReportesComponenteComponent;
  let fixture: ComponentFixture<ReportesComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReportesComponenteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReportesComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
