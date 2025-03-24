public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String letters) {
      int counter = 0;
      int longest = 0;
      int start = 0;

        for (int count = 0; count < letters.length(); count++) {
            for (int inner = counter; inner < count; inner++) {
                if (letters.charAt(count) == letters.charAt(inner)) {

                    counter = inner + 1;
                    start = count - counter;
                    
                    break;

                }

            }
            start++;

            if (start > longest) {
                longest = start;
            }
        }

        return longest;
    }


  public static void main(String[] args) {
        String letters = "pwwkew";
        int result = lengthOfLongestSubstring(letters);
//      System.out.println(Arrays.toString(result));
      System.out.println(result);
  }
}

