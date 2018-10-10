
package extra1;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
          
        Scanner ler = new Scanner(System.in);
        System.out.println("radio circulo: ");
        float radio=ler.nextFloat();

        float area;
        area = (float) (Math.PI*Math.pow(radio, 2));
        float volumen;
        volumen= (float) ((4/3)*(Math.PI*Math.pow(radio, 3)));
        System.out.println("area = "+area);
        System.out.println("volumen = "+volumen);
    }
    
}
