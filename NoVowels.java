public class NoVowels {
    public static void main(String[] args) {
        String original = "palehikotu";
        // String original = "paul";
        char[] chars = original.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if (original.charAt(i) != 'a' && original.charAt(i) != 'e' && original.charAt(i) != 'i' &&
                    original.charAt(i) != 'o' &&
                    original.charAt(i) != 'u') {
                result = result + original.charAt(i);
            }
        }

        System.out.println("NoVowels are " + result);
    }
}
