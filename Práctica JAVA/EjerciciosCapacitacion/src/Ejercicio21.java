import java.util.Scanner;

public class Ejercicio21 {

    Scanner read = new Scanner(System.in);

    public void indicador(){
        int numero = 1;
        int suma = 0;
        while(numero != 0){
            System.out.println("Colocar un número");
            numero = read.nextInt();
            if (numero == 0) break;
            suma += numero;
        }
        System.out.println("La suma de todos los números es "+suma);
    }

}
