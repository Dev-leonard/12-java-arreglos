import java.util.Arrays;

public class EjemploArregloForInverso {
    public static void main(String[] args) {

//        String[] productos = new String[7];

        String[] productos = {"Kinston Pendrive 64GB", "Sansung Galaxy",
                "Disco Duro SSD Sansung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generacion",
                "Bicicleta Oxford"};

        int total = productos.length;// contador de longitud del array

/*        productos[0] = "Kinston Pendrive 64GB";
        productos[1] = "Sansung Galaxy";
        productos[2] = "Disco Duro SSD Sansung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";*/

        Arrays.sort(productos); // ordena en forma ascendente
        System.out.println("============usando for =================");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


        System.out.println("============usando for inverso =================");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }


        System.out.println("============usando for inverso 2 =================");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i " + i + " valor: " + productos[i]);
        }
    }
}