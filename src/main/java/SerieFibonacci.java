public class SerieFibonacci {

    public void verificar(int limite){
        int a=0, b=1;

        System.out.println("Serie de Fibonacci : "+ a + " " + b);
        int c = a + b;

        while (c <= limite){
            System.out.print(" " + c);
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println();

    }
}
