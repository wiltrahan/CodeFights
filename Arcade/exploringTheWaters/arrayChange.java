int arrayChange(int[] inputArray) {
 int counter = 0;
 int temp = 0;

    for(int i = 0; i < inputArray.length - 1; i++)
        if (inputArray[i] >= inputArray[i + 1]) {
            temp = inputArray[i] - inputArray[i + 1] + 1;
            inputArray[i + 1] += temp;
            counter += temp;
        }
    return counter;

}
