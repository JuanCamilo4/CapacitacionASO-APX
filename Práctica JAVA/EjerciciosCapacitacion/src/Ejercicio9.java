public class Ejercicio9 {

    public double aplicarDescuento(double valorCompra){
        double descuento = 0;
        if (valorCompra >= 300) descuento = valorCompra*0.2;
        return valorCompra-descuento;
    }

}
