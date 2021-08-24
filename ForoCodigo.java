//generar códigos al azar con 3 posibilidades 
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class ForoCodigo{
	public static void main(String args[]){
													
		ArrayList claves=new ArrayList();

		while(claves.size()<=27){
			String combo=args[azar()]+args[azar()]+args[azar()];
			
			if(!claves.contains(combo)){
				
				System.out.println(combo);
				claves.add(combo);
				
				
			}
		}
													
		//System.out.println(args[0]+args[1]+args[2]);
						
		
													
	}
	
	public static int azar(){
		int num;
		do{
			num=(int)(Math.random()*10);
			
		}while(num>2);
		
		return num;
	}
}
	