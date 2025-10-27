import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se crean los objetos de cada clase
        InversorTexto inversorTexto = new InversorTexto();
        InversorNumero inversorNumero = new InversorNumero();
        ContadorLetras contadorLetras = new ContadorLetras();
        NumeroPalindromo numeroPalindromo = new NumeroPalindromo();
        NumeroPerfecto numeroPerfecto = new NumeroPerfecto();
        Factorial factorial = new Factorial();
        Capicua capicua = new Capicua();
        SerieFibonacci fibonacci = new SerieFibonacci();

        int opcion;

        // Menú repetitivo hasta que el usuario decida salir
        do {
            System.out.println("\n===== MENÚ DE EJERCICIOS JAVA =====");
            System.out.println("1. Invertir texto");
            System.out.println("2. Invertir número");
            System.out.println("3. Contar vocales y consonantes");
            System.out.println("4. Verificar número palíndromo");
            System.out.println("5. Verificar número perfecto");
            System.out.println("6. Calcular factorial");
            System.out.println("7. Verificar palabra o número capicúa");
            System.out.println("8. Generar serie Fibonacci");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer del Enter

            switch (opcion) {
                case 1:
                    System.out.print("Escribe un texto: ");
                    String texto = sc.nextLine();
                    System.out.println("Texto invertido: " + inversorTexto.InvertirTexto(texto));
                    break;

                case 2:
                    System.out.print("Escribe un número entero: ");
                    int numero = sc.nextInt();
                    System.out.println("Número invertido: " + inversorNumero.InvertirNumero(numero));
                    break;

                case 3:
                    System.out.print("Escribe una palabra o frase: ");
                    String frase = sc.nextLine();
                    contadorLetras.Contar(frase);
                    break;

                case 4:
                    System.out.print("Introduce un número: ");
                    int n1 = sc.nextInt();
                    numeroPalindromo.verificar(n1);
                    break;

                case 5:
                    System.out.print("Introduce un número: ");
                    int n2 = sc.nextInt();
                    numeroPerfecto.verificar(n2);
                    break;

                case 6:
                    System.out.print("Introduce un número: ");
                    int n3 = sc.nextInt();
                    factorial.Calcular(n3);
                    break;

                case 7:
                    System.out.print("Introduce una palabra o número: ");
                    String entrada = sc.nextLine();
                    capicua.verificar(entrada);
                    break;

                case 8:
                    System.out.print("Introduce el límite: ");
                    int limite = sc.nextInt();
                    fibonacci.verificar(limite);
                    break;

                case 9:
                    System.out.println("Saliendo... 👋");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}