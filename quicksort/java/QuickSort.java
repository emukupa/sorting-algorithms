public class QuickSort {

  // initial call
  public static void quicksort(int[] arr) {
    quicksort(arr, 0, arr.length - 1);
  }

  public static int partition(int[] arr, int left, int right, int pivot) {
    // move from left to right and right to left simultaneously
    while (left <= right) {
      // // increase left index until i find elements out of order
      while (arr[left] < pivot) {
        left++;
      }

      // // reduce right index until I find element out of order
      while (arr[right] > pivot) {
        right--;
      }

      if (left <= right) {
        swap(arr, left, right);
        left++;
        right--;
      }
    }

    return left;
  }

  // recursive call
  public static void quicksort(int[] arr, int left, int right) {
    // check if left is bigger then do nothing
    if (left >= right) {
      return;
    }

    // pick a pivot
    // ways of picking a pivot
    /*
     * 1. Always pick first element as pivot. 2. Always pick last element as pivot.
     * 3. Pick a random element as pivot. 4. Pick median as pivot.
     */
    // using number 4
    int pivot = arr[(left + right) / 2]; // always be a floor integer index
    // split the array around an index and then sort the two sides
    int index = partition(arr, left, right, pivot);
    quicksort(arr, left, index - 1); // left side
    quicksort(arr, index, right); // right side

  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void printArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    int[] nums = { 4, 7, 1, 5, 8, 3, 2, 9, 5 };
    printArr(nums);
    quicksort(nums);
    printArr(nums);
  }
}