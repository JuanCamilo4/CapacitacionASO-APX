import java.util.Scanner;

public class Ejercicio8 {

    Scanner read = new Scanner(System.in);

    public String esMayuscula(){
        System.out.println("Ingrese una letra");
        String letra = read.next();
        return (letra == letra.toUpperCase()) ? "La letra "+letra+" es mayuscula" : "La letra "+letra+" es minuscula";
    }

}
