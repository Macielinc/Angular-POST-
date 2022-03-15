package uia.com.apirest.servicio;

import uia.com.apirest.modelo.SolicitudOCModelo;
import uia.com.apirest.modelo.ItemComprasUIAModelo;

import java.util.ArrayList;

public interface ISolicitudOCServicio {
    ArrayList<SolicitudOCModelo> getSolicitudesOC();
    Object getSolicitudOC(int id);
    void print();

    SolicitudOCModelo deleteSolicitudOC(int id);
    SolicitudOCModelo putSolicitudOC(int id, ItemComprasUIAModelo newItem);
}
