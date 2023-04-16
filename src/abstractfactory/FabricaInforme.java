package abstractfactory;

public interface FabricaInforme {

    public abstract Factura crearFactura();
    public abstract Compra crearCompra();
    public abstract Pedido crearPedido();
    
}
