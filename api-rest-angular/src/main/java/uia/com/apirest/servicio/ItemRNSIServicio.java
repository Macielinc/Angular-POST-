package uia.com.apirest.servicio;

import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.compras.InfoComprasUIA;
import uia.com.apirest.modelo.ItemReporteModelo;

import java.io.IOException;
import java.util.ArrayList;

public class ItemRNSIServicio implements ItemIRNSIServicio
{
    private GestorCompras miGestorCompras = new GestorCompras();

    public ItemRNSIServicio() throws IOException {
    }


    public ItemReporteModelo agregaRNSIItem(InfoComprasUIA reporte) throws IOException {
        return this.miGestorCompras.agregaRNSIItem(reporte);
    }


    @Override
    public ArrayList<ItemReporteModelo> getReportes() {
        return miGestorCompras.getReportes();
    }
}
