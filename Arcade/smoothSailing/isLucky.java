// Ticket numbers usually consist of an even number of digits.
// A ticket number is considered lucky if the sum of the first half
// of the digits is equal to the sum of the second half.
// Given a ticket number n, determine if it's lucky or not.

boolean isLucky(int n) {

    String numStr = (new Integer(n)).toString();
    char[] chNumArr = numStr.toCharArray();
    char[] firstHalf = Arrays.copyOfRange(chNumArr, 0, chNumArr.length/2);
    char[] secondHalf = Arrays.copyOfRange(chNumArr, chNumArr.length/2, chNumArr.length);
    //System.out.println(firstHalf);
    //System.out.println(secondHalf);
    int check1 = 0;
    int check2 = 0;

    for(int i = 0; i < firstHalf.length; i++) {
        check1 += firstHalf[i];
    }

    for(int i = 0; i < secondHalf.length; i++) {
        check2 += secondHalf[i];
    }

    if(check1 == check2) {
        return true;
    }

    return false;
}
