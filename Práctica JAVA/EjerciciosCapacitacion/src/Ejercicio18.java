import java.util.Scanner;

public class Ejercicio18 {

    Scanner read = new Scanner(System.in);

    public void indicador(){
        System.out.println("Colocar un número");
        double numero = 1;
        while(numero != 0){
            numero = read.nextDouble();
            if (numero > 0) System.out.println("El número "+numero+" es positivo");
            if (numero < 0) System.out.println("El número "+numero+" es negativo");
        }
    }

}
