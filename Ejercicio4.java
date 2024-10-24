import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el dia ");
        int dia = sc.nextInt();
        System.out.println("Digame el mes (1-12) ");
        int mes = sc.nextInt();
        System.out.println("Digame el año ");
        int año = sc.nextInt();

        //Valido los meses del 1 al 12
         if (mes<1 || mes>12){
             System.out.println("El mes no es valido ");
         }else {

         //Valido los meses según los dias que tenga el mes
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia < 0 || dia > 32) {
                    System.out.println("La fecha es invalida ");
                } else {
                    System.out.println("La fecha es: " + dia + "/" + mes + "/" + año);
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia < 0 || dia > 31) {
                    System.out.println("La fecha es invalida ");
                } else {
                    System.out.println("La fecha es " + dia + "/" + mes + "/" + año);
                }
                break;
            case 2:
                if (dia < 0 || dia > 29) {
                    System.out.println("La fecha es invalida");
                } else if (dia == 29) {
                    System.out.println("La fecha es " + dia + "/" + mes + "/" + año + "  su año es bisiesto");

                } else {
                    System.out.println("La fecha es " + dia + "/" + mes + "/" + año);
                }
                break;
        }
        }
    }
}
