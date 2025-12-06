
/**
 * Write a description of class Number14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number14
{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5,};
        
        System.out.println("Original array: ");
        for (int x : arr) 
            System.out.print(x + " ");
        
        System.out.println(" ");
        System.out.println("Array in reverse: ");
        for (int i = arr.length - 1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
