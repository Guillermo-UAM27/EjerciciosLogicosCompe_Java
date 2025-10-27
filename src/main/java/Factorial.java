public class Factorial {
    public void Calcular (int n){
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;

        }
        System.out.println("El factorial de " + n + " es: " + resultado);

    }

}
