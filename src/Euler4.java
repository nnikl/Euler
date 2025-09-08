class Euler4 {


    public static void main(String[] args) {
        int largestPalindrom = largestPalindrom();
        System.out.println("Das Größte Palindrom ist: " + largestPalindrom);
    }

    //condition to be a Palindrom
    public static boolean isPalindrom(int sum) {
        String reverseSum = new StringBuilder(String.valueOf(sum)).reverse().toString();
        int reversedInt = Integer.parseInt(reverseSum);

        if (sum == reversedInt) {
            return true;
        } else {
            return false;
        }
    }

    //find largestPalindrom
    public static int largestPalindrom() {
        int maxPalindrom = 0;

        for (int i = 999; i >= 500; i--) {
            for (int x = 999; x >= 500; x--) {
                int sum = i * x;
                if (isPalindrom(sum) && sum > maxPalindrom) {
                    maxPalindrom = sum;
                }
            }
        }
        return maxPalindrom;
    }
}
