package co.com.psl.kata;

public class Kata {
	
	public static int add(String numbers){
		
		
		if(numbers.equalsIgnoreCase("")){
			return 0;
		}
		else{
			String delimitador = "";
			
			if(numbers.contains("//"))
			{
				delimitador = String.valueOf(numbers.charAt(2));
				numbers = numbers.substring(4, numbers.length());
				numbers = numbers.replace(delimitador, ",");
				
			}
			else
			{
				numbers = numbers.replace("\n", ",");
			}
			
			String [] arreglo= numbers.split(",");
			
			if(arreglo.length == 1)
			{
				return Integer.valueOf(arreglo[0]); 
			}
			else
			{
				int suma = 0;
				for(int i=0; i<arreglo.length; i++)
				{
					suma = suma + Integer.valueOf(arreglo[i]);
				}
				return suma;
			}
		}
	}

}
