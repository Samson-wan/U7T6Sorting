import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
    Sort.selectionSortDecrease(arr);
    System.out.println(Sort.toString(arr));

    int[] arr1 = { 13, 7, 6, 45, 21, 9, 101, 102 };
    Sort.insertionSortDecrease(arr1);
    System.out.println(Sort.toString(arr1));
  }
}
