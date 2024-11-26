/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodos2;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA3_4_METODOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mayor de 8 y 7 =" + buscarMayor(8,7));
        System.out.println(diaSemana(1));
                
                
                
    }
    //determinar el mayor de dos numeros
   public static int buscarMayor(int num1,int num2){
       if(num1>num2){
           return num1;
          
       }else{
           return num2;
           
       }
   }
   // Determinar el dia de la semana
     public static String diaSemana(int dia){
         switch(dia){
             case 1:
             return "Lunes";
             case 2:
             return "Martes";
             case 3:
             return "Miercoles";
             case 4:
             return "jueves";
             case 5:
             return "Viernes";
             case 6:
             return "Sabado";
             case 7:
             return "Domingo";
             default:
                 return"dia invalido";
         }
         
         
         
         
         
     }
}
