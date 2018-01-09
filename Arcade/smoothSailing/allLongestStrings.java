// Given an array of strings, return another array containing all of its longest strings.

String[] allLongestStrings(String[] inputArray) {
  // System.out.println(inputArray[0].length());
  // System.out.println(inputArray.length);
  ArrayList<String> longest = new ArrayList<String>();
  int longestStringLen = inputArray[0].length();
  for(int i = 0; i < inputArray.length; i++) {
    if(inputArray[i].length() > longestStringLen) {
      longestStringLen = inputArray[i].length();
    }
  }
  for(int i = 0; i < inputArray.length; i++) {
    if(inputArray[i].length() == longestStringLen) {
      longest.add(inputArray[i]);
    }
  }
  //System.out.println(longest);
  String[] returnedStrings = longest.toArray(new String[longest.size()]);
  return returnedStrings;
}
