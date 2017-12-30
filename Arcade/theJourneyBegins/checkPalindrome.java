//Given the string, check if it is a palindrome.

boolean checkPalindrome(String inputString) {
        StringBuilder revCheck = new StringBuilder();
        revCheck.append(inputString).reverse();
        return new String(revCheck).equals(inputString) ? true : false;
}
