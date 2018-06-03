//////////////////////////////////////// Alatorre Nuño Victor Ivan ////////////////////////////////////////
// Programa que suma dos numeros en formato String (cualquier longitud) y regresa la suma en tipo String //
///////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Sumador {
	
	public static String sumar( String a, String b ) {
		String resultado="";
		int num_a, num_b, num_c;
		boolean fin_a=false, fin_b=false;
		boolean acarreo=false;
		int idx_a=a.length()-1;
		int idx_b=b.length()-1;
		
		while( !fin_a || !fin_b ){
			if( idx_a==-1 ){
				fin_a=true;
				num_a=0;
			}
			else{
				num_a=Integer.parseInt( ""+a.charAt(idx_a) );
				idx_a--;
			}
			if( idx_b==-1 ){
				fin_b=true;
				num_b=0;
			}
			else{
				num_b=Integer.parseInt( ""+b.charAt(idx_b) );
				idx_b--;
			}
			num_c=num_a+num_b;
			if( acarreo )
				num_c++;
			if( num_c>9 ){
				acarreo=true;
				num_c=num_c-10;
			}
			else
				acarreo=false;
			//if( !(num_c==0 && fin_a && fin_b) )			//condicion para eliminar el cero al principio de la cadena en el resultado
			resultado=num_c+resultado;
		}
		while(resultado.charAt(0)=='0'){		//ciclo para eliminar ceros al principio de la cadena, los cuales son resultados correctos de la operacion, pero innecesarios para el resultado final
			resultado=resultado.substring(1, resultado.length());
		}
		return resultado;
	}

	public static void main(String[] args) {
		String num1="12345";
		String num2="12345";
		System.out.println("SUMA FINAL: "+sumar( num1, num2 ));
	}

}
