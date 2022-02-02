public class AlternateCharsInString {
    public static void main(String[] args) {
        String original = "pavan";
        String alter = "";
        // char[] toArr = original.toCharArray();
        for (int i = 0; i < original.length(); i++) {
            if (i % 2 == 0) {
                alter = alter + original.charAt(i);
            }
        }

        System.out.println("alternate string: " + alter);

    }
}
