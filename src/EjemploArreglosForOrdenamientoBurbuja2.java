import java.util.Arrays;
import java.util.Collections;
import java.lang.String;

public class EjemploArreglosForOrdenamientoBurbuja2 {

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

    public static void sortBurbuja(Object[] arreglo) {

        int total = arreglo.length;

        int contador = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if( ((Comparable) arreglo[i + 1]).compareTo(arreglo[j]) < 0 ) {
                    Object auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kinston Pendrive 64GB", "Sansung Galaxy",
                "Disco Duro SSD Sansung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generacion",
                "Bicicleta Oxford"};

        int total = productos.length;

        sortBurbuja(productos);
        System.out.println("============usando for =================");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;  // asignando valores
        numeros[1] = Integer.valueOf("7"); // lo convierte a  int
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);

        }
    }
}