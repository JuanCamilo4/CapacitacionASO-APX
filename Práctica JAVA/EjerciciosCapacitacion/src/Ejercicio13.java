public class Ejercicio13 {

    public boolean validarFecha(int dia, int mes, int año){
        if (dia < 1 || dia > 30) return false;
        if (mes < 1 || mes > 12) return false;
        if (año < 1 || año > 2022) return false;
        return true;
    }

}
