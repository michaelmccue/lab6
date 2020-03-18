import java.util.Scanner;
public class NumericConversion {

        public static long hexStringDecode(String hex) {
            long count = 0;

// this looks at the start of the hex string for 0x or 0X //
        if (hex.startsWith("0x") || hex.startsWith("0X"))
            hex = hex.substring(2); // this takes the hex string that comes after 0x or 0X //
    int charCount = hex.length();

    for (int z = 0, m = charCount - 1; z < charCount; z++, m--) {
    char digit = hex.charAt(z);
    short decimalHex = hexCharDecode(digit); // this is the hex digit as a decimal value //
            count = count + decimalHex * (long)Math.pow(16, m); // this adds (decimalHex * 16m) to count //
    }
        return count;
   }
                 // this is the hex digit as a decimal value //
    // did it work?? //
        public static short hexCharDecode(char digit) {
    short count = 0;
        if (digit == '0')
            count = 0;
        else if (digit == '1')
            count = 1;
        else if (digit == '2')
            count = 2;
        else if (digit == '3')
            count = 3;
        else if (digit == '4')
            count = 4;
        else if (digit == '5')
            count = 5;
        else if (digit == '6')
            count = 6;
        else if (digit == '7')
            count = 7;
        else if (digit == '8')
            count = 8;
        else if (digit == '9')
            count = 9;
        else if (digit == 'A'|| digit == 'a')
            count = 10;
        else if (digit == 'B'|| digit == 'b')
            count = 11;
        else if (digit == 'C'||digit == 'c')
            count = 12;
        else if (digit == 'D'||digit == 'd')
            count = 13;
        else if (digit == 'E'||digit == 'e')
            count = 14;
        else if (digit == 'F'||digit == 'f')
            count = 15;
        return count;
    }

        public static short binaryStringDecode(String binary) {
    short count = 0;
    int value = 0;
        if (binary.startsWith("0b") || binary.startsWith("0B"))
             binary = binary.substring(2);
    int charCount = binary.length();

    for (int z = 0, m = charCount - 1; z < charCount; z++, m--) {
    char digit = binary.charAt(z);
    short decimalHex = (short)((int)digit - 48);
             value = value + (short)(decimalHex * Math.pow(2, m));
        }
        count = (short)value;
    return count;
    }

         public static void binaryToHex(String binary) {
    // Did not attempt EC //
    }

    public static void main(String[] args) {

    int userChoice;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Decoding Menu");
        System.out.println("-------------");
        System.out.println("1. Decode hexadecimal");
        System.out.println("2. Decode binary");
        System.out.println("3. Convert binary to hexadecimal");
        System.out.println("4. Quit");
        System.out.print("Please enter an option: ");
        userChoice = sc.nextInt();
    switch (userChoice) {
        case 1:
    System.out.print("Please enter the numeric string to convert: ");
    String hex = sc.next();
    System.out.println("Result: " + hexStringDecode(hex));
        break;
        case 2:
    System.out.print("Please enter the numeric string to convert: ");
    String binary = sc.next();
    System.out.println("Result: " + binaryStringDecode(binary));
        break;
        case 3:
// Did not attempt extra credit //
        break;
        case 4:
    sc.close();
        break;
        }
    }
    while (userChoice != 4);
    System.out.println("Goodbye!");
    }

}