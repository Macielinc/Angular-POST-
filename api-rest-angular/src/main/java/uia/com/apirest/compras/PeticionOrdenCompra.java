package uia.com.apirest.compras;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class PeticionOrdenCompra extends InfoComprasUIA
{
    @JsonCreator
    public PeticionOrdenCompra(@JsonProperty("id")int id, @JsonProperty("name")String name,
                               @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                               @JsonProperty("cantidad")int cantidad)
    {
        super(id, name);
    }

    @JsonCreator
    public PeticionOrdenCompra(@JsonProperty("id")int id, @JsonProperty("name")String name,
                               @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                               @JsonProperty("pedidoProveedor")int pedidoProveedor, @JsonProperty("consumo")int consumo,
                               @JsonProperty("existenciaMinima")int existenciaMinima,
                               @JsonProperty("existencia")int existencia)
    {
        super(id, name, codigo, unidad, pedidoProveedor, consumo, existenciaMinima, existencia);
    }

    public PeticionOrdenCompra() {
        super(-1, "");
    }


    public void agregaItems(ListaReportesNivelStock miReporteNS)
    {
        PeticionOrdenCompra nodo;
        for(int i=0; i<miReporteNS.getItems().size(); i++)
        {
            List<InfoComprasUIA> miLista = miReporteNS.getItems().get(i).getItems();
            List<InfoComprasUIA> miNewLista;

            for(int j=0; j<miLista.size(); ++j)
            {
                InfoComprasUIA miNodo = miLista.get(j);
                if (miNodo.getPedidoProveedor() > 0) {
                    nodo = new PeticionOrdenCompra(miNodo.getId(), miNodo.getName(), miNodo.getDescripcion(),
                            "PZA", miNodo.getPedidoProveedor(), miNodo.getConsumo(), miNodo.getExistenciaMinima(), miNodo.getExistencia());
                    if (this.getItems() == null) {
                        miNewLista = new ArrayList<InfoComprasUIA>();
                        this.setItems((List<InfoComprasUIA>) miNewLista);
                    }
                    this.getItems().add(nodo);
                }
                miNodo.print();
            }
        }

    }
}
