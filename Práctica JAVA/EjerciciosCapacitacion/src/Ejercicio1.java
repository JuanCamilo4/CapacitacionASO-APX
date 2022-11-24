/*
    Suma de tres calificaciones
*/
import java.util.Scanner;

public class Ejercicio1 {

    Scanner read = new Scanner(System.in);

    public Ejercicio1(){ }

    public int sumarCalificaciones(){
        System.out.println("Inserte 3 calificaciones a continuación");
        int rating1 = read.nextInt();
        int rating2 = read.nextInt();
        int rating3 = read.nextInt();
        int suma = rating1 + rating2 + rating3;
        return suma;
    }

}
