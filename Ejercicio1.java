import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame su nombre de usuario");
        String usuario = sc.nextLine();
        System.out.println("Digame su contraseña");
        String password = sc.nextLine();

        //Doy acceso al usuario
        if (usuario.equals("admin") && password.equals("1234")) {
            System.out.println("Ha accedido al sistema como Administrador");
        }else  if (usuario.equals("user") && password.equals("abcd")) {
            System.out.println("Ha accedido al sistema como usuario normal");
        }else if(usuario.equals("guest") && password.equals("xyz")) {
            System.out.println("Ha accedido al sistema como invitado");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}