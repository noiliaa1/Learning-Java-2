import java.util.Scanner;
public class noiliaa1{
    public static void main(String[] args) {
        printPrimitiveTypesInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi chislo bro (int): ");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Ti vvel ciferku int: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Mne kazhetsya ti oshibsya peredelivay int.");
        }
        System.out.println("Vvedi chislo s plavayoshou tochkou (double): ");
        String doubleInput = scanner.nextLine();
        try {
            double doubleValue = Double.parseDouble(doubleInput);
            System.out.println("KRasava ti normass vvel DoUbLe: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Nepravilniy vvod kaki double.");
        }
// Я нарешті розкладку змінив
        System.out.println("ВВеди коротке (short): ");
        String shortInput = scanner.nextLine();
        try {
            short shortValue = Short.parseShort(shortInput);
            System.out.println("ти ввів коротке short: " + shortValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправельний формат бро short.");
        }
//Ya snova pomenyal obratno haha
        System.out.println("vvedi dliiiiiinnoe chisloo (long): ");
        String longInput = scanner.nextLine();
        try {
            long longValue = Long.parseLong(longInput);
            System.out.println("KRasas)) ti vvel long: " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("Bratanchik ne pravilno long.");
        }
        System.out.println("Vvedi s tockoy plavayushey (float): ");
        String floatInput = scanner.nextLine();
        try {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("Umnica, e tebya poluchilos float: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("ne pravilno float.");
        }
        System.out.println("vVedi bukovku (char): ");
        String charInput = scanner.nextLine();
        if (charInput.length() == 1) {
            char charValue = charInput.charAt(0);
            System.out.println("ti vvel bukovke char: " + charValue);
        } else {
            System.out.println("eto ne bukovka glupiy char.");
        }
        System.out.println("vvedi booleanovoe (true/false): ");
        String booleanInput = scanner.nextLine();
        try {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Ti vvel buleanke: " + booleanValue);
        } catch (Exception e) {
            System.out.println("Chel// NU NE PRAVILNO");
        }
        scanner.close();
    }
    public static void printPrimitiveTypesInfo() {
        System.out.println("Vo infa:");

        System.out.println("int: =" + Integer.SIZE + " bit, minimalne znachennyaa = " + Integer.MIN_VALUE + ", maxmalne znachennyaa = " + Integer.MAX_VALUE);
        System.out.println("double: = " + Double.SIZE + " bit, nu eshe min znach = " + Double.MIN_VALUE + ", maxmalne znachennyaa = " + Double.MAX_VALUE);
        System.out.println("short: = " + Short.SIZE + " bit, minimalne znachennyaa = " + Short.MIN_VALUE + ", maxmalne znachennyaa = " + Short.MAX_VALUE);
        System.out.println("long: = " + Long.SIZE + " bit, minimalne znachennyaa = " + Long.MIN_VALUE + ", maxmalne znachennyaa = " + Long.MAX_VALUE);
        System.out.println("float: = " + Float.SIZE + " bit, minimalne znachennyaa = " + Float.MIN_VALUE + ", maxmalne znachennyaa = " + Float.MAX_VALUE);
        System.out.println("char: = " + Character.SIZE + " bit, minimalne znachennyaa = " + (int) Character.MIN_VALUE + ", maxmalne znachennyaa = " + (int) Character.MAX_VALUE);
        System.out.println("boolean: = true/false");
    }
}
