public class Euler5 {


    /**
     * Schleife zur Suche nach der kleinsten Zahl, die durch 1-20 ohne Rest teilbar ist
     * Startwert ist 2520, da dies die kleinste Zahl ist, die durch 1-10 teilbar ist
     * Schrittweite ist 20, da die gesuchte Zahl mindestens durch 20 teilbar sein muss
     *
     * @return gibt die gefundene Zahl zurück oder -1 falls keine gefunden wurde
     */
    public long smallestNumber() {
        for (long x = 2520; x <= 100_000_000_000_000L; x += 20) {
            if (evenlyDivisible(x)) {
                return x;
            }
        }
        return -1;
    }

    /**
     * Controls if the number is dividble by 1-20
     * @param num should be the result
     * @return returns if when the condition is true
     */
    private boolean evenlyDivisible(long num) {
        for (long i = 11; i <= 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}
