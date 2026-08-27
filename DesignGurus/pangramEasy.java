class Solution {
  public static boolean isLetter(char ch) {
    return Character.isLetter(ch);
  }

  public boolean checkIfPangram(String sentence) {
    sentence = sentence.toLowerCase();
    int size = 26;
    boolean[] seen = new boolean[size];

    for (int i = 0; i < sentence.length(); i++) {
      if (isLetter(sentence.charAt(i))) {
        int index = sentence.charAt(i) - 'a';
        seen[index] = true;
      }
    }

    for (int i = 0; i < size; i++) {
      if (!seen[i]) {
        return false;
      }
    }
    return true;
  }
}
