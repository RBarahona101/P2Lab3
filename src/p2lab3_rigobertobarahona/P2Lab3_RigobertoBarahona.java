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
            System.out.println("2) Listar Characters");
            System.out.println("3) Modificar Characters");
            System.out.println("4) Remove Character");
            System.out.println("5) Combat Simulator");
            System.out.println("6) Salir");
            System.out.print("Ingresar Opcion: ");
            int opcion = lea.nextInt();
            switch(opcion){
                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = lea.next();
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
                    int HP = 0;
                    int AC = 0;
                    int CS = 0;
                    switch (opcion2){
                        case 1: {
                           raza = "Mediano";
                           HP = 50 + r.nextInt(10);
                           break;
                        }
                        case 2: {
                            raza = "Enano";
                            HP = 80 + r.nextInt(20);
                            break;
                        }
                        case 3: {
                            raza = "Elfo";
                            HP = 50 + r.nextInt(20);
                            break;
                        }
                        case 4: {
                            raza = "Humano";
                            HP = 45 + r.nextInt(30);
                            break;
                        }
                        default: {
                            System.out.println("Es pendejo");
                            pendejo1 = true;
                            break;
                        }
                    }
                    System.out.print("Estatura: ");
                    double height = lea.nextDouble();
                    System.out.print("Peso: ");
                    double peso = lea.nextDouble();
                    System.out.print("Edad: ");
                    int edad = lea.nextInt();
                    System.out.print("Descripcion: ");
                    String description = lea.next();
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
                        boolean pendejo3 = false;
                        switch (opcion4){
                            case 1: {
                                System.out.print("Experiencia: ");
                                int exp = lea.nextInt();
                                CS = 93;
                                AC = 65;
                                String arma = "";
                                System.out.println("1) Pesada");
                                System.out.println("2) Ligera");
                                System.out.println("3) Escudo");
                                System.out.print("Eligir Arma: ");
                                int opcion5 = lea.nextInt();
                                switch(opcion5){
                                    case 1: {
                                        arma = "Pesada";
                                        break;
                                    }
                                    case 2: {
                                        arma = "Ligera";
                                        break;
                                    }
                                    case 3: {
                                        arma = "Escudo";
                                        break;
                                    }
                                    default: {
                                        System.out.println("Es Rependejo");
                                        pendejo3 = true;
                                        break;
                                    }
                                }
                                if (pendejo3 == false){
                                    System.out.println("1) Lead");
                                    System.out.println("2) Support");
                                    System.out.println("3) Offensive");
                                    String Pclass = "";
                                    System.out.print("Eligir subClase: ");
                                    int opcion6 = lea.nextInt();
                                    switch(opcion6){
                                        case 1: {
                                            Pclass = "Lead";
                                            personajes.add( new Barbaro (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, arma, exp ) );
                                            break;
                                        }
                                        case 2: {
                                            Pclass = "Support";
                                            personajes.add( new Barbaro (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, arma, exp ) );
                                            break;
                                        }
                                        case 3: {
                                            Pclass = "Offensive";
                                            personajes.add( new Barbaro (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, arma, exp ) );
                                            break;
                                        }
                                        default: {
                                            System.out.println("Lo Odio");
                                            break;
                                        }
                                    }
                                }else {
                                    System.out.println("Lo detesto");
                                }
                                break;
                            }
                            case 2: {
                                CS = 97;
                                AC = 40;
                                System.out.print("Dios/Diablo principal: ");
                                String deity = lea.next();
                                System.out.print("Tipo de Invocacion: ");
                                String invocation = lea.next();
                                String Pclass = "Lead";
                                personajes.add( new Clerigo (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, deity, invocation ) );
                                break;
                            }
                            case 3: {
                                CS = 101;
                                AC = 20;
                                System.out.println("1) Magia Blanca");
                                System.out.println("2) Magia Negra");
                                System.out.println("3) Magia Sanadora");
                                System.out.print("Seleccionar Opcion: ");
                                int opcion5 = lea.nextInt();
                                String magia = "";
                                switch (opcion5){
                                    case 1: {
                                        magia = "Magia Blanca";
                                        break;
                                    }
                                    case 2 :{
                                        magia = "Magia Negra";
                                        break;
                                    }
                                    case 3: {
                                        magia = "Magia Sanadora";
                                        break;
                                    }
                                    default : {
                                        System.out.println("Sos Rependojo");
                                        pendejo3 = true;
                                        break;
                                    }
                                }
                                if (pendejo3 == false){
                                    String Pclass = "";
                                    System.out.println("1) Support");
                                    System.out.println("2) Tank");
                                    System.out.print("Eligir SubClase: ");
                                    int opcion6 = lea.nextInt();
                                    if (opcion6 == 1){
                                        Pclass = "Support";
                                        personajes.add( new Mago (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, magia) );
                                    } else if (opcion6 == 2){
                                        Pclass = "Tank";
                                        personajes.add( new Mago (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, magia) );
                                    } else{
                                        System.out.println("Lo detesto");
                                    }
                                }
                                break;
                            }
                            case 4: {
                                CS = 80;
                                AC = 50;
                                System.out.print("Heists Exitosos: ");
                                int heists = lea.nextInt();
                                String instrumento = "";
                                System.out.println("1) Amuleto");
                                System.out.println("2) Arma");
                                System.out.println("3) Piedra Antigua");
                                System.out.print("Eligir instrumento: ");
                                int opcion5 = lea.nextInt();
                                switch(opcion5){
                                    case 1: {
                                        instrumento = "Amuleto";
                                        break;
                                    }
                                    case 2: {
                                        instrumento = "Arma";
                                        break;
                                    }
                                    case 3: {
                                        instrumento = "Piedra Antigua";
                                        break;
                                    }
                                    default: {
                                        System.out.println("Es pendejo");
                                        pendejo3 = true;
                                    }
                                }
                                if (pendejo3 == false){
                                    String Pclass = "";
                                    System.out.println("1) Spammer");
                                    System.out.println("2) Tank");
                                    System.out.print("Eligir SubClase: ");
                                    int opcion6 = lea.nextInt();
                                    if (opcion6 == 1){
                                        Pclass = "Spammer";
                                        personajes.add( new Picaro (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, instrumento, heists) );
                                    }else if (opcion6 == 2){
                                        Pclass = "Tank";
                                        personajes.add( new Picaro (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, instrumento, heists) );
                                    }
                                    else {
                                        System.out.println("Lo Odio");
                                    }
                                }
                            }
                        }
                    } else{
                        System.out.println("No merece hacer un personaje");
                    }
                    break;
                }
                case 2 : {
                    String salida = "";
                    for(Object temp: personajes){
                        if(temp instanceof Personaje){
                            salida += personajes.indexOf(temp) + " - " + temp + "\n";
                        }
                    }
                    System.out.println(salida);  
                    break;
                }
                case 3: {
                    
                    break;
                }
                case 4: {
                    if (personajes.isEmpty() ){
                        System.out.println("No hay nadie");
                    }else{
                        String salida = "";
                        for(Object temp: personajes){
                            if(temp instanceof Personaje){
                                salida += personajes.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);  
                        System.out.print("Indice a remover: ");
                        int indice = lea.nextInt();
                        personajes.remove(indice);
                        System.out.println("Se ha removido exitosamente");
                    }
                    break;
                }
            }
        }
    }
    
}
