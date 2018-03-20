// Given an integer n, return the largest number that contains exactly n digits.
// Guaranteed constraints:
// 1 ≤ n ≤ 9.

int largestNumber(int n) {
    int largest = 0;

    switch(n) {
        case 1:
            largest = 9;
            break;
        case 2:
            largest = 99;
            break;
        case 3:
            largest = 999;
            break;
        case 4:
            largest = 9999;
            break;
        case 5:
            largest = 99999;
            break;
        case 6:
            largest = 999999;
            break;
        case 7:
            largest = 9999999;
            break;
        case 8:
            largest = 99999999;
            break;
        case 9:
            largest = 999999999;
            break;

    }
    return largest;
}
