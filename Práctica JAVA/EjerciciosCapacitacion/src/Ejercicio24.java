public class Ejercicio24 {

    public void calcularProducto(){
        int producto = 1;
        for (int i = 0; i < 10; i++){
            if ((i+1)%2 != 0) producto *= (i+1);
        }
        System.out.println(producto);
    }

}
