package uia.com.apirest.compras;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Vendedor{
    private int id=-1;
    public Vendedor()
    {}


    public Vendedor(int keyVendedor)
    {
        this.id = keyVendedor;
    }

    public Cotizacion cotiza(SolicitudOrdenCompra solicitudOrdenCompra, ObjectMapper mapper) throws IOException {
        Cotizacion nodo;
        ArrayList<InfoComprasUIA> newLista = new ArrayList<InfoComprasUIA>();
        double total=0.0;
        Random rand = new Random(); //instance of random class
        int upperbound = 9;
        //generate random values from 0-9
        int int_precio;;

        for(int i=0; i<solicitudOrdenCompra.getItems().size(); i++)
        {
            nodo = (Cotizacion) new Cotizacion((SolicitudOrdenCompra)solicitudOrdenCompra.getItems().get(i));
            //generate random values from 1-10
            int_precio = rand.nextInt(upperbound);
            nodo.setValorUnitario((i+1)*int_precio);
            nodo.setSubtotal(nodo.getValorUnitario()*nodo.getCantidad());
            total = total+nodo.getSubtotal();
            nodo.setVendedor(this.id);
            newLista.add(nodo);
        }

        Cotizacion newCotizacion = new Cotizacion(solicitudOrdenCompra.getId(),
                                            "Cotizacion-" + solicitudOrdenCompra.getName(), "", "", 1,
                                             solicitudOrdenCompra.getVendedor(), solicitudOrdenCompra.getClasificacion(),
                                             total, total, total, 1);
        newCotizacion.setItems(newLista);
        mapper.writeValue(new File("C:/TSU-2022/ComprasProy/" + newCotizacion.getName() +"-vendedor-"+this.id +".json"), newCotizacion);
        return newCotizacion;
    }
}
