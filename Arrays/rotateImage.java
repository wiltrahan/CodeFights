// You are given an n x n 2D matrix that represents an image.
// Rotate the image by 90 degrees (clockwise).

int[][] rotateImage(int[][] a) {
  int down = a.length;
  int across = a[0].length;
  int[][] rotated = new int[down][across];

  for(int row = 0; row < down; row++) {
    for(int col = 0; col < across; col++) {
      rotated[col][(down - 1) - row] = a[row][col];
    }
  }
  return rotated;
}
