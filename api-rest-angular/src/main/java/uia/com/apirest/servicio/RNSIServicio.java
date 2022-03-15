package uia.com.apirest.servicio;

import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.compras.InfoComprasUIA;

import java.io.IOException;

public class RNSIServicio implements IRNSIServicio
{
    private GestorCompras miGestorCompras = new GestorCompras();

    public RNSIServicio() throws IOException {
    }


    @Override
    public void agregaRNSI(InfoComprasUIA reporte) throws IOException {
        this.miGestorCompras.agregaRNSI(reporte);
    }
    public void agregaRNSIItem(InfoComprasUIA reporte) throws IOException {
        this.miGestorCompras.agregaRNSIItem(reporte);
    }
}
