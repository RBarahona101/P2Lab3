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
        personajes.add( new Barbaro ( 35, "Conan", "Humano", "Zebes", 2.08, 65.5, "El Barbarico", 65, 93, 75, "Offensive", "Pesada", 999) );
        personajes.add( new Picaro( 18, "Melfina", "Elfo", "Maridia", 1.92, 36.6, "Un Desastre", 50, 80, 70, "Spammer", "Arma", 999) );
        personajes.add( new Clerigo ( 70, "Ghonorr", "Mediano", "Norfair", 1.56, 50.4, "Gris", 40, 97, 55, "Lead", "Barbelos", "Bien Cool") );
        personajes.add( new Mago ( 15, "Lydia", "Elfo", "Brinstar", 1.88, 28.8, "Nerd", 20, 101, 68, "Support", "Magia Negra" ) ); 
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
                                String invocacion = lea.next();
                                String Pclass = "Lead";
                                personajes.add( new Clerigo (edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass, deity, invocacion ) );
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
                    if (personajes.isEmpty() ){
                        System.out.println("No Hay Nadie");
                    }else{
                        String salida = "";
                        for(Object temp: personajes){
                            if(temp instanceof Personaje){
                                salida += personajes.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);  
                    }
                    break;
                }
                case 3: {
                    if (personajes.isEmpty() ){
                        System.out.println("No Hay Nadie");
                    }else{
                        String salida = "";
                        for(Object temp: personajes){
                            if(temp instanceof Personaje){
                                salida += personajes.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);  
                        System.out.println("Indice a Modificar: ");
                        int indice = lea.nextInt();
                        System.out.println("1) Datos Generales");
                        System.out.println("2) Datos de Clase");
                        System.out.print("Ingrese que modificar: ");
                        int opcion2 = lea.nextInt();
                        switch(opcion2){
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
                                int opcion3 = lea.nextInt();
                                int HP = 0;
                                switch (opcion3) {
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
                                int opcion4 = lea.nextInt();
                                switch (opcion4) {
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
                                    default: {
                                        System.out.println("Es Pendejo");
                                        pendejo2 = true;
                                        break;
                                    }
                                }
                                if (pendejo1 == false && pendejo2 == false){
                                    personajes.get(indice).setNombre(nombre);
                                    personajes.get(indice).setRaza(raza);
                                    personajes.get(indice).setEdad(edad);
                                    personajes.get(indice).setNacionalidad(nacionalidad);
                                    personajes.get(indice).setHeight(height);
                                    personajes.get(indice).setPeso(peso);
                                    personajes.get(indice).setHP(HP);
                                    System.out.println("Modificacion Exitosa");
                                }else{
                                    System.out.println("Nope por pendejo");
                                }
                                break;
                            }
                            case 2: {
                                if( personajes.get(indice) instanceof Barbaro){
                                    System.out.print("Experiencia: ");
                                    int exp = lea.nextInt();
                                    boolean pendejo3 = false;
                                    String arma = "";
                                    System.out.println("1) Pesada");
                                    System.out.println("2) Ligera");
                                    System.out.println("3) Escudo");
                                    System.out.print("Eligir Arma: ");
                                    int opcion5 = lea.nextInt();
                                    switch (opcion5) {
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
                                    if (pendejo3 == false) {
                                        System.out.println("1) Lead");
                                        System.out.println("2) Support");
                                        System.out.println("3) Offensive");
                                        String Pclass = "";
                                        System.out.print("Eligir subClase: ");
                                        int opcion6 = lea.nextInt();
                                        switch (opcion6) {
                                            case 1: {
                                                Pclass = "Lead";
                                                personajes.get(indice).setPclass(Pclass);
                                                ((Barbaro) personajes.get(indice)).setArma(arma);
                                                ((Barbaro) personajes.get(indice)).setExp(exp);
                                                System.out.println("Modificacion Exitosa");
                                                break;
                                            }
                                            case 2: {
                                                Pclass = "Support";
                                                personajes.get(indice).setPclass(Pclass);
                                                ((Barbaro) personajes.get(indice)).setArma(arma);
                                                ((Barbaro) personajes.get(indice)).setExp(exp);
                                                System.out.println("Modificacion Exitosa");

                                                break;
                                            }
                                            case 3: {
                                                Pclass = "Offensive";
                                                personajes.get(indice).setPclass(Pclass);
                                                ((Barbaro) personajes.get(indice)).setArma(arma);
                                                ((Barbaro) personajes.get(indice)).setExp(exp);
                                                System.out.println("Modificacion Exitosa");
                                                break;
                                            }
                                            default: {
                                                System.out.println("Lo Odio");
                                                break;
                                            }
                                        }
                                    } else {
                                        System.out.println("Lo detesto");
                                    }
                                }else if (personajes.get(indice) instanceof Clerigo){
                                    System.out.print("Dios/Diablo principal: ");
                                    String deity = lea.next();
                                    System.out.print("Tipo de Invocacion: ");
                                    String invocacion = lea.next();
                                    String Pclass = "Lead";
                                    ( (Clerigo) personajes.get(indice) ).setDeity(deity);
                                    ( (Clerigo) personajes.get(indice) ).setInvocacion(invocacion);
                                    System.out.println("Modificacion Exitosa");
                                } else if (personajes.get(indice) instanceof Mago) {
                                    boolean pendejo3 = false;
                                    System.out.println("1) Magia Blanca");
                                    System.out.println("2) Magia Negra");
                                    System.out.println("3) Magia Sanadora");
                                    System.out.print("Seleccionar Opcion: ");
                                    int opcion5 = lea.nextInt();
                                    String magia = "";
                                    switch (opcion5) {
                                        case 1: {
                                            magia = "Magia Blanca";
                                            break;
                                        }
                                        case 2: {
                                            magia = "Magia Negra";
                                            break;
                                        }
                                        case 3: {
                                            magia = "Magia Sanadora";
                                            break;
                                        }
                                        default: {
                                            System.out.println("Sos Rependojo");
                                            pendejo3 = true;
                                            break;
                                        }
                                    }
                                    if (pendejo3 == false) {
                                        String Pclass = "";
                                        System.out.println("1) Support");
                                        System.out.println("2) Tank");
                                        System.out.print("Eligir SubClase: ");
                                        int opcion6 = lea.nextInt();
                                        if (opcion6 == 1) {
                                            Pclass = "Support";
                                            ( (Mago) personajes.get(indice) ).setMagia(magia);
                                            personajes.get(indice).setPclass(Pclass);
                                            System.out.println("Modificacion Exitosa");
                                        } else if (opcion6 == 2) {
                                            Pclass = "Tank";
                                            ( (Mago) personajes.get(indice) ).setMagia(magia);
                                            personajes.get(indice).setPclass(Pclass);
                                            System.out.println("Modificacion Exitosa");
                                        } else {
                                            System.out.println("Lo detesto");
                                        }
                                    }
                                }else{
                                     System.out.print("Heists Exitosos: ");
                                    int heists = lea.nextInt();
                                    String instrumento = "";
                                    boolean pendejo3 = false;
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
                                        if (opcion6 == 1) {
                                            Pclass = "Spammer";
                                            personajes.get(indice).setPclass(Pclass);
                                            ( (Picaro) personajes.get(indice) ).setHeists(heists);
                                            ( (Picaro) personajes.get(indice) ).setInstrumento(instrumento);
                                        } else if (opcion6 == 2) {
                                            Pclass = "Tank";
                                            personajes.get(indice).setPclass(Pclass);
                                            ( (Picaro) personajes.get(indice) ).setHeists(heists);
                                            ( (Picaro) personajes.get(indice) ).setInstrumento(instrumento);
                                        } else {
                                            System.out.println("Lo Odio");
                                        }
                                    }
                                }
                                break;
                            }
                            default: {
                                System.out.println("Lo detesto");
                                break;
                            }
                        }
                    }
                    break;                    
                }
                case 4: {
                    if (personajes.isEmpty()) {
                        System.out.println("No Hay Nadie");
                    } else {
                        String salida = "";
                        for (Object temp : personajes) {
                            if (temp instanceof Personaje) {
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
                case 5: {
                    if (personajes.size() < 2) {
                        System.out.println("No hay suficientes personajes");
                    } else {
                        String salida = "";
                        for (Object temp : personajes) {
                            if (temp instanceof Personaje) {
                                salida += personajes.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                        System.out.print("Personaje de Jugador 1: ");
                        int indice1 = lea.nextInt();
                        ArrayList<Personaje> combate = new ArrayList();
                        combate.add(personajes.get(indice1));
                        boolean pendejo = true;
                        while (pendejo == true) {
                            System.out.println("Personaje de Jugador 2 (No hay mirror matches): ");
                            int indice2 = lea.nextInt();
                            if (indice2 == indice1){
                                System.out.println("No habra mirror matches");
                            }else{
                                pendejo = false;
                                combate.add(personajes.get(indice2) );
                            }
                        }
                        int turno = 1;
                        boolean duel = true;
                        System.out.println(combate.get(0).getNombre() + " vs " + combate.get(1).getNombre() );
                        double cCS1 = combate.get(0).getCS();
                        double cHP1 = combate.get(0).getHP();
                        double cAC1 = combate.get(0).getAC();
                        double cCS2 = combate.get(1).getCS();
                        double cHP2 = combate.get(1).getHP();
                        double cAC2 = combate.get(1).getAC();
                        
                        if (combate.get(0).getPclass().equals("Lead") ){
                            double crit = cCS1 * 0.05;
                            cCS1 = cCS1 + crit;
                        } else if (combate.get(0).getPclass().equals("Support") ){
                            double crit = cCS1 * 0.02;
                            cCS1 = cCS1 + crit;  
                        } else if (combate.get(0).getPclass().equals("Spammer") ){
                            double crit = cCS1 * 0.01;
                            cCS1 =  cCS1 - crit;
                        }else if (combate.get(0).getPclass().equals("Offensive") ){
                            double hp = cHP1 * 0.01;
                            cHP1 = cHP1 - hp;
                        }
                        // Seperacion
                        if (combate.get(1).getPclass().equals("Lead") ){
                            double crit = cCS2 * 0.05;
                            cCS2 = cCS2 + crit;
                        } else if (combate.get(1).getPclass().equals("Support") ){
                            double crit = cCS2 * 0.02;
                            cCS2 = cCS2 + crit;  
                        } else if (combate.get(1).getPclass().equals("Spammer") ){
                            double crit = cCS2 * 0.01;
                            cCS2 =  cCS2 - crit;
                        }else if (combate.get(1).getPclass().equals("Offensive") ){
                            double hp = cHP2 * 0.01;
                            cHP2 = cHP2 - hp;
                        }
                        // Base Values
                        double Crit1 = cCS1;
                        double Crit2 = cCS2; 
                        double AC1 = cAC1;
                        double AC2 = cAC2;
                        int cOPT1 = 0;
                        int cOPT2 = 0;
                        // Acumulativos
                        double SupportAC1 = cAC1 * 0.03;
                        double SupportAC2 = cAC2 * 0.03;
                        double SPMac1 = cAC1 * 0.02;
                        double SPMac2 = cAC2 * 0.02;                        
                        double TankHP1 = cHP1 * 0.02;
                        double TankHP2 = cHP2 * 0.02;
                        
                        while(duel == true){
                            
                            System.out.println("Turn " + turno + " ");
                            // Jugador
                            if (turno%2 != 0){
                                cAC1 = AC1;
                                if (combate.get(0).getPclass().equals("Support") ){
                                    SupportAC1 = cAC1 * 0.03;
                                    cAC1 = cAC1 + SupportAC1;
                                    SupportAC1 = SupportAC1 + SupportAC1;
                                } else if (combate.get(0).getPclass().equals("Spammer")){
                                    SPMac1 = cAC1 * 0.02;
                                    cAC1 = cAC1 + SPMac1;
                                    SPMac1 = SPMac1 + SPMac1;
                                } else if (combate.get(0).getPclass().equals("Tank") ){
                                    TankHP1 = cHP1 * 0.02;
                                    cHP1 = cHP1 + TankHP1;                                    
                                }
                                System.out.println(combate.get(0).getNombre() + " " + "\n" + "HP: " + cHP1);
                                System.out.println("1) Atacar");
                                System.out.println("2) Defender");
                                System.out.print("Seleccionar opcion: ");
                                cOPT1 = lea.nextInt();
                                
                                if (cOPT1 == 1){
                                    double DMG = r.nextInt(100);
                                    if (combate.get(0).getPclass().equals("Offensive") ){
                                        double bonus = DMG * 0.05;
                                        DMG = DMG + bonus;
                                    } else if (combate.get(0).getPclass().equals("Spammer") ){
                                        double bonus = DMG * 0.03;
                                        DMG = DMG + bonus;
                                    }
                                    if (DMG > cAC2){
                                        if (DMG > cCS1){
                                            DMG = DMG * 2;
                                            cHP2 = cHP2 - DMG;
                                        }else{
                                            cHP2 = cHP2 - DMG;
                                        }
                                        if (cHP2 <= 0){
                                            duel = false;
                                            combate.remove(1);
                                        }
                                    } else{
                                        System.out.println("Miss!");
                                    }         
                                } else if (cOPT1 == 2) {
                                    cAC1 = cAC1 + 10;
                                }else{
                                    System.out.println("You do nothing");
                                }
                                turno++;
                            // Computadora    
                            } else {
                                cAC2 = AC2;
                                if (combate.get(1).getPclass().equals("Support")) {
                                    SupportAC2 = cAC2 * 0.03;
                                    cAC2 = cAC2 + SupportAC2;
                                    SupportAC2 = SupportAC2 + SupportAC2;
                                } else if (combate.get(1).getPclass().equals("Spammer")) {
                                    SPMac2 = cAC2 * 0.02;
                                    cAC2 = cAC2 + SPMac2;
                                    SPMac2 = SPMac2 + SPMac2;
                                } else if (combate.get(1).getPclass().equals("Tank")) {
                                    TankHP2 = cHP2 * 0.02;
                                    cHP2 = cHP2 + TankHP2;
                                }
                                System.out.println(combate.get(1).getNombre() + " " + "\n" + "HP: " + cHP2);
                                cOPT2 = r.nextInt(2);
                                if (cOPT2 == 1) {
                                    double DMG = r.nextInt(100);
                                    if (combate.get(1).getPclass().equals("Offensive")) {
                                        double bonus = DMG * 0.05;
                                        DMG = DMG + bonus;
                                    } else if (combate.get(1).getPclass().equals("Spammer")) {
                                        double bonus = DMG * 0.03;
                                        DMG = DMG + bonus;
                                    }
                                    if (DMG > cAC1) {
                                        if (DMG > cCS2) {
                                            DMG = DMG * 2;
                                            cHP1 = cHP1 - DMG;
                                        } else {
                                            cHP1 = cHP1 - DMG;
                                        }
                                        if (cHP1 <= 0) {
                                            duel = false;
                                            combate.remove(0);
                                        }
                                    } else {
                                        System.out.println("Miss!");
                                    }
                                } else if (cOPT2 == 2) {
                                    cAC2 = cAC2 + 10;
                                } else {
                                    System.out.println("You do nothing");
                                }
                                turno++;
                            }
                        }
                        System.out.println(combate.get(0).getNombre() + " ha Ganado el duelo!");
                    }
                    break;
                }
                default: {
                    flag = false;
                    break;
                }
            }
        }
    }

}
