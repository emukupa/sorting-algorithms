#include <iostream>

void printArr(int arr[], int len)
{
  std::cout << "[";
  for (int i = 0; i < len; i++)
  {
    std::cout << arr[i];
    if (i != len - 1)
    {
      std::cout << ", ";
    }
  }
  std::cout << "]\n";
}
void swap(int *i, int *j)
{
  int temp = *i;
  *i = *j;
  *j = temp;
}

void bubble(int arr[], int len)
{
  bool isSorted = false;

  for (int i = 0; i < len; i++)
  {
    isSorted = true;
    for (int j = 0; j < len - 1; j++)
    {
      if (arr[j] > arr[j + 1])
      {
        swap(&arr[j], &arr[j + 1]);
        isSorted = false;
      }
    }
    if (isSorted == true)
    {
      break;
    }
  }
}

int main()
{
  int nums[] = {1, 6, 2, 9, 3, 4, 6, 11, 4};
  int size = sizeof(nums) / sizeof(nums[0]);

  printArr(nums, size);
  bubble(nums, size);
  printArr(nums, size);

  return 0;
}