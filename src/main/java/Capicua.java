public class Capicua {

    public void verificar(String texto){
        texto=texto.toLowerCase();
        boolean esCapicua=true;

        for(int i=0;i<texto.length() /2; i++){
            if (texto.charAt(i) != texto.charAt(texto.length() -1 -i)){
                esCapicua=false;
                break;
            }
        }
        if (esCapicua){
            System.out.println("El texto es capicua.");
        } else {
            System.out.println("El texto no es capicua.");
        }
    }

}
