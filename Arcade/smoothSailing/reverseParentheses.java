// You have a string s that consists of English letters, punctuation marks,
// whitespace characters, and brackets. It is guaranteed that the parentheses
// in s form a regular bracket sequence.

// Your task is to reverse the strings contained in each pair of matching parentheses,
// starting from the innermost pair. The results string should not contain any parentheses.

String reverseParentheses(String s) {
  int r, l;

  while((l = s.lastIndexOf('('))>=0){
    r = s.indexOf(')',l);
    s = s.replace(s.substring(l,r+1),new StringBuffer(s.substring(l+1,r)).reverse());
  }

  return s;
}
