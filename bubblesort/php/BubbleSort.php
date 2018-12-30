<?php 

function bubble(&$arr)
{
  $isSorted = false;
  $lastSorted = sizeof($arr) - 1;

  while (!$isSorted) {
    $isSorted = true;

    for ($i = 0; $i < $lastSorted; $i++) {
      if ($arr[$i] > $arr[$i + 1]) {
        swap($arr, $i, $i + 1);
        $isSorted = false;
      }
    }
    $lastSorted--;
  }
}

function swap(&$arr, $i, $j)
{
  $temp = $arr[$i];
  $arr[$i] = $arr[$j];
  $arr[$j] = $temp;
}

function printArr(&$arr)
{
  echo "[";
  for ($i = 0; $i < sizeof($arr); $i++) {
    echo $arr[$i];
    if ($i != sizeof($arr) - 1)
      echo ", ";
  }
  echo "]\n";
}
$nums = [4, 3, 5, 9, 1, 2, 7, 8];

printArr($nums);
bubble($nums);
printArr($nums);

