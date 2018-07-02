// Check if all digits of the given integer are even.

// Example

// For n = 248622, the output should be
// evenDigitsOnly(n) = true;
// For n = 642386, the output should be
// evenDigitsOnly(n) = false.


boolean evenDigitsOnly(int n) {
int temp = n;
ArrayList<Integer> array = new ArrayList<Integer>();

    do{
        array.add(temp % 10);
        temp /= 10;
    }   while  (temp > 0);

    for(int i = 0; i < array.size(); i++) {
        if(array.get(i) % 2 != 0) {
            return false;
        }
    }
    return true;
}
