public class InversorNumero {

    public int InvertirNumero(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        return numeroInvertido;
    }


}


