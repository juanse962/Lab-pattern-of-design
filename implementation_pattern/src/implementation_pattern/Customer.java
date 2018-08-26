package implementation_pattern;

public class Customer {
	String id;
	String nombre;
	String genero;
    public static Abstract_car getFactory(String category){
        if(category.equalsIgnoreCase("VIP")){
            return new Car();          
         }else if(category.equalsIgnoreCase("no VIP")){
        	 return new Car(); 
         }
         return null;
    }

}
