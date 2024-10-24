import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame sus ingresos ");
        double ingresos = sc.nextDouble();
        System.out.println("Digame cuantos dependientes tiene ");
        int dependientes = sc.nextInt();

        //Indico los descuentos que se aplican segun ingresos

        if (ingresos<20000 && dependientes>3) {
            System.out.println("No se le aplica impuestos");
        }else if (ingresos<20000) {
            System.out.println("Se le aplica un 5% de impuestos ");
        } else if ((ingresos>=20000 && ingresos<=40000) && (dependientes>3)) {
            System.out.println("Se le aplica un 5% de impuestos con descuento");
        } else if (ingresos>=20000 && ingresos<=40000) {
            System.out.println("Se le aplica un 10% de impuestos");
        } else if ((ingresos>40000 && ingresos<=80000) &&(dependientes>3)) {
            System.out.println("Se le aplica un 10% de impuestos ");
        } else if (ingresos>40000 && ingresos<=80000) {
            System.out.println("Se le aplica un 20% de impuestos");
        } else if ((ingresos>80000) && (dependientes>3)) {
            System.out.println("Se le aplica un 30% de impuestos");
        }
    }
}