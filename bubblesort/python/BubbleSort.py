def bubble(arr):
    isSorted = False
    lastSorted = len(arr) - 1
    while not isSorted:
        isSorted = True
        for i in range(lastSorted):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                isSorted = False


nums = [3, 2, 5, 8, 9, 1, 6, 7, 4]

print(nums)
bubble(nums)
print(nums)