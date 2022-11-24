public class Ejercicio14 {

    public String colocarNota(int nota){
        if (nota >= 0 && nota <= 2) return "Insuficiente";
        if (nota == 3 || nota == 4) return "suficiente";
        if (nota == 5 || nota == 6) return "bien";
        if (nota == 7 || nota == 8) return "notable";
        if (nota == 9 || nota == 10) return "sobresaliente";
        return "La nota debe ser entre 0 y 10";
    }

}
