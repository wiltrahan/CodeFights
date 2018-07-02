// Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).

// Example

// For inputString = "crazy", the output should be
// alphabeticShift(inputString) = "dsbaz".

String alphabeticShift(String inputString) {
    String shifted = "";
    for(int i = 0, n = inputString.length(); i < n; i++) {
        char c = inputString.charAt(i);
        if(c == 'z') {
            shifted += 'a';
        } else {
            int temp = c + 1;
            shifted += (char)temp;
        }
    }
    return shifted;
}
