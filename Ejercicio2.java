import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido! Digame que tipo de cliente es");
        String cliente = sc.nextLine();
        System.out.println("Digame el precio del producto");
        double producto = sc.nextDouble();

        //Calculo los descuentos aplicados al precio que introduzca el ususario
        double regular = producto*0.5;
        double premium = producto*0.1;
        double VIP = producto*0.2;

        //Calculo el precio final del producto
        if (cliente.equals("regular")) {
            System.out.println("El precio de su producto es" +regular);
        } else if (cliente.equals("premium")) {
            System.out.println("El precio de su producto es" +premium);
        } else if (cliente.equals("VIP")) {
            System.out.println("El precio del producto es "+VIP);
        } else {
            System.out.println("empiece de nuevo");
        }
    }
}