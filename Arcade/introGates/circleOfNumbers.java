// Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

// Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

int circleOfNumbers(int n, int firstNumber) {
    int[] circle = new int[n];
    int halfWay = n / 2;

    for(int i = 0; i < n; i++) {
        circle[i] = i;
    }

    if(firstNumber < halfWay) {
        return circle[firstNumber + halfWay];
    }

    return circle[firstNumber - halfWay];
}
