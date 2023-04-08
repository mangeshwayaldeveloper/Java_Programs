package Assignment;
import java.util.HashSet;
public class Question9 {
        public static void main(String[] args) {
            int[] arr = {4, 3, 5, 9, 14, 34, 75};
            removeDuplicate(arr);
        }
        static void removeDuplicate(int[] arr){
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j : arr) {
                set.add(j);
            }
            System.out.print(set);
        }
    }
