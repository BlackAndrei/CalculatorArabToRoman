import java.util.Scanner;

public class RomanToArab {  public static int n1, n2,n3, sum, result;
    public static String r1, r2;
    static char operation;
    public static String pervak, convTRome;
    public static String rom1, rom2;
    public static char znak;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите выражение.Пример: 1 + 10(с пробелом). Калькулятор принимает числа от 1 до 10."); //не смог осилить полностью split.
        String primer = scan.nextLine();
        String[] chisla = primer.split(" ");
        for (int i = 0; i < chisla.length; i++) {
            n1 = Integer.parseInt(chisla[0]);
            n2 = Integer.parseInt(chisla[2]);}


        String znak = chisla[1];
        if (znak.equals("+")) {
            char znak1 = znak.charAt(0);
            operation = '+';
        }
        if (znak.equals("-")) {
            char znak1 = znak.charAt(0);
            operation = '-';
        }
        if (znak.equals("/")) {
            char znak1 = znak.charAt(0);
            operation = '/';
        }
        if (znak.equals("*")) {
            char znak1 = znak.charAt(0);
            operation = '*';
        }
        switch (operation) {
            case '+':
                result = (n1 + n2);
                break;
            case '-':
                result = (n1 - n2);
                break;
            case '/':
                result = (n1 / n2);
                break;
            case '*':
                result = (n1 * n2);
                break;
        }
        if (n1 < 1 || n2 < 1){result = 0; System.out.println("Одно или два числа меньше 1.");}
        if (n1 > 10 || n2 > 10){result = 0; System.out.println(" Одно или два числа больше 10.");}
        else {
            System.out.println(result); }
    }

}
