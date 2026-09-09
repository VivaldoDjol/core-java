public class Solution {

  public String reverseVowels(String s) {
    char[] charsArray = s.toCharArray();

    int left = 0;
    int right = charsArray.length - 1;

    while (left < right) {
      while (left < right && !isVowel(charsArray[left])) {
        left++;
      }

      while (left < right && !isVowel(charsArray[right])) {
        right--;
      }

      if (left < right) {
        char temp = charsArray[left];
        charsArray[left] = charsArray[right];
        charsArray[right] = temp;
      }
      left++;
      right--;
    }
    return new String(charsArray);
  }

  private boolean isVowel(char ch) {
    return "aeiouAEIOU".indexOf(ch) != -1;
  }
}
