 class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            // Pop the last digit
            int pop = x % 10;
            x /= 10;
            
            // Check for positive overflow before multiplying
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            
            // Check for negative overflow before multiplying
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            
            // Safely update the reversed number
            rev = rev * 10 + pop;
        }
        
        return rev;
    }
}
