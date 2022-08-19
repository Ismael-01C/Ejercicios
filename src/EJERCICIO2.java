public class EJERCICIO2 {
    public static void main(String[] args) {
        //Usando los dos tipos de casting que aprendiste (implícito y explícito),
        //resuelve los siguientes casteos
        //indicando qué tipo es y si se está calculando estimación o exactitud.

        //CASTING

        //char c = ‘z’; conviertelo a int
        char c = 'z';
        int nC = c;
        System.out.println(nC);
        System.out.printf("--------------");

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long lI = i;
        System.out.println(("\n") + lI);
        System.out.printf("--------------");

        long Li = 250;
        short lS = (short) Li;
        System.out.println(("\n") + lS);
        System.out.printf("--------------");

        //double d = 301.067; conviertelo a long
        double d = 301.067;
        long lD = (long) d ;
        System.out.println(("\n") + lD);
        System.out.printf("--------------\n");

        //int i = 100; súmale 5000.66 y conviertelo a float
        int I = 100;
        float IF = 5000.66F;
        System.out.println(I+IF);
        System.out.printf("--------------\n");

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int u = 737;
        int ñ =  u * 100;
        byte b = (byte) ñ;
        System.out.println(b);
        System.out.printf("--------------\n");

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double D = 298.638;
        double m = D/25;
        long v = (long) m;
        System.out.println(v);


    }
}
