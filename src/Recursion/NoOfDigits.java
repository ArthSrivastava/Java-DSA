package Recursion;

public class NoOfDigits {
     int count = 0;
     int totalDigits(int n) {
        if (n == 0)
            return count;
        count++;
        return totalDigits(n/10);
    }

    public static void main(String[] args) {
         NoOfDigits obj = new NoOfDigits();
        System.out.println(obj.totalDigits(1234));
    }

}
