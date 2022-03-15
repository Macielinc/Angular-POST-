package uia.com.apirest.servicio;

import uia.com.apirest.compras.InfoComprasUIA;

import java.io.IOException;

public interface IRNSIServicio {
    void agregaRNSI(InfoComprasUIA reporte) throws IOException;
}
