import java.util.Scanner;

public class Ejercicio20 {

    Scanner read = new Scanner(System.in);

    public void juegoAdiviniar(){
        int numeroAleatorio = (int) Math.round(Math.random() * (100-0)+0);
        int numeroJugador = -1;
        int intentos = 0;
        while (numeroJugador != numeroAleatorio) {
            System.out.println("Coloque un número");
            numeroJugador = read.nextInt();
            if (numeroJugador > numeroAleatorio) System.out.println("El número colocado es mayor");
            else System.out.println("El número colocado es menor");
            intentos++;
        }
        System.out.println("Juego terminado: \n Números de intentos: "+intentos);
    }

}
