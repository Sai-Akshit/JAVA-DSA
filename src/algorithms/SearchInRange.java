package algorithms;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "akshit";
        char target = 'z';
        boolean ans = searchString(name, target, 2, 5);
        System.out.println(ans);
    }
    static boolean searchString(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        //if we do not find the target character
        return false;
    }
}
