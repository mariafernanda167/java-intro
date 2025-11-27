import java.util.Locale;
import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("dame un numero");
        double num1 = sc.nextDouble();

        System.out.println( "dame el segundo numero");
        double num2 = sc.nextDouble();

        double resultado = num1 + num2;
        System.out.println("la suma es"+ resultado);
        sc.close(); 

    }
}
