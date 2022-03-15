package uia.com.apirest.servicio;

import uia.com.apirest.compras.InfoComprasUIA;
import uia.com.apirest.modelo.ItemReporteModelo;

import java.io.IOException;
import java.util.ArrayList;

public interface ItemIRNSIServicio {
    ItemReporteModelo agregaRNSIItem(InfoComprasUIA reporte) throws IOException;
    ArrayList<ItemReporteModelo> getReportes();
}