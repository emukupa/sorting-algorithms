const bubblesort = arr => {
  let swappedValue = true;
  do {
    swappedValue = false;
    let length = arr.length - 1;
    for (let i = 0; i < length; i++) {
      if (arr[i] > arr[i + 1]) {
        let temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swappedValue = true;
        length--;
      }
    }
  } while (swappedValue);
  return arr;
};

const arr = [13, 21, 9, 23, 41, 17, 8, 12];

const result = bubblesort(arr);

console.log(result);
