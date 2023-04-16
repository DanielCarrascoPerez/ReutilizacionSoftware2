package abstractfactory;

public class PedidoEntrada extends Pedido{

	public PedidoEntrada()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de ENTRADA de tipo PEDIDO");
	}
}
