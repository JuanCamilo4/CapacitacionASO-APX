import java.util.Arrays;

public class Ejercicio11 {

    public void ordenarNumeros(int num1, int num2, int num3){
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        for (int i: numeros){
            System.out.print(i + " ");
        }
    }

}
