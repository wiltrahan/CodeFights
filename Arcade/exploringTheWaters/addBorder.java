// Given a rectangular matrix of characters, add a border of asterisks(*) to it.

// Example for
// picture = ["abc",
//            "ded"]
// the output should be

// addBorder(picture) = ["*****",
//                       "*abc*",
//                       "*ded*",
//                       "*****"]

String[] addBorder(String[] picture) {
  String topNBottom = "";
  ArrayList<String> bordered = new ArrayList<String>();

  for(int i = 0; i < picture[0].length() + 2; i++) {
    topNBottom += "*";
  }
  bordered.add(topNBottom);

  for(int i = 0; i < picture.length; i++) {
    bordered.add("*" + picture[i] + "*");
  }

  bordered.add(topNBottom);

  String[] completed = new String[bordered.size()];

  return bordered.toArray(completed);
}
