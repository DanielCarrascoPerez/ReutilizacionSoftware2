package abstractfactory;

public class FacturaSalida extends Factura {

	public FacturaSalida()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de SALIDA de tipo FACTURA");
	}
}
