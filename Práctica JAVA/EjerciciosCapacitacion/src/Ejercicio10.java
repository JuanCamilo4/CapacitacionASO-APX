public class Ejercicio10 {

    public String sonPares(int num1, int num2){
        if (num1%2 == 0 && num2%2 == 0) return "Ambos son pares";
        if (num1%2 == 0 && num2%2 != 0) return "El número "+num1+" es par, pero el número "+num2+" no es par";
        if (num1%2 != 0 && num2%2 == 0) return "El número "+num2+" es par, pero el número "+num1+" no es par";
        return "Ninguno es par";
    }

}
