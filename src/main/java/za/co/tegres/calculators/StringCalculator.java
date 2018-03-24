package za.co.tegres.calculators;

public class StringCalculator {

    public int Add(String numbers) {
        int sum = 0;
        if(isEmpty(numbers)) return sum;
        return sum;
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }
}
