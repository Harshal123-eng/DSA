 import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Base case
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0; // Left pointer of the window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already in the window, move the left pointer
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update or insert the character's latest position
            map.put(currentChar, right);

            // Calculate the max length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
