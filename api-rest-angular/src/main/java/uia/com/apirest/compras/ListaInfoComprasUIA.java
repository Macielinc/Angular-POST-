package uia.com.apirest.compras;

import java.util.ArrayList;
import java.util.List;

public  class ListaInfoComprasUIA
{
    protected int id;
    protected String name;

    private List<InfoComprasUIA> items;

    public ListaInfoComprasUIA(List<InfoComprasUIA> pl) {
        this.items = pl;
    }

    public ListaInfoComprasUIA() {
        this.items = new ArrayList<InfoComprasUIA>();
    }

    public List<InfoComprasUIA> getItems() {
        return this.items;
    }

    public void setItems(List<InfoComprasUIA> l) {
        this.items = l;
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

}