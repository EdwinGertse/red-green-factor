package za.co.tegres.calculators;

public class StringCalculator {

    public int Add(String numbers) {
        if(isEmpty(numbers)) return 0;
        return calcSum(numbers);
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public int calcSum(String number) {
        return Integer.valueOf(number);
    }
}
