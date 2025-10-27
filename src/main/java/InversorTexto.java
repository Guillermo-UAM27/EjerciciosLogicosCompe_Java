public class InversorTexto {

    public String InvertirTexto(String texto) {
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido;
    }
}
