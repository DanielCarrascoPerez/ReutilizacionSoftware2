package abstractfactory;

public class CompraSalida extends Compra {

	public CompraSalida()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de SALIDA de tipo COMPRA");
	}
}
