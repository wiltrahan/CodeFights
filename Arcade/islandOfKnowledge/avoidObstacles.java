// You are given an array of integers representing coordinates of obstacles situated on a straight line.

// Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

// Find the minimal length of the jump enough to avoid all the obstacles.
int avoidObstacles(int[] inputArray) {
    //start at 2, add 1 each loop
    //if it doesn't hit any number in passed array
    //return that number
    for(int i = 2;;i++){
        boolean step = true;

        for(int n : inputArray)
            step = step && n%i != 0;
            if(step)
                return i;
    }
}
