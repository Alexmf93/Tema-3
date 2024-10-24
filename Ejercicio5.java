import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame la longitud de un lado del triangulo ");
        int lado1 = sc.nextInt();
        System.out.println("Digame la longitud del segundo lado del triangulo ");
        int lado2 = sc.nextInt();
        System.out.println("Digame la longitud del tercer lado del triangulo ");
        int lado3 = sc.nextInt();

        //Indico la clase del triangulo
        if (lado1==0 || lado2==0 || lado3==0) {
            System.out.println("No forman un triangulo");
        }else if (lado1==lado2 && lado2==lado3){
            System.out.println("Su triangulo es equilatero ");
        } else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
            System.out.println("Su triangulo es isosceles ");
        } else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("Su triangulo es escaleno");
        }
    }
}