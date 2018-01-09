// Several people are standing in a row and need to be divided into two teams.
// The first person goes into team 1, the second goes into team 2,
// the third goes into team 1 again, the fourth into team 2, and so on.

// You are given an array of positive integers - the weights of the people.
// Return an array of two integers, where the first element is the total weight of team 1,
// and the second element is the total weight of team 2 after the division is complete.

// Example
// For a = [50, 60, 60, 45, 70], the output should be
// alternatingSums(a) = [180, 105].

int[] alternatingSums(int[] a) {

  if(a.length == 2) {
    return a;
  }

  int temp1 = 0;
  int temp2 = 0;

  int[] first = new int [a.length];
  int[] second = new int [a.length];
  int[] total = new int [2];

  for(int i = 0; i < a.length; i++) {
    if(i % 2 == 0){
      first[i] = a[i];
    } else {
      second[i] = a[i];
    }
  }

  for(int i = 0; i < first.length; i++) {
    temp1 += first[i];
  }
  for(int i = 0; i < second.length; i++) {
    temp2 += second[i];
  }
  total[0] = temp1;
  total[1] = temp2;

  return total;
}
