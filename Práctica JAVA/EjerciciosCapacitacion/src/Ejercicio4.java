public class Ejercicio4 {

    public Ejercicio4(){ }

    public double calcularSalario(double[] carrosVendidos){
        double salarioTotal = 1000 + (150*carrosVendidos.length);
        for (double i: carrosVendidos) {
            salarioTotal += (i * 0.05);
        }
        return salarioTotal;
    }

}
