const mergesort = arr => {
  // base case
  if (arr.length < 2) {
    return arr;
  }

  // split the array into two halves
  const mid = Math.floor(arr.length / 2);
  const leftArray = arr.slice(0, mid);
  const rightArray = arr.slice(mid);

  // recursive helper
  const merge = (leftArray, rightArray) => {
    const mergedArray = [];
    let leftIndex = 0;
    let rightIndex = 0;

    while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
      if (leftArray[leftIndex] < rightArray[rightIndex]) {
        mergedArray.push(leftArray[leftIndex]);
        leftIndex++;
        continue; // skip the lines below
      }
      mergedArray.push(rightArray[rightIndex]);
      rightIndex++;
    }
    // add the remaining array, can either be leftArray or rightArray
    return mergedArray
      .concat(leftArray.slice(leftIndex))
      .concat(rightArray.slice(rightIndex));
  };
  // recursively merge the array
  return merge(mergesort(leftArray), mergesort(rightArray));
};
const arr = [13, 21, 9, 23, 41, 17, 8, 12];
const result = mergesort(arr);
console.log(result);
