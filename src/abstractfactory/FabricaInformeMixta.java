package abstractfactory;

public class FabricaInformeMixta implements FabricaInforme{

	public FabricaInformeMixta() {
    }

	public Factura crearFactura() {
	        return new FacturaMixta();
	    }
	
	public Compra crearCompra() {
        return new CompraMixta();
    }
	public Pedido crearPedido() {
        return null;
    }
	
}
