import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Ejercicio 1");

        Operacion multiplicacion = (a, b) -> a * b;
        System.out.println("La múltiplicación de los números es: " + multiplicacion.multiplicar(5, 3));

        System.out.println("Ejercicio 2");

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


        System.out.println("Ejercicio 3");
        System.out.println("Ingresa por favor la palabra seleccionada para convertirla");

        Scanner scanner = new Scanner(System.in);
        String ingresaPalabra = scanner.next();

        Mayuscula resultado = m -> m.toUpperCase();
        System.out.println(resultado.mayuscula(ingresaPalabra));

        System.out.println("Ejercicio 4");
        System.out.println("Ingresa la palabra a verificar por favor");
        String palabraVerifica = scanner.next();

        Palindromo verificadorPalabra = p -> p.equals(new StringBuilder(palabraVerifica).reverse().toString());

        System.out.println(verificadorPalabra.palindromo(palabraVerifica));

        System.out.println("Ejercicio 5");

        List<Integer> numeros = Arrays.asList(4, 7, 8, 2, 8);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);


        System.out.println("Ejercicio 6");
        ArrayList<String> listaOrdena = new ArrayList<>();
        System.out.println("Ingresa las palabras que deseas ordenar en orden alfabético");


        while (listaOrdena.size() < 5) {
            String palabrasAOrdenar = scanner.next();
            listaOrdena.add(palabrasAOrdenar);
            listaOrdena.sort((a, b) -> a.compareTo(b));
        }
        listaOrdena.forEach(s -> System.out.println("-" + s));


        System.out.println("Ejercicio 7");




//        6 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.
//import java.util.*;
//
//public class LambdaExercises {
//    public static void main(String[] args) {
//        List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana");
//        nomes.sort((a, b) -> a.compareTo(b));
//        System.out.println(nomes);  // Resultado: [Ana, João, Lucas, Maria]
//    }
//}
//        7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.
//interface Divisor {
//    int dividir(int a, int b) throws ArithmeticException;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Divisor divisor = (a, b) -> {
//            if (b == 0) throw new ArithmeticException("Divisão por zero");
//            return a / b;
//        };
//
//        try {
//            System.out.println(divisor.dividir(10, 2)); // Esperado: 5
//            System.out.println(divisor.dividir(10, 0)); // Esperado: Exceção
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

    }
}