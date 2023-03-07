import javax.swing.*;

class Test {

   public static void main (String args[])
   {
        //Items itObj = new Items();//se modifica la variable itObj para identificar que es para llamar las funciones 
        Items functionObj = new Items();
        String input;
        int sInt;//
    while (true)
    {
       //puede parsear la variable input sin nececidad de utilizar una variable SInt
       input = JOptionPane.showInputDialog("Enter 1 To Add Record  \n Enter 2 To Search Record \n Enter 3 To Delete Record \n Enter 4 To Modify Record \n Enter 5 To Display All Records \n Enter 6 to Exit");
       sInt = Integer.parseInt(input);
      
// el switch no tiene un try ni catch para poder evitar que al cancelar una opcion el programa no termine.
        switch (sInt) {
        
            case 1:
            functionObj.addRecord();//se modifica la variable
                   break;
                   
            case 2:
            functionObj.searchRecord();//se modifica la variable
                   break;
                   //termina el programa al cancelar una funcion
            case 3:
            functionObj.deleteRecord();//se modifica la variable
                   break;
                   
            case 4:
            	
            functionObj.modifyRecord();//se modifica la variable
                break;
                
            case 5:
                
            functionObj.allRecord();//se modifica la variable
                break;
                
            case 6:
                   System.exit(0);
        }
    }//end while
   }// end of main
}// end of class