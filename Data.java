import javax.swing.*;

class Data {
    //nombre de variables no definidas con lo solicitado
    // no mete las variables del mismo tipo dedato en una sola linea de codigo(no simplifica)
        String name, address,phone; 
//parameterized constructor
    public Data(String name, String address, String phone) {
    	
         this.name = name;
		 this.address = address;
		 this.phone = phone;
       }
    
//method for displaying person record on GUI 
    
    public void print( ) {
          JOptionPane.showMessageDialog(null, "Name: " + name + "\n Address: " + address + "\n phone no: " + phone);
    }
   
}