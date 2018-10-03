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

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2, 3, 4};

        System.out.println(containRec(array, 3));
    }

}
