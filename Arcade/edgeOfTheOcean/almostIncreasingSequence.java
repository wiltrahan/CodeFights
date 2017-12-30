// Given a sequence of integers as an array, determine whether it is possible to
// obtain a strictly increasing sequence by removing no more than one element from the array.

boolean almostIncreasingSequence(int[] sequence) {
    int removed = 0;

    for (int i = 0; i < sequence.length - 2 && removed <= 2; i ++) {
        int a = sequence[i];
        int b = sequence[i+1];
        int c = sequence[i+2];

        if (a >= b) {
            removed++;
            sequence[i] = b -1;
        }

        if (b >= c){
            removed++;

            if (a == c) {
                sequence[i+2] = b +1;
            } else {
                sequence[i+1] = a;
            }
        }
    }

    return removed <= 1;
}
