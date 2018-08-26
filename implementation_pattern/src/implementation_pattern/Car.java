package implementation_pattern;
import java.util.LinkedList;
import java.util.Queue;

public class Car extends Abstract_car
{
	String placa;
	String cilindraje;
	String marca;
	String color;
	String transmicion;
	int numpuestos;
	
	
	@Override
	public Cars_interface getcar(String placa, String cilindraje, String marca, String color, String transmicion,
			int numpuestos,String VIP) {
		
	    this.placa = placa;
	    this.cilindraje = cilindraje;
	    this.marca = marca;
	    this.color = color;
	    this.transmicion= transmicion;
	    this.numpuestos= numpuestos;
	    
	    Queue<String> placas = new LinkedList();
	    Queue<String> cilindrajes = new LinkedList();
	    Queue<String> marcas = new LinkedList();
	    Queue<String> colores = new LinkedList();
	    Queue<String> transmiciones = new LinkedList();
	    Queue<Integer> numeropuestos = new LinkedList();
	    
	    placas.offer(this.placa);
	    cilindrajes.offer(this.cilindraje);
	    marcas.offer(this.marca);
	    colores.offer(this.color);
	    transmiciones.offer(this.transmicion);
	    numeropuestos.offer(this.numpuestos);
	    
	    
	    if(cilindraje.equalsIgnoreCase("Bajo")&&(numpuestos == 4)){
	        return new Family();

	     }else if(cilindraje.equalsIgnoreCase("Alto")&&(numpuestos < 3 )&&(transmicion.equalsIgnoreCase("Automatica"))){
	         return new Sport();
	     }else if(cilindraje.equalsIgnoreCase("Alto")&&(numpuestos <= 4 )&&(transmicion.equalsIgnoreCase("Manual"))){
	         return new Standard();
	     }
	    
	   
		return null;
    
	}
}

