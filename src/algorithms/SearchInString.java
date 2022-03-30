package algorithms;
//we are going to search characters in string

public class SearchInString {
    public static void main(String[] args) {
        String name = "akshit";
        char target = 'r';
        boolean ans = searchString2(name, target);
        System.out.println(ans);
    }
    static boolean searchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        //if we do not find the target character
        return false;
    }

    static boolean searchString2(String str, char target) {
        for (char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
