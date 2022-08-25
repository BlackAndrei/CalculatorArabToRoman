import java.util.Scanner;

public class Razbiv {
    public static String pervak, convTRome;
    public static int n1, n2, result;
    public static String rom1, rom2;
    public static char znak, operation;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pervak = scan.nextLine();
        String [] Rome = pervak.split(" ");
        for (int i = 0; i < Rome.length; i++) {
            String h1 = Rome[0];
            String h2 = Rome[2];
        }

        if (Rome[0].equals("I")){n1 = 1;} if (Rome[0].equals("II")){n1 = 2;} if(Rome[0].equals("III")){n1=3;}
        if (Rome[0].equals("IV")){n1=4;} if (Rome[0].equals("V")){n1=5;} if(Rome[0].equals("VI")){n1=6;}
        if (Rome[0].equals("VII")){n1=7;} if (Rome[0].equals("VIII")){n1=8;} if (Rome[0].equals("IX")){n1=9;} if (Rome[0].equals("X")){n1=10;}

        if (Rome[2].equals("I")){n2 = 1;} if (Rome[2].equals("II")){n2 = 2;} if(Rome[2].equals("III")){n2=3;}
        if (Rome[2].equals("IV")){n2=4;} if (Rome[2].equals("V")){n2=5;} if(Rome[2].equals("VI")){n2=6;}
        if (Rome[2].equals("VII")){n2=7;} if (Rome[2].equals("VIII")){n2=8;} if (Rome[2].equals("IX")){n2=9;} if (Rome[2].equals("X")){n2=10;}

        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String znak = Rome[1];
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
                convTRome = roman[result];
                znak = "+";
                break;
            case '-':
                result = (n1 - n2);
                convTRome = roman[result];
                znak = "-";
                break;
            case '/':
                result = (n1 / n2);
                convTRome = roman[result];
                znak = "/";
                break;
            case '*':
                result = (n1 * n2);
                convTRome = roman[result];
                znak = "*";
                break;
        }
         if (n1 < 0 || n2 < 0){
             System.out.println("числ");
         }


    }
    }