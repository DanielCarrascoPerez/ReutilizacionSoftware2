package abstractfactory;

public class FabricaInformeEntrada implements FabricaInforme {
	
	public FabricaInformeEntrada() {
    }
	
	public Factura crearFactura() {
	        return new FacturaEntrada();
	}
	
	public Compra crearCompra() {
        return new CompraEntrada();
    }
	
	public Pedido crearPedido() {
        return new PedidoEntrada();
    }

}
