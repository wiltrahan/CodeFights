boolean areSimilar(int[] a, int[] b) {
    //create counter start at 0
    //loop over arrays, if are not similar, add to hashset
    int counter = 0;
    Set notSame = new HashSet();

    for(int i = 0; i < a.length; i++) {
        if(a[i] != b[i]) {
            notSame.add(a[i]);
            notSame.add(b[i]);
            counter++;
        }
    }
    if (counter == 0) {
        return true;
    }
    else if(counter == 2 && notSame.size() == 2) {
        return true;
    } else {
        return false;
    }
}
