public class Main {
    public static void main(String[] args) {

        double[] carrosVendidos = {100, 200, 300};

        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();

        Ejercicio6 ejercicio6 = new Ejercicio6();
        Ejercicio7 ejercicio7 = new Ejercicio7();
        Ejercicio8 ejercicio8 = new Ejercicio8();
        Ejercicio9 ejercicio9 = new Ejercicio9();
        Ejercicio10 ejercicio10 = new Ejercicio10();
        Ejercicio11 ejercicio11 = new Ejercicio11();
        Ejercicio12 ejercicio12 = new Ejercicio12();
        Ejercicio13 ejercicio13 = new Ejercicio13();
        Ejercicio14 ejercicio14 = new Ejercicio14();
        Ejercicio15 ejercicio15 = new Ejercicio15();
        Ejercicio16 ejercicio16 = new Ejercicio16();
        Ejercicio17 ejercicio17 = new Ejercicio17();
        Ejercicio18 ejercicio18 = new Ejercicio18();
        Ejercicio19 ejercicio19 = new Ejercicio19();
        Ejercicio20 ejercicio20 = new Ejercicio20();
        Ejercicio21 ejercicio21 = new Ejercicio21();
        Ejercicio22 ejercicio22 = new Ejercicio22();
        Ejercicio23 ejercicio23 = new Ejercicio23();
        Ejercicio24 ejercicio24 = new Ejercicio24();

        Paquete paquete1 = new Paquete(1, "1004", 10);

        //System.out.println(ejercicio1.sumarCalificaciones());
        //System.out.println(ejercicio2.calcularSalario(10, 50));
        //System.out.println(ejercicio3.sumarCantidades(250));
        //System.out.println(ejercicio4.calcularSalario(carrosVendidos));
        //System.out.println(ejercicio6.esMultiplo(10));
        //System.out.println(ejercicio7.mayorMenor(4, 5));
        //System.out.println(ejercicio8.esMayuscula());
        //System.out.println(ejercicio9.aplicarDescuento(300));
        //System.out.println(ejercicio10.sonPares(9, 5));
        //ejercicio11.ordenarNumeros(2, 3, -8);
        //System.out.println(ejercicio12.contarCifras(898));
        //System.out.println(ejercicio13.validarFecha(30, 12, 2022));
        //System.out.println(ejercicio14.colocarNota(11));
        //ejercicio15.simularCajero();
        //ejercicio16.pasarUnidad();
        //ejercicio17.calcularRaiz();
        //ejercicio18.indicador();
        //ejercicio19.indicadorPar();
        //ejercicio20.juegoAdiviniar();
        //ejercicio21.indicador();
        //ejercicio22.indicador();
        //ejercicio23.contador();
        //ejercicio24.calcularProducto();

        paquete1.calcaularPrecio("normal");
        System.out.println(paquete1.getPrecio());
    }
}