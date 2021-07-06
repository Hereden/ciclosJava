package ciclosJava;

import java.util.Scanner;

public class CiclosJava {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		/*
		 * Ciclo for
		 * for(variable de inicializacion; condicion; incremento/decremento){
		 * 
		 * }*/
		for(int i=0;i<5;i++) {
			System.out.println(i+1);
		}
		
		int nums[]={1,2,3,4,5};
		int sum=0;
		for (int x: nums) {
			sum+=x;
		}
		System.out.println(sum);
		
		/*
		 * Crear un metodo que reciba por parametro un número y nos muestre la 
		 * tabla de multiplicar de ese número
		 * Ejemplo:
		 * 1 X 1 = 1
		 * 1 X 2 = 2
		 * 1 X 3 = 3
		 * ...
		 * 1 X 10 = 10
		 * */
		//tabla(1);
		
		/*
		 * Hacer un programa que pida un numero por teclaro
		 * Se tiene que hacer un recorrido desde 1 hasta el numero 
		 * introducido
		 * 
		 * Ejemplo:
		 * Numero introducido: 12
		 * numeros pares= 2 + 4 + 6 + 8 + 10 + 12
		 * numero impares= 1 + 3 + 5+ 7 + 9 + 11
		 * 
		 * Tiene que imprimir la suma de los numeros pares e impares*/
		
		
		System.out.println("Escriba un numero para sacar la suma de pares e impaes:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(paresEImpares(n));
		
		
		/*
		 * ciclo While
		 * while(condicion){
		 *  codigo
		 *  codigo
		 *  codigo
		 * }
		 * */
		
		
		/*
		 * Escribir un programa que pida 2 numeros por consola de manera reiterada
		 * La ejecución del programa terminara cuando los numeros ingresados sean iguales.
		 * 
		 * Nota: utilizar un ciclo while*/
		
		
		/*
		Scanner lector2= new Scanner(System.in);
		int numero1,numero2;
		boolean nosoniguales=true;
		System.out.println("Este programa pide dos numeros y se detiene cuando ambos son iguales");
		while(nosoniguales) {
			System.out.println("Ingrese el primer numero: ");
			numero1=lector2.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			numero2=lector2.nextInt();
			
			
			if(numero1==numero2) {
				System.out.println("Los numeros son iguales, el programa se finalizara ");
				nosoniguales=false;
			}else {
				System.out.println("Los numeros no son iguales ");
			}
		}*/
		
		
		
		/*
		 * Ciclo do while
		 * do{
		 *   codigo
		 *   codigo
		 *   codigo
		 *   }while(condicion)
		 *   */
		
		/*
		Scanner lector2= new Scanner(System.in);
		int numero1,numero2;
		boolean nosoniguales=true;
		System.out.println("Este programa pide dos numeros y se detiene cuando ambos son iguales");
		do {
			System.out.println("Ingrese el primer numero: ");
			numero1=lector2.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			numero2=lector2.nextInt();
			
			
			if(numero1==numero2) {
				System.out.println("Los numeros son iguales, el programa se finalizara ");
				nosoniguales=false;
			}else {
				System.out.println("Los numeros no son iguales ");
			}
			
		}while(nosoniguales);
		lector2.close();*/
	}
	
	
	
	public static void calculadoraEscrita() {
		Boolean salir=true;
		Scanner leer= new Scanner(System.in);
		float numero1,numero2;
		int opcion;
		String resultado="";
		while(salir) {
			System.out.println("Escriba el primer número:");
			numero1= leer.nextFloat();
			System.out.println("Escriba el segundo número:");
			numero2=leer.nextFloat();
			System.out.println("¿Qué operación desea realizar?:\n"+
			"1.-Sumar\n"+
			"2.-Restar\n"+
			"3.-Multiplicación\n"+
			"4.-División\n"+
			"5.-Todología\n"+
			"6.-Salir");
			opcion=leer.nextInt();
			switch(opcion){
			case 1:
				resultado="El resultado de la suma es:"+ (numero1+numero2);
				break;
			case 2:
				resultado="El resultado de la resta es:" + (numero1-numero2);
				break;
			case 3:
				resultado="El resultado de la multiplicación es:" + (numero1*numero2);
				break;
			case 4:
				resultado="El resultado de la división es:" + (numero1/numero2);
				break;
			case 5:
				resultado="Suma: " +(numero1+numero2) + " \nResta: "+ 
			              (numero1-numero2) + " \nMultiplicación: "+ 
						  (numero1*numero2) + " \nDivisión: " +
			              (numero1/numero2);
				break;
			case 6:
				resultado="Vuelva pronto.";
				salir=false;
				break;
			default:
				resultado="Opción invalida";
			}
				
			System.out.println(resultado);
		}
	}
	
	public static String paresEImpares(int numero) {
		String cadena="";
		String pares="";
		String impares="";
		int sumaI=0;
		int sumaP=0;
		for(int i=1;i<=numero;i++) {
			// i/2 = (cociente) (residuo)
			if(i%2==0) {
				
				//Otra cosa
				if((i+2)>numero) {
					pares+=i;
				}else {
					pares+=i + " + ";
				}
				
				sumaP+=i;
			}else {
				if((i+2)>numero) {
					impares+=i;
				}else {
					impares+=i + " + ";
				}
				sumaI+=i;
			}
			
		}
		cadena="Numeros pares: " + pares+"\nNumeros impares: "+impares +"\nSuma de pares:"+
				sumaP + "\nSuma de impares: "+sumaI;
		return cadena;
	}
		
	public static void tabla(int numero) {
		for(int i=1;i<11;i++) {
			System.out.println(numero + " X "+ i + " = "+ (numero*i));
		}
	}

}
