import java.util.Scanner;

public class Ejercicio17 {

    Scanner read = new Scanner(System.in);

    public void calcularRaiz(){
        double numero = 0;
        while(numero >= 0){
            System.out.println("Coloque un número mayor o igual a 0");
            numero = read.nextInt();
            if (numero < 0) break;
            System.out.println(Math.sqrt(numero));
        }
    }

}
