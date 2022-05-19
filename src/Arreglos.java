public class Arreglos {
    public static void main(String[] args) {
        // Declaramos el arreglo:
        int a[] = new int[9];

        //Poblamos el arreglo:
        a[0] = 99;
        a[1] = 79;
        a[2] = 13;
        a[3] = 45;
        a[4] = 22;

        //Mostramos el arreglo por consola:
        //        for (int valores : a) {
        //            System.out.println(valores);
        //        }
        //        System.out.println(a[5]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println("á, é, í");
        }
    }
}
