// Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

// A 1-interesting polygon is just a square with a side of length 1.
// An n-interesting polygon is obtained by taking the n - 1-interesting polygon and
// appending 1-interesting polygons to its rim, side by side.
// You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.

int shapeArea(int n) {
    if(n == 1) {
        return 1;
    }
    int shape = 0;
    for(int i = 0; i < n; i++) {
        shape = 4 * i;

    }
    return shape + shapeArea(n - 1);
}
