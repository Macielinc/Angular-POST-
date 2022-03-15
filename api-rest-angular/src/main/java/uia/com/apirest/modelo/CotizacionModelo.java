package uia.com.apirest.modelo;


import java.util.ArrayList;

public class CotizacionModelo {
    private int id=-1;
    private String name="";
    private String codigo="";
    private int vendedor=-1;
    private int clasificacionVendedor=-1;
    private double total=0.0;
    private int entrega = -1;
    private ArrayList<ItemCotizacionModelo> items = new ArrayList<ItemCotizacionModelo>();

    public ArrayList<ItemCotizacionModelo> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCotizacionModelo> items) {
        this.items = items;
    }

    public CotizacionModelo(int id, String name, String codigo, int vendedor, int clasificacionVendedor, double total, int entrega)
    {
        this.id=id;
        this.name = name;
        this.codigo = codigo;
        this.total = total;
        this.entrega = entrega;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getClasificacionVendedor() {
        return clasificacionVendedor;
    }

    public void setClasificacionVendedor(int clasificacionVendedor) {
        this.clasificacionVendedor = clasificacionVendedor;
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

    public void print()
    {
        System.out.println(
                " \n\tid:\t"+this.id
                +" \n\tname:\t"+this.name
                +" \n\tcodigo:\t"+this.codigo
                +" \n\tvendedor:\t"+this.vendedor
                +" \n\tclasificacionVendedor:\t"+this.clasificacionVendedor
                +" \n\ttotal:\t"+this.total+" \n\tentrega:\t"+this.entrega);
        if(this.getItems() != null)
        {
            for(int i=0; i<this.getItems().size(); i++)
                this.getItems().get(i).print();
        }
    }
}
