package abstractfactory;

public class FacturaEntrada extends Factura  {

	
	public FacturaEntrada()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de ENTRADA de tipo FACTURA");
	}
}
