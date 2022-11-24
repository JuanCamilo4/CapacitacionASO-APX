public class Ejercicio12 {

    public int contarCifras(Integer numero){
        if (numero < 0 || numero > 99999) return 0;
        String strNumero = numero.toString();
        return strNumero.length();
    }

}
