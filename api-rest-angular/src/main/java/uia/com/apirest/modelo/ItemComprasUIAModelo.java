package uia.com.apirest.modelo;

public class ItemComprasUIAModelo
{
    private int id;
    private String name="";
    private String descripcion="";
    private int pedidoProveedor=0;
    private int clasificacion=-1;
    private int vendedor=-1;
    private int cantidad;
    private String unidad="";
    private int existenciaMinima=0;
    private int existencia=0;
    private int consumo=0;

    public ItemComprasUIAModelo()
    {
    }

    public ItemComprasUIAModelo(int id, String name, String descripcion, int pedidoProveedor, int clasificacion, int vendedor, int cantidad, String unidad, String codigo) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.pedidoProveedor = pedidoProveedor;
        this.clasificacion = clasificacion;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.codigo = codigo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPedidoProveedor() {
        return pedidoProveedor;
    }

    public void setPedidoProveedor(int pedidoProveedor) {
        this.pedidoProveedor = pedidoProveedor;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String codigo="";

    public int getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(int existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }

    public int getExistenciaMaxima() {
        return existencia;
    }

    public void setExistenciaMaxima(int existencia) {
        this.existencia = existencia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void print() {
    }
}
