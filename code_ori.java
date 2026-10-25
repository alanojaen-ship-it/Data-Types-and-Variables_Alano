
public class code_ori {
    public static void main(String[] args) {

        byte number = 127;
        System.out.println("===== BYTE OVERFLOW =====");
        System.out.println("Before Increment: " + number);
        number++;
        System.out.println("After Increment: " + number);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("\n===== STRING COMPARISON =====");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        System.out.println("\n===== EXPLANATION =====");
        System.out.println("Overflow: byte exceeds 127 and wraps to -128.");
        System.out.println("== compares object references.");
        System.out.println(".equals() compares String contents.");

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n===== ARRAY REFERENCE =====");
        System.out.println("Before Modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        array2[0] = 100;

        System.out.println("After Modification:");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
    }
}