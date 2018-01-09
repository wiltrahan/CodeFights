// Given two strings, find the number of common characters between them.

int commonCharacterCount(String s1, String s2) {
    int[] a = new int[26], b = new int[26];

    for (char c: s1.toCharArray())
        a[c - 'a']++;
    for (char c: s2.toCharArray())
        b[c - 'a']++;

    int s = 0;
    for (int i = 0; i < a.length; ++i)
        s +=Math.min(a[i],b[i]);
    return s;
}
