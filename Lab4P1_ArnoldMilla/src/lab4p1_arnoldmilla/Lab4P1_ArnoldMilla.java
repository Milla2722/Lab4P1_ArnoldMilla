package lab4p1_arnoldmilla;
import java.util.Scanner;
//subString
public class Lab4P1_ArnoldMilla {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("1. Inversión especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("Ingrese una opción [1,2,3]");
        int op = sc.nextInt();
        while (op > 0 && op < 4){
            switch(op){
                case 1:{
                    String cadena2 = "";
                    String cadena1 = "";
                    System.out.println("-----Inversión especial-----");
                    System.out.println("Ingrese la cadena: ");
                    String cadena = sc1.nextLine();
                        for (int a = 0; a < cadena.length(); a++){
                            char character = cadena.charAt(a);
                            if ((int)cadena.charAt(a) != 32 && a != cadena.length()-1){
                                cadena1 += character;
                            } else { 
                                if (a == cadena.length()-1){
                                    cadena1 += character;
                                }
                                for(int b = cadena1.length()-1; b >= 0 ;b--){
                                    char characterfin = cadena1.charAt(b);
                                    cadena2 += characterfin;
                                }
                            cadena2 += " ";
                            cadena1 = "";   
                            }

                        }
                        System.out.println(cadena2);
                }break;//fin opcion 1
                
                case 2:{
                    sc.nextLine();
                    int cadena_1 = 0;
                    int cadena_2 = 0;
                    int cadena_3 = 0;  
                    int suma1 = 0;
                    int suma2 = 0;
                    int suma3 = 0;
                    System.out.println("------Balanza de cadenas------");
                    System.out.println("A continuación ingresara tres cadenas");
                    System.out.println("Ingrese la primer cadena");
                    String cadena1 = sc.nextLine();
                    System.out.println("Ingrese la segunda cadena");
                    String cadena2 = sc.nextLine();
                    System.out.println("Ingrese la primer cadena");
                    String cadena3 = sc.nextLine();
                        for(int a = cadena1.length()-1; a >= 0 ;a--){
                                    char c = cadena1.charAt(a);
                                    cadena_1 = c;
                                    suma1 += cadena_1;
                        }
                        for(int b = cadena2.length()-1; b >= 0 ;b--){
                                    char cha = cadena2.charAt(b);
                                    cadena_2 = cha;
                                    suma2 += cadena_2;
                        }
                        for(int c = cadena3.length()-1; c >= 0 ;c--){
                                    char character = cadena3.charAt(c);
                                    cadena_3 = character;
                                    suma3 += cadena_3;
                                    
                        }
                        System.out.println("Peso cadena 1" + suma1);
                        System.out.println("Peso cadena 1: " + suma2);
                        System.out.println("Peso cadena 1: " + suma3);
                        
                        if (suma1 > suma2 || suma1 > suma3){
                            System.out.println("La cadena 1 es más pesada");
                        }
                        if (suma2 > suma3 || suma2 > suma1){
                            System.out.println("La cadena 2 es más pesada");
                        }
                        if (suma3 > suma2 || suma3 > suma1){
                            System.out.println("La cadena 3 es más pesada");
                        }
                }break;//fin opcion 2
                
                case 3:{
                    String char2 = "";
                    System.out.println("Ingrese el mensaje que desea cifrar");
                    String cadena = sc1.nextLine();
                        for(int a = 0; a < cadena.length() ;a++){
                                    char character = cadena.charAt(a);
                                    int ascii = 0;
                                    ascii += character + 2;
                                    char2 += (char)ascii;
                                    
                        }  
                        System.out.println(char2);
                }break;//fin opcion 3
                
                case 4:{
                    System.out.println("Salío del programa");
                }break;//fin opcion 4
            }
        System.out.println("");
        System.out.println("1. Inversión especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("Ingrese otra opción [1,2,3] ingrese 4 para salir");
        op = sc.nextInt();
        }
    }
    
    
}
