/**

 * Esta clase procesa los nombre de ficheros segun tipo y categoria

 * @author: Adal Ramos Garcia
 * 			Daniel Carrasco Perez

 * @version: 06/12/2020/A

 */

package abstractfactory;

public class Main {

	private static void procesarInformes(String informes []){
		 String compara;
		 int resultado;
		 FabricaInforme factory= null;
		 
		 for (int i=0; i<informes.length; i++) {
			 
			  compara=informes[i];
			  resultado = compara.indexOf("ENT"); 
			  if (resultado != -1) {

					 	resultado = compara.indexOf("FAC");
					 	if (resultado != -1) {
					 			// Es un informe de ENTRADA de tipo FACTURA
					 			System.out.println(informes[i]);
					 			factory= new FabricaInformeEntrada();
					 			factory.crearFactura();
					 	}
					 	resultado = compara.indexOf("COM");
						if (resultado != -1) {
								//Es un informe de ENTRADA de tipo COMPRA
						 		System.out.println(informes[i]);
					 			factory= new FabricaInformeEntrada();
					 			factory.crearCompra();
						 }
					 	resultado = compara.indexOf("PED");
						if (resultado != -1) {
								//Es un informe de ENTRADA de tipo PEDIDO
						 		System.out.println(informes[i]);
					 			factory= new FabricaInformeEntrada();
					 			factory.crearPedido();
						 }
					 }
			  compara=informes[i];
			  resultado = compara.indexOf("SAL");
			  if (resultado != -1)
				 	resultado = compara.indexOf("FAC");
			 		if (resultado != -1) {
			 			//Es un informe de SALIDA de tipo FACTURA
			 			System.out.println(informes[i]);
			 			factory= new FabricaInformeSalida();
			 			factory.crearFactura();
			 		
			 		}
			 		resultado = compara.indexOf("COM");
			 		if (resultado != -1) {
			 			//Es un informe de SALIDA de tipo COMPRA
				 		System.out.println(informes[i]);
			 			factory= new FabricaInformeSalida();
			 			factory.crearCompra();	
				 		
			 		}  
			 		compara=informes[i];
					  resultado = compara.indexOf("MIX");
					  if (resultado != -1)
						 	resultado = compara.indexOf("FAC");
					 		if (resultado != -1) {
					 			//Es un informe de MIXTA de tipo FACTURA
					 			System.out.println(informes[i]);
					 			factory= new FabricaInformeMixta();
					 			factory.crearFactura();
					 		
					 		}
					 		resultado = compara.indexOf("COM");
					 		if (resultado != -1) {
					 			//Es un informe de MIXTA de tipo COMPRA
						 		System.out.println(informes[i]);
					 			factory= new FabricaInformeMixta();
					 			factory.crearCompra();	
						 		
					 		}  
		 }
	}

	public static void main(String[] args){
		 
		 String []reports= {"ENT_FAC_001.txt","SAL_COM_001.txt","ENT_COM_002","SAL_FAC_002.txt","MIX_FAC_001.txt","MIX_COM_001.txt","ENT_PED_001.txt","SAL_PED_001.txt"};

		 procesarInformes(reports);
	

		 
	  }
}
