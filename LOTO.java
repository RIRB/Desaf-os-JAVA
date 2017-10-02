package desafios;
import java.util.Scanner;
public class LOTO {
    public static void main(String[] args) {
        Scanner polla = new Scanner(System.in);
        
        int numeros;
        int aciertos =0;
        int encontrado =0;
        boolean es_igual = false;
        
        System.out.println("--NUMEROS LOTO--:");
       
        int seleccion[] = new int[6];
        System.out.println("Ingrese sus Numeros Deseados: "); 
       
        for(int n=0; n<6; n++){
            System.out.println("numero escogido: "+(n+1)+" :");
            numeros = polla.nextInt();   
            if(numeros <=0 || numeros > 36){
                System.out.println(" NO puede escoger numeros fuera de el JUEGO TRADICIONAL del LOTO");
                System.out.println(" ... ");
                System.out.println("El sorteo ya fue Realizado, mejor suerte para la proxima");
            }
            break;
        }
        System.out.println("----------------------------------");
        
        System.out.println("--REALIZAR SORTEO--");       
        int bolitas[] = new int[36];
        for(int i=1; i<36; i++){
            bolitas[i]= (int)(Math.random()*35+1);
            for(int v=0; v<1; v++){
                if(bolitas[i] == bolitas[v]){
                    i--;
                }
            }
        } 
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        for(int i=0; i<6; i++){
            System.out.println("Los numeros Ganadores del loto esta semana son: "+"[ "+bolitas[i]+" ]");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        
        for(int n=0; n<6; n++){
            System.out.println("Numeros [ "+n+" ]"+seleccion[n]);
        }
 
        System.out.println("ingrese el numero a buscar: ");
        encontrado = polla.nextInt();
        for(int n=0; n<6; n++){
            if(encontrado == seleccion[n]){
                es_igual = false;
            }else if(seleccion[n] != encontrado){
                es_igual= true;
            }
        }
        if(es_igual = false){
            System.out.println("El numero "+encontrado+" Si se encuentra entre los sorteados del LOTO");
        }else if(es_igual = true){
            System.out.println("El numero "+encontrado+" No se encuentra entre los sorteados del LOTO");
        }
    }    
}