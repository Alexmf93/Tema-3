import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido al juego!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario 1 elija: piedra, papel, tijera, lagarto o spock?");
        String eleccion1 = sc.nextLine();
        System.out.println("Usuario 2 elija: piedra, papel, tijera, lagarto o spock?");
        String eleccion2 = sc.nextLine();

        //Desarrollo el ganador
        switch (eleccion1){
            case "tijera":
                if(eleccion2.equals("papel") || eleccion2.equals("lagarto")){
                    System.out.println("Gana el Usuario 1");
                }else if (eleccion2.equals("spock") || eleccion2.equals("piedra")) {
                    System.out.println("Gana el usuario 2");
                }
            case "piedra":
                if (eleccion2.equals("lagarto") || eleccion2.equals("tijera")) {
                    System.out.println("Gana el usuario 1");
                } else if (eleccion2.equals("papel") || eleccion2.equals("spock")) {
                    System.out.println("Gana el usuario 2");
                }
            case "papel":
                if (eleccion2.equals("piedra") || eleccion2.equals("spock")) {
                    System.out.println("Gana el usuario 1");
                } else if (eleccion2.equals("lagarto") || eleccion2.equals("tijera")) {
                    System.out.println("Gana el usuario 2");
                }
            case "spock":
                if (eleccion2.equals("tijera") || eleccion2.equals("piedra")) {
                    System.out.println("Gana el usuario 1");
                } else if (eleccion2.equals("lagarto") || eleccion2.equals("papel")) {
                    System.out.println("Gana el usuario 2");
                }
            case "lagarto":
                if (eleccion2.equals("spock") || eleccion2.equals("papel")) {
                    System.out.println("Gana el usuario 1");
                } else if (eleccion2.equals("piedra") || eleccion2.equals("tijera")) {
                    System.out.println("Gana el usuario 2");
                }
        }
    }
}