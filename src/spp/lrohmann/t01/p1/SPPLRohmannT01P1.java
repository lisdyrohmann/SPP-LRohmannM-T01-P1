/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmann.t01.p1;
import java.util.Scanner;

/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Lisdy Nadine Rohmann Martínez 513659
      //Carrera: IIS
      //Problema 1
      
        double mat, cal1, cal2, cal3, cal4,cal5, pro;
        Scanner Sc= new Scanner(System.in);
        
        System.out.println("¿Cuál es tu matrícula?");
        mat= Sc.nextDouble();
        System.out.println("Escribe tu Calificación 1");
        cal1= Sc.nextDouble();
        System.out.println("Escribe tu Calificación 2");
        cal2=Sc.nextDouble();
        System.out.println("Escribe tu Calificación 3");
        cal3=Sc.nextDouble();
        System.out.println("Escribe tu Calificación 4");
        cal4=Sc.nextDouble();
        System.out.println("Escribe tu calificación 5");
        cal5= Sc.nextDouble();
        
        
        pro=((cal1+cal2+cal3+cal4+cal5/5));
        System.out.println("Tu promedio es:"+pro);
        
        
        if (pro<7.0)
            System.out.println("Reprobado");
        else if (pro>6.9)
            System.out.println("Aprobado");
        
    }
    
}
