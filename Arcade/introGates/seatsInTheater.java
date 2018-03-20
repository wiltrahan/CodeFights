// Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are occupied.

int seatsInTheater(int nCols, int nRows, int col, int row) {
    int columns = (nCols - col) + 1;
    int rows = nRows - row;

    return columns * rows;
}
