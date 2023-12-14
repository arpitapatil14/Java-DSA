public class searchinstrings {
    public static void main(String[] args) {
        String str = "Arpita";
        char target = 'r';
        System.out.println(search(str, target));
        // System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
