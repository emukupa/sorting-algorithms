
public class Merge {
  public static void mergesort(int[] array) {
    mergesort(array, new int[array.length], 0, array.length - 1);
  }

  public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd) {
    // done
    if (leftStart >= rightEnd) {
      return;
    }

    // get the middle
    int middle = (leftStart + rightEnd) / 2;
    mergesort(array, temp, leftStart, middle);
    mergesort(array, temp, middle + 1, rightEnd);
    mergehalves(array, temp, leftStart, rightEnd);
  }

  public static void mergehalves(int[] array, int[] temp, int leftStart, int rightEnd) {
    int leftEnd = (rightEnd + leftStart) / 2;
    int rightStart = leftEnd + 1;

    int size = rightEnd - leftStart + 1;

    int left = leftStart;
    int right = rightStart;
    int index = leftStart;

    while (left <= leftEnd && right <= rightEnd) {
      if (array[left] <= array[right]) {
        temp[index] = array[left];
        left++;
      } else {
        temp[index] = array[right];
        right++;
      }
      index++;
    }

    // copy the rest of the remaining elements
    // only one will have the remaining elements
    System.arraycopy(array, left, temp, index, leftEnd - left + 1);
    System.arraycopy(array, right, temp, index, rightEnd - right + 1);
    System.arraycopy(temp, leftStart, array, leftStart, size);
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 13, 21, 9, 23, 41, 17, 8, 12 };
    mergesort(arr);
    System.out.print('[');
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i != arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print(']');
  }
}