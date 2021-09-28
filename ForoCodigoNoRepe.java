//By bilenkos lab
//generar códigos al azar con 3 posibilidades SIN repetición
//otra linea de codigo
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class ForoCodigoNoRepe{
	static int un=1,dos=1,tres=1;
	
	public static void main(String args[]){
		
						
		ArrayList claves=new ArrayList();

		while(claves.size()<6){
			azar();
			String combo=args[un]+args[dos]+args[tres];
			
			if(!claves.contains(combo)){
				
				System.out.println(combo);
				claves.add(combo);
				
				
			}
		}
													
		
						
		
													
	}
	
	public static void azar(){
		
		do{
			un=(int)(Math.random()*10);
			dos=(int)(Math.random()*10);
			tres=(int)(Math.random()*10);
			
		}while(un==dos || dos==tres || tres==un || un>2 || dos>2 || tres>2);
		
		
	}
}
	
