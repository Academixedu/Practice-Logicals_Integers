public class FindLarge{
    // prepare a Logic to findout Large digit in given Number
      // If Number is 1782 The Largest Digit is 8 You should prepare logic to print that Number
      // Take Number By using Scanner
    public static void main(String[] args) {
        int a=1298;
        int large=0;
        int digit=0;
        while(a!=0){
            digit=a%10;
            if(digit>large){
            large=digit;
            // 8 
            // 9
            }
            a=a/10;
        }
        System.out.println(large);
    }  
    }
