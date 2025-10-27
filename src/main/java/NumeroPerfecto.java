public class NumeroPerfecto {
    public void verificar(int num) {

        int suma = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma == num) {
            System.out.println("El numero " + num + " es perfecto.");
        } else {
            System.out.println("El numero " + num + " no es perfecto.");
        }
    }
}
