public class Ejercicio3 {

    public Ejercicio3(){ }

    public double sumarCantidades(double nDolares) {
        double totalJuan = nDolares/2;
        double totalLucas = (3*nDolares)/4;
        System.out.println(nDolares);
        System.out.println(totalJuan);
        System.out.println(totalLucas);
        return nDolares+totalJuan+totalLucas;
    }

}

