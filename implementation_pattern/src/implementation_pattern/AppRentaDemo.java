package implementation_pattern;

public class AppRentaDemo {
    public static void main(String[] args) 
    {
    	AppRentaCar carro = new AppRentaCar();
    	carro.getInstance("FTP-987","Alto","BMW","Amarillo","Automatica",2,"VIP");
    	carro.getInstance("FTP-987","Alto","Renault","Amarillo","Manual",4,"No VIP");
    	carro.getInstance("FTP-987","Bajo","TOYOTA","Amarillo","Automatica",4,"VIP");
    	
    	AppRentaCar usuario = new AppRentaCar();
    	usuario.getUser("1232344211", "Pepito Perez", "Masculino");
    	usuario.getUser("1232355211", "Maria Perez", "Femenino");
    	usuario.getUser("2312344211", "Miguel Aguirre", "Masculino");

    	AppRentaCar factura = new AppRentaCar();
    	factura.setFacture(123, "27/08/2018", "30/08/2018");
    	factura.setFacture(213, "29/08/2018", "10/09/2018");
    	factura.setFacture(345, "30/08/2018", "15/09/2018");

    }

}
