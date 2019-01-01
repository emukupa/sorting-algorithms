fn print_arr(arr: &[i32]) {
  print!("[");
  for i in 0..arr.len() {
    print!("{}", arr[i]);
    if i != arr.len() - 1 {
      print!(", ");
    }
  }
  println!("]");
}

fn swap(arr: &mut [i32], i: usize, j: usize){
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

fn bubble(arr: &mut [i32]){
  let mut is_sorted = false;
  let mut last_sorted = arr.len() - 1;

  while !is_sorted {
    is_sorted = true;
    for i in 0..last_sorted {
      if arr[i] > arr[i+1] {
        swap(arr, i, i + 1);
        is_sorted = false
      }
    }
    last_sorted -= 1;
  }
}

fn main(){
  let mut nums: [i32; 9] = [4,8,7,5,1,9,2,6,3];

  
  print_arr(&nums);
  bubble(&mut nums);
  print_arr(&nums);
  
}