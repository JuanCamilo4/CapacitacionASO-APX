import java.util.Scanner;

public class Ejercicio15 {

    Scanner read = new Scanner(System.in);

    public void simularCajero(){
        int opcionCajero = 1;
        double saldo = 1000;

        while (opcionCajero != 0) {
            System.out.println("Qué acción desea realizar en el cajero \n" +
                    "1 -> Ingresar dinero a la cuenta \n" +
                    "2 -> Retirar dinero de la cuenta \n" +
                    "0 -> Salir");
            opcionCajero = read.nextInt();
            switch (opcionCajero) {
                case 1:
                    System.out.println("Cuanto dinero va a ingresar");
                    saldo += read.nextInt();
                    System.out.println("Su cuenta ahora tiene "+saldo);
                    break;
                case 2:
                    System.out.println("Cuanto dinero va a retirar");
                    saldo -= read.nextInt();
                    System.out.println("Su cuenta ahora tiene "+saldo);
                    break;
            }
        }
    }

}
