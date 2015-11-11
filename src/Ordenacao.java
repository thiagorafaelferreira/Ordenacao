import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thiago Raf on 10/11/2015.
 */
public class Ordenacao {

    static Integer  valorMaximo = 500;

    public static void main(String[] args) {

        Integer posicao = 1;
        Integer result2;
        Integer result3;
        Integer soma;
        List<Integer> primos = new ArrayList<Integer>();
        List<Integer> somas = new ArrayList<Integer>();

/*        for(int i = 0; i < valorMaximo; i++) {
            if (i > 3) {
                if (i % 2 == 1 && i % 3 >= 1) {
                    result2 = (i - 2);
                    result3 = (i - 3);
                    soma = result2 + result3;
                    System.out.println((posicao++) + "[" + i + "]  " + result2 + "  " + result3 + " soma:" + soma + " " +(soma - 2) + " " +(soma - 3)   );
                }
            }
        }*/

        for (int i = 0; i < valorMaximo; i++) {
            if (i > 3 && i <= 5) {
                if (i % 2 == 1 && i % 3 >= 1) {
                    primos.add(i);
                }
            } else {
                if (i % 2 == 1 && i % 3 >= 1 && i % 5 >= 1) {
                    primos.add(i);
                }
            }
        }
        for (int a = 0; a < primos.size() - 1; a++) {
            result2 = primos.get(a + 1);
            result3 = primos.get(a);
            System.out.println(result2 + " " + result3 + " resultado:" + (result2 - result3));
        }
    }

}
