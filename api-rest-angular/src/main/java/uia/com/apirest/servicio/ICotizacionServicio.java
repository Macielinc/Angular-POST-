package uia.com.apirest.servicio;

import uia.com.apirest.modelo.CotizacionModelo;
import uia.com.apirest.modelo.ItemComprasUIAModelo;

import java.util.ArrayList;

public interface ICotizacionServicio {
    ArrayList<CotizacionModelo> getCotizaciones();
    Object getCotizacion(int id);
    void print();

    CotizacionModelo deleteCotizacion(int id);
    CotizacionModelo putCotizacion(int id, ItemComprasUIAModelo newItem);
}
