package uia.com.apirest.compras;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cotizacion extends SolicitudOrdenCompra{

    private double valorUnitario=0.0;
    private double subtotal=0.0;
    private double total=0.0;
    private int entrega = -1;

    @JsonCreator
    public Cotizacion(@JsonProperty("id")int id, @JsonProperty("name")String name,
                                @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                                @JsonProperty("cantidad")int cantidad, @JsonProperty("vendedor")int vendedor, @JsonProperty("clasificacionProveedor")int clasificacionVendedor,
                                @JsonProperty("valorUnitario")double valorUnitario, @JsonProperty("subtotal")double subtotal, @JsonProperty("total")double total, @JsonProperty("entrega")int entrega)
    {
        super(id, name, codigo, unidad, cantidad, vendedor, clasificacionVendedor);
        this.valorUnitario = valorUnitario;
        this.subtotal = subtotal;
        this.total = total;
        this.entrega = entrega;
    }

    public Cotizacion(SolicitudOrdenCompra info)
    {
        super((PeticionOrdenCompra)info);
        this.valorUnitario = valorUnitario;
        this.subtotal = subtotal;
        this.total = total;
        this.entrega = entrega;
        this.setClasificacion(info.getClasificacion());
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEntrega() {
        return entrega;
    }

    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }
}
