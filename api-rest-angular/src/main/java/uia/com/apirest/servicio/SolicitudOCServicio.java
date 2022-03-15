package uia.com.apirest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apirest.compras.GestorCompras;
import uia.com.apirest.modelo.SolicitudOCModelo;
import uia.com.apirest.modelo.ItemComprasUIAModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class SolicitudOCServicio implements ISolicitudOCServicio {


    GestorCompras miGestorCompras;

    public SolicitudOCServicio() throws IOException {
    }

    @Autowired
    public SolicitudOCServicio(GestorCompras gestorCompras) throws IOException {
        this.miGestorCompras = gestorCompras;
    }

    @Override
    public ArrayList<SolicitudOCModelo> getSolicitudesOC() {
        return miGestorCompras.getSolicitudesOC();
    }

    @Override
    public SolicitudOCModelo getSolicitudOC(int id)
    {
        return miGestorCompras.getSolicitudOC(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloSolicitudesOC();
    }

    @Override
    public SolicitudOCModelo deleteSolicitudOC(int id) {
        return miGestorCompras.deleteSolicitudOC(id);
    }

    @Override
    public SolicitudOCModelo putSolicitudOC(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putSolicitudOC(id, newItem);
    }
}
