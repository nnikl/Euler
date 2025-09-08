public class Euler6 {

    /**
     * sumSquareWithoutBrackets() at first the SumSquare of each number and then the Addition to each
     * sumSquaresInBrackets() the result gets multiplicated by itself
     *
     * @return returns difference between sumSquareInBrackets and sumSquareWithoutBrackets
     */
    public int sumSquaresResult() {
        return sumSquaresInBrackets() - sumSquareWithoutBrackets();
    }

    private int sumSquareWithoutBrackets() {
        int sumSquareCalculate = 0;
        for (int x = 1; x <= 100; x++) {
            sumSquareCalculate += x * x;
        }
        return sumSquareCalculate;
    }

    private int sumSquaresInBrackets() {
        int sumSquareCalculateNumbers = 0;
        for (int x = 1; x <= 100; x++) {
            sumSquareCalculateNumbers += x;
        }
        return sumSquareCalculateNumbers * sumSquareCalculateNumbers;
    }
}
