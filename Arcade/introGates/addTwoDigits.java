// You are given a two-digit integer n. Return the sum of its digits.
int addTwoDigits(int n) {
    String num = String.valueOf(n);
    int added = 0;
    for(int i = 0; i < num.length(); i++) {
        added += Character.digit(num.charAt(i), 10);
    }

    return added;
}
