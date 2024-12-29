
public class Osecondlargest
{
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    System.out.println(getSecondLargest(arr));
 }
    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
    
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
    
        // Find the largest number
        for (int num : arr) 
        {
            //dont forget to use secondMax = max; instead of max = num;
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else  if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
            if(secondMax == Integer.MIN_VALUE)
            {
                throw new IllegalArgumentException("Array must contain at least two distinct elements");
            }
            return secondMax;
    }
    
}