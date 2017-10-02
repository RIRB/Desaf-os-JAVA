package javafunda2dosemestre;
import java.util.Scanner;
public class Desafio_Tienda {
    public static void main(String[]args){
        Scanner precio = new Scanner(System.in);
       
        int compra = 0;
        int compratotal = 0;
        int puntos = 0;
        int totalpuntos = 0;
        int cambiopuntos = 0;
        int codigo = 0;
        int descuentopuntos = 0;
        int vuelto = 0;
        
        int sodas = 1000;
        int code_s = 120;
        int bebidas_alcoholicas = 1800;
        int code_ba = 140;
        int masas = 1500;
        int code_m = 160;
        int carnes_rojas = 2500;
        int code_cr = 180;
        int carnes_blancas = 3000;
        int code_cb = 200;
        int frutas = 900;
        int code_f = 220;
        int verduras = 1300;
        int code_v = 240;
        int embutidos = 2800;
        int code_e = 260;
        int lacteos = 600;
        int code_l = 280;
        int panharinas = 990;
        int code_ph = 299;
        
        int efectivo = 0;
        int n_producto;
        
        System.out.println("->Clientes a Realizar Compras:");
        int n_compras = precio.nextInt();                   
       
        if(n_compras <= 0){
            System.out.println("--No realizar Compra--");
        }
        if (n_compras > 0){
        }     
        for(int i=0; i<=n_compras; i++){
                System.out.println("->Cantidad de Productos del Cliente: ");

                int cant_productos = precio.nextInt();
                for(int j=0; j<=cant_productos; j++){
                    
                    System.out.println("");
                    do{
                    System.out.println("-->Mercaderia Accesible<--\n"
                    + "->Escoja los Productos a Comprar<-\n"
                    + "1.-SODAS\n"
                    + "2.-BEBIDAS ALCOHOLICAS\n"
                    + "3.-MASAS\n"
                    + "4.-CARNES ROJAS\n"
                    + "5.-CARNES BLANCAS\n"
                    + "6.-FRUTAS\n"
                    + "7.-VERDURAS\n"
                    + "8.-EMBUTIDOS\n"
                    + "9.-LACTEOS\n"
                    + "10.-PAN / HARINAS\n"
                    + "0.-Cancelar Compra\n"        
                    + "------------------------------");    
                    n_producto = precio.nextInt();
                    
                        System.out.println("Desea Comprar este Producto: \n"
                                + "1.- SI, Acepto la Compra: "
                                + "2.- NO, Acepto la Compra: ");
                        int aux = precio.nextInt();
                        if(aux == 1){
                            break;
                        }
                    
                    }while(true);
                    
                    System.out.println("->Ingrese los Productos: ");
                    if(n_producto==1){
                        System.out.println("->Cuantas Sodas desea llevar: ");
                        int num_productos = precio.nextInt();
                        compra = compra + (sodas * num_productos);
                        compratotal = compratotal + compra;
                        if(100 <= code_s && code_s < 200 && compra <= 10000){ 
                            puntos = codigo + (10000/100);
                        }else{
                            if(100 <= code_s && code_s < 200 && compra > 10000){
                                puntos = codigo + (10000/50);
                            }else{
                                if(200 <= codigo && codigo < 300 && compra <= 10000){
                                    puntos = codigo + (10000/50);
                                }else{   
                                    if(200 <= codigo && codigo < 300 && compra > 10000){
                                        puntos = codigo + (10000/30);
                                    }   
                                } 
                            }
                        }
                        System.out.println("Codigo: "+code_s+" y el Valor del Producto: "+sodas);                     
                    }
                    else if(n_producto==2){
                        System.out.println("->Cuantas Bebidas Alcoholicas desea llevar: ");
                        int num_productos = precio.nextInt();
                        compra = compra + (bebidas_alcoholicas * num_productos);   
                        compratotal = compratotal + compra;
                        if(100 <= code_ba && code_ba < 200 && compra <= 10000){ 
                            puntos = codigo + (10000/100);
                        }else{
                            if(100 <= code_ba && code_ba < 200 && compra > 10000){
                                puntos = codigo + (10000/50);
                            }else{
                                if(200 <= code_ba && code_ba < 300 && compra <= 10000){
                                    puntos = codigo + (10000/50);
                                }else{   
                                    if(200 <= code_ba && code_ba < 300 && compra > 10000){
                                        puntos = codigo + (10000/30);
                                    }   
                                } 
                            }
                        }
                        System.out.println("Numero de Codigo: "+code_ba+" y el Valor del Producto: "+bebidas_alcoholicas);
                    }
                    else if(n_producto==3){
                        System.out.println("->Cuantos productos en base a Masas desea llevar: ");
                        int num_productos = precio.nextInt();
                        compra = compra + (masas * num_productos);
                        compratotal = compratotal + compra;
                        if(100 <= code_m && code_m < 200 && compra <= 10000){ 
                            puntos = codigo + (10000/100);
                        }else{
                            if(100 <= code_m && code_m < 200 && compra > 10000){
                                puntos = codigo + (10000/50);
                            }else{
                                if(200 <= code_m && code_m < 300 && compra <= 10000){
                                    puntos = codigo + (10000/50);
                                }else{   
                                    if(200 <= code_m && code_m < 300 && compra > 10000){
                                        puntos = codigo + (10000/30);
                                    }   
                                } 
                            }
                        }
                        System.out.println("Numero de Codigo: "+code_m+" y el Valor del Producto: "+masas);
                    }
                    else if(n_producto==4){
                        System.out.println("->Cuantas Carnes Rojas desea llevar: ");
                        int num_productos = precio.nextInt();
                        compra = compra + (carnes_rojas * num_productos);
                        compratotal = compratotal + compra;
                        if(100 <= code_cr && code_cr < 200 && compra <= 10000){ 
                            puntos = codigo + (10000/100);
                        }else{
                            if(100 <= code_cr && code_cr < 200 && compra > 10000){
                                puntos = codigo + (10000/50);
                            }else{
                                if(200 <= code_cr && code_cr < 300 && compra <= 10000){
                                    puntos = codigo + (10000/50);
                                }else{   
                                    if(200 <= code_cr && code_cr < 300 && compra > 10000){
                                        puntos = codigo + (10000/30);
                                    }   
                                } 
                            }
                        }
                        System.out.println("Numero de Codigo: "+code_cr+" y el Valor del Producto: "+carnes_rojas);
                    } 
                    else if(n_producto==5){
                        System.out.println("->Cuantas Carnes Blancas desea llevar: ");
                        int num_productos = precio.nextInt();
                        compra = compra + (carnes_blancas * num_productos);
                        compratotal = compratotal + compra;
                        if(100 <= codigo && codigo < 200 && compra <= 10000){ 
                            puntos = codigo + (10000/100);
                        }else{
                            if(100 <= code_cb&& code_cb < 200 && compra > 10000){
                                puntos = codigo + (10000/50);
                            }else{
                                if(200 <= code_cb&& code_cb < 300 && compra <= 10000){
                                    puntos = codigo + (10000/50);
                                }else{   
                                    if(200 <= code_cb&& code_cb < 300 && compra > 10000){
                                        puntos = codigo + (10000/30);
                                    }   
                                } 
                            }
                        }
                        System.out.println("Numero de Codigo: "+code_cb+" y el Valor del Producto: "+carnes_blancas);
                        }
                        else if(n_producto==6){
                            System.out.println("->Cuantas Frutas desea llevar: ");
                            int num_productos = precio.nextInt();
                            compra = compra + (frutas * num_productos);
                            compratotal = compratotal + compra;
                            if(100 <= code_f && code_f < 200 && compra <= 10000){ 
                                puntos = codigo + (10000/100);
                            }else{
                                if(100 <= code_f && code_f < 200 && compra > 10000){
                                    puntos = codigo + (10000/50);
                                }else{
                                    if(200 <= code_f && code_f < 300 && compra <= 10000){
                                        puntos = codigo + (10000/50);
                                    }else{   
                                        if(200 <= code_f && code_f < 300 && compra > 10000){
                                            puntos = codigo + (10000/30);
                                        }   
                                    } 
                                }
                            }
                            System.out.println("Numero de Codigo: "+code_f+" y el Valor del Producto: "+frutas);
                        }
                        else if(n_producto==7){
                            System.out.println("->Cuantas Verduras desea llevar: ");
                            int num_productos = precio.nextInt();
                            compra = compra + (verduras * num_productos);
                            compratotal = compratotal + compra;
                            if(100 <= code_v && code_v < 200 && compra <= 10000){ 
                                puntos = codigo + (10000/100);
                            }else{
                                if(100 <= code_v && code_v < 200 && compra > 10000){
                                    puntos = codigo + (10000/50);
                                }else{
                                    if(200 <= code_v && code_v < 300 && compra <= 10000){
                                        puntos = codigo + (10000/50);
                                    }else{   
                                        if(200 <= code_v && code_v < 300 && compra > 10000){
                                            puntos = codigo + (10000/30);
                                        }   
                                    } 
                                }
                            }
                            System.out.println("Numero de Codigo: "+code_v+" y el Valor del Producto: "+verduras);
                        }
                        else if(n_producto==8){
                            System.out.println("->Cuantas Embutidos desea llevar: ");
                            int num_productos = precio.nextInt();
                            compra = compra + (embutidos * num_productos);
                            compratotal = compratotal + compra;
                            if(100 <= code_e && code_e < 200 && compra <= 10000){ 
                                puntos = codigo + (10000/100);
                            }else{
                                if(100 <= code_e && code_e < 200 && compra > 10000){
                                    puntos = codigo + (10000/50);
                                }else{
                                    if(200 <= code_e && code_e < 300 && compra <= 10000){
                                        puntos = codigo + (10000/50);
                                    }else{   
                                        if(200 <= code_e && code_e < 300 && compra > 10000){
                                            puntos = codigo + (10000/30);
                                        }   
                                    } 
                                }
                            }
                            System.out.println("Numero de Codigo: "+code_e+" y el Valor del Producto: "+embutidos);
                            }
                            else if(n_producto==9){
                                System.out.println("->Cuantos productos en base a Lacteos desea llevar: ");
                                int num_productos = precio.nextInt();
                                compra = compra + (lacteos * num_productos);
                                compratotal = compratotal + compra;
                                if(100 <= code_l && code_l < 200 && compra <= 10000){ 
                                    puntos = codigo + (10000/100);
                                }else{
                                    if(100 <= code_l && code_l < 200 && compra > 10000){
                                        puntos = codigo + (10000/50);
                                    }else{
                                    if(200 <= code_l && code_l < 300 && compra <= 10000){
                                        puntos = codigo + (10000/50);
                                    }else{   
                                        if(200 <= code_l && code_l < 300 && compra > 10000){
                                            puntos = codigo + (10000/30);
                                        }   
                                    } 
                                }
                            } 
                            System.out.println("Numero de Codigo: "+code_l+" y el Valor del Producto: "+lacteos);
                            }
                            else if(n_producto==10){
                                System.out.println("->Cuantos productos de tipo Pan o en base a Harinas desea llevar: ");
                                int num_productos = precio.nextInt();
                                compra = compra + (panharinas * num_productos);
                                compratotal = compratotal + compra;
                                if(100 <= code_ph && code_ph < 200 && compra <= 10000){ 
                                    puntos = puntos + (10000/100);
                                }else{
                                    if(100 <= code_ph && code_ph < 200 && compra > 10000){
                                        puntos = puntos + (10000/50);
                                    }else{
                                        if(200 <= code_ph && code_ph < 300 && compra <= 10000){
                                            puntos = puntos + (10000/50);
                                        }else{   
                                            if(200 <= code_ph && code_ph < 300 && compra > 10000){
                                                puntos = codigo + (10000/30);
                                                
                                                System.out.println("Numero de Codigo: "+code_ph+" y el Valor del Producto: "+panharinas); 
                                            }
                                            else if(n_producto == 0){
                                                System.out.println("--Para Finalizar su compra: \n"
                                                    + "---> 1.- SI: \n"
                                                    + "---> 2.- NO: ");
                                                    int si = precio.nextInt();
                                                    if (si == 1){
                                                          System.out.println("->OK, SI realizar la compra: ");   
                                                    }else{    
                                                    int no = precio.nextInt();
                                                    if(no == 2){
                                                        System.out.println("->OK, NO desea comprar este producto: ");  
                                                    }
                                                }
                                            }       
                                        }
                                    } 
                                }
                            }
            int pagar;       
            System.out.println("-----------------------------");
            System.out.println("--Cancelar la Compra--");  
            System.out.println("-----------------------------");
            System.out.println(" ");
            System.out.println("--Como Desea Cancela su Compra--");
            System.out.println("1->Desea Cancelar en Efectivo: ");
            System.out.println("2->Desea Cancelar con Puntos: ");
            System.out.println("0->Entregar Boleta");
            pagar = precio.nextInt();
             
            System.out.println(" ");
            if(pagar==1){
                System.out.println("son: "+"$"+compratotal+" a Pagar: ");
                System.out.println("Ingrese su Dinero: ");
                efectivo = precio.nextInt();
            }if(compratotal <= efectivo){
                vuelto = vuelto + (efectivo - compratotal);
            }else if(efectivo < compratotal){
                System.out.println("--NO es Posible que Complete la Compra en este Medio de Pago--");
                System.out.println("--------------Seleccione Otro Medio de Pago-------------------");
            
            }else if(pagar==2){      
                cambiopuntos = cambiopuntos + (totalpuntos * 10);
                System.out.println("seran: "+totalpuntos+" pts a Canjear: ");
                totalpuntos = totalpuntos + puntos;
                System.out.println("Puntos Acumulados en la Cuenta: ");          
                
                }if(totalpuntos <= cambiopuntos){
                System.out.println("Sus puntos combertidos son: "+"$"+cambiopuntos);
                descuentopuntos = descuentopuntos + (cambiopuntos - compratotal);
                }else if(cambiopuntos < totalpuntos){
                    System.out.println("--NO es Posible Completar la Compra con este Medio de Pago--");
                    System.out.println("--------------Seleccione Otro Medio de Pago-------------------");
               
                }else if(efectivo > compratotal && cambiopuntos < totalpuntos){
                    System.out.println("--Lo Sentimos Estimado Cliente\n"
                            + "--usted 'NO' posee El Dinero necesarion\n"
                            + "--ni Tampoco posee s Puntos necesarios para Cancelar su Compra\n"
                            + "->0.- para Cancelar Compra: ");
                }if(pagar == 0){
                    System.out.println("--Boleta Compra--");        
                    System.out.println("---------------------------\n"
                    + "Puntos Acumulados: "+totalpuntos
                    + "Puntos Tranformados a Dinero: "+cambiopuntos
                    + "Total a Pagar: "+compratotal
                    + "---------------------------"
                    + "--Su Vuelto es de: "+"$"+vuelto+"\n"
                    + "--Le Quedan: "+descuentopuntos+"pts en su Cuenta\n" 
                    + "---------------------------");
                }    
            }                                   
        } 
        System.out.println("--Gracias por Preferirnos--\n"
                + "--Esperamos que vuelva Pronto--");        
    }         
}