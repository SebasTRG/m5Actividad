
import java.util.Scanner;

public class bankAccount {

    public static void main(String[] args) {

        String nombre, usuario ;
        char eleccion;
        int contrasena, dinero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digame su nombre completo: ");
        nombre = sc.nextLine();
        System.out.print("Digame su usuario: ");
        usuario = sc.nextLine();
        System.out.print("Digame su contraseña: ");
        contrasena = sc.nextInt();
        sc.nextLine();

        if (contrasena == 1234 && usuario.equals("usuario1")) {
            System.out.println("bienvenido " + nombre);
            System.out.println("Elija una opción:\n A)sacar dinero\n B)Meter dinero\n C)salir");
            eleccion = sc.nextLine().toLowerCase().charAt(0);
            switch (eleccion) {
                case 'a':
                    System.out.println("Cuanto dinero quiere sacar de la cuenta? ");
                    dinero = sc.nextInt();
                    if (dinero > 1000) {
                        System.out.println("Ha ingresado una cantidad de dinero que usted no tiene");
                        System.out.println("Ha salido del programa");
                    } else {
                        System.out.println("Aqui tiene" + dinero + " euros");
                        System.out.println("Ha salido del programa");
                    }
                    break;
                case 'b':
                    System.out.println("Cuanto dinero quiere sacar de la cuenta: ");
                    dinero = sc.nextInt();
                    if(dinero <=0){
                        System.out.println("La cantidad introducida no es válida, tiene que introducir más de 0 euros");
                        System.out.println("Ha salido del programa");
                    }else{
                        System.out.println("Felicidades\n Ha ingresado "+dinero+" euros");
                        System.out.println("Ha salido del programa");
                    }
                    break;
                case 'c':
                    System.out.println("Ha salido del programa ");
                
            }
            

        }else{
            System.out.println("Usuario o contraseña incorrecto");
        }

    }
}
