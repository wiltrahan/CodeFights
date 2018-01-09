// Some people are standing in a row in a park.
// There are trees between them which cannot be moved.
// Your task is to rearrange the people by their heights
// in a non-descending order without moving the trees.

int[] sortByHeight(int[] a) {
  int temp = 0;
  for(int i = 0; i < a.length - 1; i++) {
    for(int j = i + 1; j < a.length; j++) {
      if(a[j] != -1) {
        if(a[i] > a[j]) {
          temp = a[j];
          a[j] = a[i];
          a[i] = temp;
        }
      }
    }
  }
  return a;
}
