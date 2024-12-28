import java.util.*;
public class sepzero
{
    public static void main(String[] args) {
        int arr[]={1,5,0,3,6,0,0,1};
        System.out.println(seperatezero(arr));
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> seperatezero(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int count = 0;
       for(int num:arr)
       {
        if (num == 0)
          {
            count++;
          }
          else
          {
        list.add(num);
          }
    }
    
    for(int i=0;i<count;i++)
{
    list.add(0);
}
    return list;

}
}
    
        