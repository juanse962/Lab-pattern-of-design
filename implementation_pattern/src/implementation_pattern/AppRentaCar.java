package implementation_pattern;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class AppRentaCar {
	
   int id;
   String fecha;
   Date pickupdate = new Date();
   String returnDate;
   int valorHora = 0;
   int valorTotal;
	
	AppRentaCar() {}
	public void setFacture(int id, String fecha, String returnDate)
	{
		AppRentaCar facture =  new AppRentaCar();
		facture.id = id;
		facture.fecha = fecha;
		facture.returnDate= returnDate; 
		
		Queue<Integer> facturasid = new LinkedList();
		Queue<String> facturasfechas = new LinkedList();
		Queue<String> facturasreturnDate = new LinkedList();
		
		facturasid.offer(facture.id);
		facturasfechas.offer(facture.fecha);
		facturasreturnDate.offer(facture.returnDate);


		
	}
	
	public void getUser(String id, String nombre, String genero)
	{
		Customer cliente =  new Customer();
		cliente.id = id;
		cliente.nombre = nombre;
		cliente.genero = genero;
	}
	public void  getInstance(String placa,String cilindraje,String marca,String color,String transmicion,int numpuestos,String VIP){
		Abstract_car fcar = Customer.getFactory(VIP);
		Cars_interface car = fcar.getcar(placa, cilindraje,marca, color, transmicion, numpuestos, VIP);
		
		
		car.delivery(30);
		
	    if(VIP.equalsIgnoreCase("VIP")) {
	    	valorHora = 80000;
	    }else if(VIP.equalsIgnoreCase("no VIP"))
	    {
	    	valorHora = 100000;
	    }
	    
	    if(cilindraje.equalsIgnoreCase("Bajo")&&(numpuestos == 4)){
	        System.out.println("El valor por hora es "+valorHora);

	     }else if(cilindraje.equalsIgnoreCase("Alto")&&(numpuestos < 3 )&&(transmicion.equalsIgnoreCase("Automatica"))){
	    	 System.out.println("El valor por hora es "+valorHora*3);
	         
	     }else if(cilindraje.equalsIgnoreCase("Alto")&&(numpuestos <= 4 )&&(transmicion.equalsIgnoreCase("Manual"))){
	    	 System.out.println("El valor por hora es "+valorHora*2);

	     }
	    
	   
	}


}
