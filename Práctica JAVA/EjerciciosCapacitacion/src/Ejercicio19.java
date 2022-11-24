import java.util.Scanner;

public class Ejercicio19 {

    Scanner read = new Scanner(System.in);

    public void indicadorPar(){
        double numero = 1;
        while(numero != 0){
            System.out.println("Colocar un número");
            numero = read.nextDouble();
            if (numero == 0) break;
            if (numero % 2 == 0) System.out.println("El número "+numero+" es par");
            else System.out.println("El número "+numero+" no es par");
        }
    }

}
