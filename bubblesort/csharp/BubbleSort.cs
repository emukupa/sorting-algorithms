class BubbleSort
{
  static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void bubble(int[] arr)
  {
    bool isSorted = false;
    int lastSorted = arr.Length -1;

    for (int i = 0; i < arr.Length; i++)
    {
      isSorted = true;
      for (int j = 0; j < lastSorted; j++)
      {
        if (arr[j] > arr[j + 1])
        {
          swap(arr, j, j + 1);
          isSorted = false;
        }
      }
      if (isSorted)
      {
        break;
      }
      lastSorted--;
    }
  }
  static void printArray(int[] arr)
  {
    System.Console.Write("[");
    for (int i = 0; i < arr.Length; i++)
    {
      System.Console.Write(arr[i]);
      if (i != arr.Length - 1)
      {
        System.Console.Write(", ");
      }
    }
    System.Console.WriteLine("]");
  }
  public static void Main()
  {
    int[] nums = { 1, 6, 2, 9, 3, 4, 6, 11, 4 };
    printArray(nums);
    bubble(nums);
    printArray(nums);

  }
}