// Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid
// with numbers in such a way that each column, each row, and each of the nine
// 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.

// Implement an algorithm that will check whether the given grid of numbers represents a valid
// Sudoku puzzle according to the layout rules described above.
// Note that the puzzle represented by grid does not have to be solvable.

boolean sudoku2(char[][] grid) {

  for(int i = 0; i < 9; i++) {
    HashSet<Character> row = new HashSet<Character>();
    HashSet<Character> column = new HashSet<Character>();
    HashSet<Character> square = new HashSet<Character>();

      for(int j = 0; j < 9; j++) {
        //row.add IF its not present. if present, return false
        if(grid[i][j] != '.' && !row.add(grid[i][j])){
          return false;
        }
        //same here with column
        if(grid[j][i] != '.' && !column.add(grid[j][i])){
          return false;
        }

        int squareRow = 3*(i/3);
        int squareColumn = 3*(i%3);
        //same with square
        if(grid[squareRow + j/3][squareColumn + j%3]!='.' &&
          !square.add(grid[squareRow + j/3][squareColumn + j%3])) {
          return false;
        }

      }
  }
  return true;
}
