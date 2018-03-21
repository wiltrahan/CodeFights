// Some phone usage rate may be described as follows:

// first minute of a call costs min1 cents,
// each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
// each minute after 10th costs min11 cents.
// You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?

// Example

// For min1 = 3, min2_10 = 1, min11 = 2 and s = 20, the output should be
// phoneCall(min1, min2_10, min11, s) = 14.

int phoneCall(int min1, int min2_10, int min11, int s) {

  if (s < min1) {
    return 0;
  }

  for (int i = 2; i <= 10; i++) {
    if (s < min1 + min2_10 * (i-1)) {
      return i - 1;
    }
  }
  return 10 + (s - min1 - min2_10 * 9) / min11;
}
