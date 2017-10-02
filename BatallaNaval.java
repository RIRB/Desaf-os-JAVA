package desafios;

import java.util.Scanner;

import java.util.*;

public class BatallaNaval {
  
    public static void main(String[]args){
        Scanner fuego = new Scanner(System.in);
             
        int cont_1 = 0;
        int cont_cpu = 0;
        
        int posicion_f2 = 0; 
        int posicion_c2 = 0;
        int posicion_f = 0; 
        int posicion_c = 0;
        
        int lado_1 [][] = new int[10][10];
        int lado_cpu [][] = new int[10][10];

        for(int i=0;i<5;i++){
            do{
            do{
                System.out.println("Elija la posicion de Fila: ");
                posicion_f = fuego.nextInt();
            }while(posicion_f < 0|| posicion_f > 9);
            do{
                System.out.println("Elija la posicion de Columna: ");
                posicion_c = fuego.nextInt();
            }while(posicion_c < 0 || posicion_c > 9);
            }while(lado_1[posicion_f][posicion_c]==1);
            lado_1[posicion_f][posicion_c]=1;
        }
        
        Random azar = new Random();
        for(int i=0; i<10; i++){
            do{
                posicion_f2 = azar.nextInt(10);
                posicion_c = azar.nextInt(10);
            }while (lado_cpu [posicion_f2] [posicion_c2] == 1);
            lado_cpu[posicion_f2][posicion_c] = 1;
        }
        
        for(int i=0; i<10; i++){
            for(int j=0 ;j<10;j ++)
                System.out.print(lado_1[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j =0;j<10;j++)
                System.out.print(lado_cpu[i][j]+"\t");
            System.out.println();
        }
        
        do{
            do{
                System.out.println("Ingrese numero de Fila");
                posicion_f = fuego.nextInt();
            }while(posicion_f < 0 || posicion_f > 9);
            do{
                System.out.println("Ingrese numero de Columna");
                posicion_c = fuego.nextInt();
            }while(posicion_c < 0 || posicion_c > 9);
            if(lado_cpu[posicion_f][posicion_c] == 1){
                System.out.println("Acabas de llevar a las profundidades un Barco Enemigo");
                cont_1++;
                lado_cpu[posicion_f][posicion_c] = 2;
            }
            else
                System.out.println("Hasta no ver el Fondo");
            
            posicion_f2 = azar.nextInt(10);
            posicion_c2 = azar.nextInt(10);
            System.out.println("Fuego del CPU "+posicion_f2+"-"+posicion_c2);
           
            if(lado_1[posicion_f2][posicion_c2] == 1){
                System.out.println("El enemigo CPU dejo en Fondo del mar tu Flota");
                cont_cpu++;
                lado_1 [posicion_f2] [posicion_c2] = 2;                
            }
            else
                System.out.println("Te ah liquidado");
        }while(cont_1 < 10 || cont_cpu < 10);
    }
}