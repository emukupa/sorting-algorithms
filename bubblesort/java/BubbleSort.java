public class BubbleSort {
  // naive, only useful if you want to sort one or few elements
  // slow, O(n) passes by O(n) times => giving us the complexity of O(n^2)
  public static void bubble(int[] arr) {
    // assume its not sorted
    boolean isSorted = false;
    int lastSorted = arr.length - 1;
    // start walking through over and over until its sorted
    while (!isSorted) {
      // every start, we assume its sorted
      isSorted = true;

      // we will use a for loop comparing the current element with the next one
      // to prevent out of bound error, we end at one element less the length of the
      // array
      for (int i = 0; i < lastSorted; i++) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
          isSorted = false; // we know the array is not sorted
        }
      }
      lastSorted--; // optimization
    }
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 5, 1, 6, 9, 2 };

    bubble(nums);

    for (int num : nums) {
      System.out.println(num);
    }
  }
}