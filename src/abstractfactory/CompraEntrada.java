package abstractfactory;

public class CompraEntrada extends Compra {

	public CompraEntrada()
    {
        this.procesar();
    }

	@Override
	public void procesar() {
        System.out.println("Procesando informe de ENTRADA de tipo COMPRA");
	}
}
