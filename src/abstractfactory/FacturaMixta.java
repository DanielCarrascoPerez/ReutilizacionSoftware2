package abstractfactory;

public class FacturaMixta extends Factura{
	
	public FacturaMixta()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe MIXTA de tipo FACTURA");
	}

}
