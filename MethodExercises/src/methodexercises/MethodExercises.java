package methodexercises;

public class MethodExercises {

    public static boolean contains(int[] a, int x) {
        int[] array = {2, 3, 4};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;

    }

    public static boolean containRec(int[] a, int x) {
        int[] array = {2, 3, 4};
        int count = 0;

        if (array[count++] == x) {
            return true;
//            if (array.equals(x)) {
//                return true;
//            }
        }

        return false;
    }

    public static boolean isPalindrome(char[] s, int index) {

        char[] temp = {'l', 'a', 'v', 'a', 'l'};

        if (index < s.length) {
            if (s[index] == s[s.length - 1 - index]) {
                return isPalindrome(s, index + 1);
            } else {
                return false;
            }
        }
        return true;

    }

    public static boolean isPalindrome(String str) {

        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);

        if(str.length() == 0 || str.length() == 1){
            return false;
        }
        if(start == end){
            return isPalindrome(str.substring(1, end));
        }
        
        return true;

    }

    public static void main(String[] args) {
        
        String temp = "hannah";
        System.out.println(isPalindrome(temp, 0));

//        char[] temp = {'l', 'a', 'v', 'a', 'k'};
//        System.out.println(isPalindrome(temp, 0));

    }

}
