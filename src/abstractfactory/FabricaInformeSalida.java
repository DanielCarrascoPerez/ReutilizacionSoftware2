package abstractfactory;

public class FabricaInformeSalida implements FabricaInforme {

	public FabricaInformeSalida() {
    }

	public Factura crearFactura() {
	        return new FacturaSalida();
	    }
	
	public Compra crearCompra() {
        return new CompraSalida();
    }
	public Pedido crearPedido() {
        return null;
    }
}
