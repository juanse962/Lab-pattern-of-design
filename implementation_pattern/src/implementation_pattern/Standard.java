package implementation_pattern;

import java.util.Date;

public class Standard implements Cars_interface {
		int stock;
		Date fecha = new Date();
		
	    @Override
	    public void delivery(int stock) {
	        this.stock=stock;	
	        System.out.println("Carro estandar fecha y hora del arquiler "+fecha+"Stock: "+ this.stock);
	     }
}

