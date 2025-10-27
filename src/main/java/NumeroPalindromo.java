public class NumeroPalindromo {
    public void verificar(int num) {

        int original = num;
        int invertido = 0;


        while (num != 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        if (original == invertido) {

            System.out.println("El numero " + original + " es palindromo.");
        }else  {
            System.out.println("El numero " + original + " no es palindromo.");
        }
    }
}