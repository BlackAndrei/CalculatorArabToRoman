import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int n1, n2;
    public static char operation;
    public static int result;
    public static String znak1;
    public static String Rom1;
    public static String l;
    public static int i;
    public static String rom;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числовое выражение в формате 2 + 2, или I + II");
        String sc = scan.nextLine();
        String sc1 = sc.trim();
        String[] stroka = sc1.split(" ");
        for (int i = 0; i < stroka.length; i++) {
            try {
                znak1 = stroka[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
            }
            char znak = znak1.charAt(0);
            if (znak == ('+')) {
                operation = '+';
            } else if (znak == ('-')) {
                operation = '-';
            } else if (znak == ('/')) {
                operation = '/';
            } else if (znak == ('*')) {
                operation = '*';
            } else {
                throw new Exception("Неверный знак операции");
            }
        }
        String Roman1 = stroka[0].strip();
        String Roman2 = stroka[2].strip();
        String Arabic = stroka[0].trim();
        String Arabic2 = stroka[2].trim();
        try {
            int Arabic3 = Integer.parseInt(Arabic);
            int Arabic4 = Integer.parseInt(Arabic2);
        } catch (NumberFormatException e){throw new Exception("2123");}
        if (Roman1.equals("I") || Roman1.equals("II") || Roman1.equals("III") || Roman1.equals("IV") || Roman1.equals("V") || Roman1.equals("VI") || Roman1.equals("VII") || Roman1.equals("VIII") || Roman1.equals("IX") || Roman1.equals("X") ||
                (Roman2.equals("I") || Roman2.equals("II") || Roman2.equals("III") || Roman2.equals("IV") || Roman2.equals("V") || Roman2.equals("VI") || Roman2.equals("VII") || Roman2.equals("VIII") || Roman2.equals("IX") || Roman2.equals("X")))
        {

            n1 = NumRoman(stroka[0].strip());
            n2 = NumRoman(stroka[2].strip());
            result = calcul(n1, n2, operation);
            System.out.println("Rome");
            String Rom1 = ConvRoman(result);
            System.out.println(Roman1 + " " + operation + " " + Roman2 + " " + "=" + " " + Rom1);}
        else if (Arabic.equals("1") || Arabic.equals("2") || Arabic.equals("3") || Arabic.equals("4") || Arabic.equals("5") || Arabic.equals("6") || Arabic.equals("7") || Arabic.equals("8") || Arabic.equals("9") || Arabic.equals("10") ||
                (Arabic2.equals("1") || Arabic2.equals("2") || Arabic2.equals("3") || Arabic2.equals("4") || Arabic2.equals("5") || Arabic2.equals("6") || Arabic2.equals("7") || Arabic2.equals("8") || Arabic2.equals("9") || Arabic2.equals("10"))) {
            {
                n1 = Integer.parseInt(Arabic);
                n2 = Integer.parseInt(Arabic2);
                System.out.println("Arabic");
                result = calcul(n1, n2, operation);
                System.out.println(n1 + " " + operation + " " + n2 + " " + "=" + " " + result);
            }
        }
            else {throw new Exception("error");}


        }


    private static String ConvRoman(int nArab) {

        String[] roman = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
                "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
                "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        final String l = roman[nArab];
        return l;
    }


    private static int NumRoman(String roman) {
        try{
            if (roman.equals("I")){return 1;} if (roman.equals("II")){return 2;} if(roman.equals("III")){return 3;}
            if (roman.equals("IV")){return 4;} if (roman.equals("V")){return 5;} if(roman.equals("VI")){return 6;}
            if (roman.equals("VII")){return 7;} if (roman.equals("VIII")){return 8;} if (roman.equals("IX")){return 9;} if (roman.equals("X")){return 10;}
        }catch (InputMismatchException e){throw new InputMismatchException("Вы ввели число вышедшее за пределы I-X");}
        return -1;}

    private static int calcul(int n1, int n2, char operation) {
        switch (operation) {
            case '+':
                result = (n1 + n2);
                break;
            case '-':
                result = (n1 - n2);
                if (n1> n2){throw new RuntimeException("trash");}
                break;
            case '/':
                result = (n1 / n2);
                break;
            case '*':
                result = (n1 * n2);
                break;}
        return result;
    }
}


