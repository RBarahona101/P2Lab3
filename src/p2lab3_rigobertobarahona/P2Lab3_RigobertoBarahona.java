package p2lab3_rigobertobarahona;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class P2Lab3_RigobertoBarahona {
    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Personaje> personajes = new ArrayList();
        while (flag == true){
            System.out.println("1) Add Character");
            
            System.out.print("Ingresar Opcion: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    System.out.print("Nombre: ");
                    String Nombre = lea.nextLine();
                    Scanner lea = new Scanner(System.in);
                    boolean pendejo1 = false;
                    boolean pendejo2 = false;
                    System.out.println("1) Mediano");
                    System.out.println("2) Enano");
                    System.out.println("3) Elfo");
                    System.out.println("4) Humano");
                    System.out.print("Eligir Raza: ");
                    String raza = "";
                    int opcion2 = lea.nextInt();
                    switch (opcion2){
                        case 1: {
                           raza = "Mediano";
                           break;
                        }
                        case 2: {
                            raza = "Enano";
                            break;
                        }
                        case 3: {
                            raza = "Elfo";
                            break;
                        }
                        case 4: {
                            raza = "Humano";
                            break;
                        }
                        default: {
                            System.out.println("Es pendejo");
                            pendejo1 = true;
                            break;
                        }
                    }
                    System.out.print("Estatura: ");
                    double estatura = lea.nextDouble();
                    System.out.print("Peso: ");
                    double peso = lea.nextDouble();
                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    System.out.print("Descripcion: ");
                    String description = lea.nextLine();
                    System.out.println("1) Norfair");
                    System.out.println("2) Brinstar");
                    System.out.println("3) Maridia");
                    System.out.println("4) Zebes");
                    System.out.println("5) Crateria");
                    String nacionalidad = "";
                    System.out.print("Eligir Ciudad: ");
                    int opcion3 = lea.nextInt();
                    switch (opcion3){
                        case 1: {
                            nacionalidad = "Norfair";
                            break;
                        }
                        case 2: {
                            nacionalidad = "Brinstar";
                            break;
                        }
                        case 3: {
                            nacionalidad = "Maridia";
                            break;
                        }
                        case 4: {
                            nacionalidad = "Zebes";
                            break;
                        }
                        case 5: {
                            nacionalidad = "Crateria";
                            break;
                        }
                        default : {
                            System.out.println("Es Pendejo");
                            pendejo2 = true;
                            break;
                        }
                    }
                    if (pendejo1 == false && pendejo2 == false){
                        System.out.println("1) Barbaro");
                        System.out.println("2) Clerigo");
                        System.out.println("3) Mago");
                        System.out.println("4) Picaro");
                        System.out.print("Eligir clase: ");
                        int opcion4 = lea.nextInt();
                        switch (opcion4){
                            case 1: {
                                System.out.print("Experiencia: ");
                                int exp = lea.nextInt();
                                System.out.println("1) Pesada");
                                System.out.println("2) Ligera");
                                System.out.println("3) Escudo");
                                System.out.print("Eligir Arma: ");
                                int opcion5 = lea.nextInt();
                                switch(opcion)
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
    
}
