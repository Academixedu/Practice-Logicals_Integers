public class FindOdd {
    public static void main(String[] args) {
        int num = 97826;
        // 62879
        
        int reversedNum = 0;
        int originalNum = num;
        
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reversedNum = reversedNum * 10 + digit;
            originalNum = originalNum / 10;
        }

       int position=1;
        
        while (reversedNum != 0) {
            int digit = reversedNum % 10; 
                       if (position % 2 != 0) { 
                System.out.println(digit);
            }
            reversedNum = reversedNum / 10; // Remove the last digit
            position++; // Move to the next position
        }
    }
}
