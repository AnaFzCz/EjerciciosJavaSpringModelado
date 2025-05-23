import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Ejercicio 1");

        Operacion multiplicacion = (a, b) -> a * b;
        System.out.println("La múltiplicación de los números es: " + multiplicacion.operacion(5, 3));
        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 2");

        Primo verifica = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        };
        verifica.verificaPrimo(13);
        System.out.println("Es primo? " + verifica.verificaPrimo(13));

        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 3");
        System.out.println("Ingresa por favor la palabra seleccionada para convertirla");

        Scanner scanner = new Scanner(System.in);
        String ingresaPalabra = scanner.next();

        Mayuscula resultado = m -> m.toUpperCase();
        System.out.println(resultado.mayuscula(ingresaPalabra));
        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 4");
        System.out.println("Ingresa la palabra a verificar por favor");
        String palabraVerifica = scanner.next();

        Palindromo verificadorPalabra = p -> p.equals(new StringBuilder(palabraVerifica).reverse().toString());

        System.out.println(verificadorPalabra.palindromo(palabraVerifica));
        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 5");

        List<Integer> numeros = Arrays.asList(4, 7, 8, 2, 8);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);

        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 6");
        ArrayList<String> listaOrdena = new ArrayList<>();
        System.out.println("Ingresa las palabras que deseas ordenar en orden alfabético");


        while (listaOrdena.size() < 5) {
            String palabrasAOrdenar = scanner.next();
            listaOrdena.add(palabrasAOrdenar);
            listaOrdena.sort((a, b) -> a.compareTo(b));
        }
        System.out.println("Lista ordenada");
        listaOrdena.forEach(s -> System.out.println("- " + s));

        System.out.println("********************************************************************");
        System.out.println("\nEjercicio 7");
        System.out.println("Ingrese dato 1: ");
        int dato1 = scanner.nextInt();
        System.out.println("Ingrese dato 2: ");
        int dato2 = scanner.nextInt();
        try {
            Operacion division = (a, b) -> a / b;
            System.out.println("La división de los números es: " + division.operacion(dato1, dato2));
        } catch (ArithmeticException e) {
            System.out.println("la división fue por cero");
        }

    }
}