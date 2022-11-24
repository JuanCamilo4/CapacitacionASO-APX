import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio16 {

    Scanner read = new Scanner(System.in);

    public void pasarUnidad(){
        Map<String, Double> unidades = new HashMap<>();
        unidades.put("tonelada", 0.001);
        unidades.put("gramo", 1000.0);
        unidades.put("miligramo", 1000000.0);
        unidades.put("microgramo", 1000000000.0);
        unidades.put("libra", 2.20462);
        unidades.put("onza", 35.274);

        System.out.println("Coloque la cantidad en kilogramos");
        double kilos = read.nextDouble();
        System.out.println("A qué unidad desea pasar \n" +
                "1 -> Tonelada \n" +
                "2 -> Gramo \n" +
                "3 -> Miligramo \n" +
                "4 -> Microgramo \n" +
                "5 -> Libra \n" +
                "6 -> Onza \n" +
                "0 -> Salir");
        int opcionMenu = read.nextInt();

        switch (opcionMenu){
            case 1:
                kilos *= unidades.get("tonelada");
                break;
            case 2:
                kilos *= unidades.get("gramo");
                break;
            case 3:
                kilos *= unidades.get("miligramo");
                break;
            case 4:
                kilos *= unidades.get("microgramo");
                break;
            case 5:
                kilos *= unidades.get("libra");
                break;
            case 6:
                kilos *= unidades.get("onza");
                break;
        }
        System.out.println(kilos);
    }

}
