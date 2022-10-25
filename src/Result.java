import java.util.List;

public class Result {

    public static List<Integer> calculation(int maxDigit) {

        maxDigit = 9999;

        for(int menorDigito = 1000; menorDigito <= maxDigit; menorDigito ++);

        {
            String number = String.valueOf(menorDigito);
            char [] digits = number.toCharArray();

            int valorZero = Integer.parseInt(String.valueOf(digits [0]));
            int valorUm = Integer.parseInt(String.valueOf(digits [1]));
            int valorDois = Integer.parseInt(String.valueOf(digits [2]));
            int valorTrês = Integer.parseInt(String.valueOf(digits [3]));

            int somaTotal = valorZero + valorUm + valorDois + valorTrês;

            if(somaTotal == 21) {
                System.out.println(menorDigito);
            }
        }
    }


}
