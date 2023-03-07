import javax.swing.*;

class Data {
    //nombre de variables no definidas con lo solicitado
    // no mete las variables del mismo tipo dedato en una sola linea de codigo(no simplifica)
        String n;
        String a;
        String pNum;
//parameterized constructor
    public Data(String n, String a, String p) {
    	
         this.n = n;
		 this.a = a;
		 this.pNum = p;
       }
    
//method for displaying person record on GUI 
    
    public void print( ) {
          JOptionPane.showMessageDialog(null, "Name: " + n + "\n Address: " +a + "\n phone no: " + pNum);
    }
   
}