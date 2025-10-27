public class ContadorLetras {


public void Contar(String texto ){
    texto=texto.toUpperCase();
    int vocales=0, consonates=0;

    for (int i=0;i<texto.length();i++) {
        char c = texto.charAt(i);

        if (c >= 'A' && c <= 'Z') {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vocales++;
            }else
                    consonates++;
                }
            }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonates);
        }
    }