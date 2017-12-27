// Given a string s, find and return the first instance of a non-repeating character in it.
// If there is no such character, return '_'.

char firstNotRepeatingCharacter(String s) {

    LinkedHashMap<Character, Integer> repeatCheck = new LinkedHashMap<>();
    int strlen = s.length();
    int value = 1;

    for(int i = 0; i < strlen; i++) {
        if(repeatCheck.containsKey(s.charAt(i))) {
            repeatCheck.put(s.charAt(i), value++);
        } else {
            repeatCheck.put(s.charAt(i), 0);
        }
    }
    System.out.println("repeatCheck = " + repeatCheck);
    for(Character key: repeatCheck.keySet()) {
        if(repeatCheck.get(key) == 0) {
            return key;
        }
    }
    return '_';
}
