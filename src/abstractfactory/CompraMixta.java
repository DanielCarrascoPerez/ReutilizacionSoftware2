package abstractfactory;

public class CompraMixta extends Compra {
	
	public CompraMixta()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de MIXTA de tipo COMPRA");
	}

}
