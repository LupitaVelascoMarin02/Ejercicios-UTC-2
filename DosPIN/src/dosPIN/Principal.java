package dosPIN;

import javax.swing.*; 
import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		
		String pin = JOptionPane.showInputDialog("Ingresa el Pin correcto que sea de 4 digitos");
		
		String Pinob;
		
		if(Numerico(pin)) {
			
			if(pin.length() != 4) {
				
				JOptionPane.showMessageDialog(null, "No son 4 digitos, verifica");
				
			}else{
				Pinob = obtenerPin();
				
				if(pin.equals(Pinob)) {
					
					JOptionPane.showMessageDialog(null, "Pin correcto, tarea realizada correctamente"
							+ "\nPin de Usuario: " + pin
							+ "\nPin Correcto: " + Pinob);
				}else{
					
					JOptionPane.showMessageDialog(null, "Pin incorecto, tarea no realizada"
							+ "\nPin de Usuario: " + pin
							+ "\nPin Correcto: " + Pinob);
				}
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null, "No son numeros, ingresa solo numeros");
		}
	}
	
	public static boolean Numerico(String numcad) {
		
		try{
			Integer.parseInt(numcad);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
		
	}
	
	public static int[] CrearPin() {
		
	    Random rando = new Random();
	    int[] randoArray = {10,10,10,10};

	    for(int i=0;i<randoArray.length;i++){
	        int temp = rando.nextInt(9);
	        while(temp == randoArray[0] || temp == randoArray[1] || temp == randoArray[2] || temp == randoArray[3]){
	            temp=rando.nextInt(9);
	        }
	        randoArray[i]=temp;      
	    }
	    
	    return randoArray;
	    
	}
	
	public static String obtenerPin(){
	    String pino="";
	    int obte;
	    for(int i=0;i<4;i++){
	    	obte = (int)(Math.random()*10);
	    	pino+= obte;
	    }
	    return pino;
	}

}
