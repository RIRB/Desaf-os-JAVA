package desafios;
import java.util.Scanner;
public class ReservasPC {
    public static void main(String[]args){
        Scanner ciber = new Scanner(System.in);
        
        int[] pc = {0,0,0,0,0,0,0,0,0,0};
        int operar;
        int acum_1=0;
        int acum_2=0;
        int reserva=0;
        int libre=0;
            
        System.out.println("--PC OPEN--");
        for(int i=0; i<10; i++){
            System.out.println("-------------------------------");
            System.out.println("Seleccione la opcion deseada\n"
                + "--"+(i+1)+"--"    
                + "\n"    
                + "1.-Reservar un PC\n"
                + "2.-Liberar  un PC\n"
                + "3.-Cerrar.\n"
                + "4.-Mostrar Estados de los PC:");
            System.out.println("-------------------------------");
            System.out.println("Presione la Operacion a Realizar: ");
            System.out.println("-------------------------------");            
            operar= ciber.nextInt();
        
        switch (operar){
            case 1:
                if (operar == 1){
                    System.out.println("RESERVAR");
                    System.out.println("Que PC desea Reservar");
                    pc[i]= ciber.nextInt();
                }
                    reserva += pc[i];
                break;
            case 2:
                if (operar == 2){
                    System.out.println("LIBERAR");
                    System.out.println("Que PC desea Liberar");
                    pc[i]= ciber.nextInt();
                }
                    libre += pc[i];
                break;
            case 3:    
                if (operar == 3 || operar <=0){
                    System.out.println("CERRAR eh IRSE");     
                }
                break;
            case 4:
                 if (operar == 4){
                    System.out.println("--ESTADOS SERVICIOS PC--");
                    acum_1 += reserva;
                    System.out.println("Los PC Reservados son: "+acum_1);
                    acum_2 += libre;
                    System.out.println("Los PC Liberados  son: "+acum_2);
                break;
                }
            }   
        }
    }
}