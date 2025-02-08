package Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String s = "prashanth";
        char target = 'a';
        System.out.println(search(s, target));
    }

    static boolean search(String s, char target) {
        if (s.length() == 0) {
            return false;
        }
//        for (int i = 0; i <= s.length() - 1; i++) {
//            if (target == s.charAt(i)) {
//                return true;
//            }
//        }

//        using foreach loop
        for (char c : s.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
