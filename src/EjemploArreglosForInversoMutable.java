import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kinston Pendrive 64GB", "Sansung Galaxy",
                "Disco Duro SSD Sansung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generacion",
                "Bicicleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos);
//        arregloInverso(productos);

        Collections.reverse(Arrays.asList(productos)); //API de la coleccion de Java

        System.out.println("============usando for =================");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}