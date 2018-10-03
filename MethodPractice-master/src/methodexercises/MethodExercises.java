package methodexercises;

import java.util.Arrays;

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

    public static boolean containRec(int[] a, int count, int x) {
        int[] array = {1,2,6,4};
        
        if(count < array.length){
            if (array[count] == x) {
                return true;
        }
            else{
                return containRec(a, count+1, x);
            }
        
        }

        return false;
    }
    
    public static int maximum(int[] a){
        int[] array = {1,2,6,4};
        int high = 0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length-1; j++){
                if(array[i] > high){
                    high = array[i];
                }
            }
        }
        return high;
    }
    
    public static int maximumRec(int[] a, int count, int n){
        int[] array = {1,2,6,4};
        int high = 0;
        

        if(count <= array.length){            
            
            if(array[count] > high){
                high = array[count];
                System.out.println("high: " + high);
                return high;
                
            }
        }
        
        return maximumRec(a, count+1, n+high);
        
        
    }
    
    public static int[] reverse(int[] a){
        //int[] array = {1,2,6,4};
        int[] temp = new int [a.length];
        
        for(int i = 0; i < a.length/2; i++){
            temp[a.length] = a[i];
            a[i] = a[a.length-1];
            a[a.length-1] = temp[a.length];
            
        }
        return a;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,6,4};
//        System.out.println(maximumRec(array, 0, 0));

        System.out.println(Arrays.toString(reverse(array)));
    }

}
