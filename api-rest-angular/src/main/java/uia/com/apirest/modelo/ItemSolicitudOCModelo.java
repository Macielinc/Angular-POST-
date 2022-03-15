package uia.com.apirest.modelo;

public class ItemSolicitudOCModelo extends ItemReporteModelo

{
    public ItemSolicitudOCModelo(int cantidad, double valorUnitario, double subtotal, double total) {
        super(cantidad, valorUnitario, subtotal, total);
    }

    public ItemSolicitudOCModelo(int cantidad, double valorUnitario, double subtotal, double total, String name, int clasificacion, int id, String codigo) {
        super(cantidad, valorUnitario, subtotal, total, name, clasificacion, id, codigo);
    }

    public ItemSolicitudOCModelo(int cantidad, String name, int clasificacion, int id, String codigo, int existenciaMinima, int existencia, int consumo, int pedidoProveedor) {
        super(cantidad, name, clasificacion, id, codigo, existenciaMinima, existencia, consumo, pedidoProveedor);
    }
}
