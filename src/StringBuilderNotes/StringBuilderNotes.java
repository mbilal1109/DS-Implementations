package StringBuilderNotes;

public class StringBuilderNotes {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bilal");

        // appending characters or strings to the original one.
        sb.append("s Blanket");
        System.out.println(sb);

        sb.append('s');
        System.out.println(sb);

        // set/replace a character at a certain index
        sb.setCharAt(5, 'e');
        System.out.println(sb);

        // insert/append but at after a certain index
        sb.insert(5, "'");
        System.out.println(sb);

        sb.setCharAt(6, 's');
        System.out.println(sb);

        // length of the string
        System.out.println(sb.length());

        // get a certain character
        System.out.println(sb.charAt(4));
    }

    // reverse a string
//    public static String reverseString(String sb) {
//        StringBuilder sb1 = new StringBuilder(sb);
//
//    }
}
