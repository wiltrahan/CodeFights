boolean palindromeRearranging(String inputString) {
 //array of 26 ints that initalize at 0 for each
 //lowercase letter of the alphabet
    int[] check = new int[26];
 //add 1 to the corresponding position of the array
 //that matches the letter of the alphabet
 //a = 0, z = 25
    for(int i = 0; i < inputString.length(); i++)
        check[inputString.charAt(i) - 97]++;

    int counter = 0;
//look at each element in the array, if the number is not even
//add 1 to the counter. if the counter is less than or equal to 1,
//return true
    for(int i = 0; i < check.length; i++)
        if(check[i] % 2 != 0)
            counter++;
    return counter <= 1;
}
