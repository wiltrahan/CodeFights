// Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

int arrayMaximalAdjacentDifference(int[] inputArray) {
    int temp = 0;
    int output = 0;
    for(int i = 0; i < inputArray.length - 1; i++) {
        temp = inputArray[i] - inputArray[i + 1];
        if(Math.abs(temp) > Math.abs(output)) {
            output = Math.abs(temp);
        }
    }
    return output;
}
