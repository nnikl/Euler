import java.util.LinkedList;
import java.util.List;

public class Euler3_1 {

    public static void main(String[] args) {
        long highNumber = 600_851_475_143L;
        long highestDivider = 0L;
        List<Long> primenumbers = getPrimenumbers();
        System.out.println(primenumbers);
        for (long n : primenumbers) {
            if (highNumber % n == 0) {
                highestDivider = n;
                System.out.println(highestDivider);
            }
        }

    }

    public static List<Long> getPrimenumbers() {
        List<Long> primenumbers = new LinkedList<>();
        for (long i = 2L; i < 100_000L; i++) {
            if (isPrimenumber(i)) {
                primenumbers.add(i);
            }


        }
        return primenumbers;
    }

    public static boolean isPrimenumber(long testNumber) {
        for (long x = 2L; x < (testNumber / 2) + 1; x++) {
            if (testNumber % x == 0) {
                return false;
            }

        }
        return true;
    }
}

