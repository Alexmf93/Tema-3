import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc =new Scanner(System.in);
        System.out.println("Digame la nota de matematicas ");
        double m = sc.nextDouble();
        System.out.println("Digame la nota de lengua ");
        double l = sc.nextDouble();
        System.out.println("Digame la nota de quimica ");
        double q = sc.nextDouble();
        System.out.println("Digame la nota de fisica ");
        double f = sc.nextDouble();
        System.out.println("Digame la nota de historia ");
        double h = sc.nextDouble();
        double promedio = ((m+l+q+f+h)/5);

        if((m<0 || l<0 || q<0 || f<0 || h<0) || (m>100 || l>100 || q>100 || f>100 || h>100) || (promedio>100)){
            System.out.println("ERROR");
        }
        else{
            if (90<=promedio && promedio<=100) {
                System.out.println("Su calificacion es A ");
            }else if (80<=promedio && promedio<=89) {
                System.out.println("Su calificacion es B ");
            }else if (70<=promedio && promedio<=79) {
                System.out.println("Su calificacion es C ");
            }else if (60<=promedio && promedio<=69) {
                System.out.println("Su calificacion es D ");
            } else if (promedio<60) {
                System.out.println("Su calificacion es F ");
            }
        }
    }
}