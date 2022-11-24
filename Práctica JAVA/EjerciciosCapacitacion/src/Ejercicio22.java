import java.util.Scanner;

public class Ejercicio22 {

    Scanner read = new Scanner(System.in);

    public void indicador(){
        int numero = 0;
        double suma = 0;
        double nNumeros = 0;
        while(numero >= 0){
            System.out.println("Colocar un número");
            numero = read.nextInt();
            if (numero < 0) {
                if (nNumeros == 0) nNumeros = 1;
                break;
            }
            suma += numero;
            nNumeros++;
        }
        System.out.println("El promedio de los números es: "+ (suma/nNumeros));
    }

}
