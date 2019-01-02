const quickSort = arr => {
  const copiedArray = arr.slice();

  if (arr.length < 2) return arr;

  const lessThanOrEqualToPivot = [];
  const greaterThanPivot = [];
  const middleIndex = Math.floor(copiedArray.length / 2);
  const pivot = copiedArray.splice(middleIndex, 1);

  for (let i = 0; i < copiedArray.length; i++) {
    if (copiedArray[i] <= pivot[0]) {
      lessThanOrEqualToPivot.push(copiedArray[i]);
    } else {
      greaterThanPivot.push(copiedArray[i]);
    }
  }

  return [].concat(
    quickSort(lessThanOrEqualToPivot),
    pivot,
    quickSort(greaterThanPivot)
  );
};

const nums = [4, 7, 1, 5, 8, 3, 2, 9, 5];
const result = quickSort(nums);
console.log(result);
