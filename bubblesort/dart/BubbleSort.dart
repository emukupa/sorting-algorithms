void bubble(List<int> arr) {
  bool isSorted = false;
  int lastSorted = arr.length - 1;

  while (!isSorted) {
    isSorted = true;
    for (int i = 0; i < lastSorted; i++) {
      if (arr[i] > arr[i + 1]) {
        swap(arr, i, i + 1);
        isSorted = false;
      }
    }
    lastSorted--;
  }
}

void swap(List<int> arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

main() {
  List<int> nums = [3, 6, 8, 9, 1, 4, 2, 5, 7];
  print(nums);
  bubble(nums);
  print(nums);
}
