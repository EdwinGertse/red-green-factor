package za.co.tegres.calculators;

import za.co.tegres.calculators.exceptions.NegativeNumberNotSupportedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int Add(String numbers) {
        if(isEmpty(numbers)) return 0;
        List<Integer> extractedNumbers = extractNumbers(numbers);
        hasNegativeNumbers(extractedNumbers);
        return calcSum(extractedNumbers);
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    private boolean isEmpty(Collection collection) {
        return collection == null && collection.isEmpty();
    }

    public List<Integer> extractNumbers(String numbers) {
        List<Integer> result = new ArrayList<>();
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(numbers);
        while(m.find()){
            result.add(Integer.valueOf(m.group()));
        }
        return result;
    }

    public void hasNegativeNumbers(List<Integer> numbers) {
        List<Integer> negatives = new ArrayList<>();
        for(Integer n : numbers) {
            if(n < 0) {
                negatives.add(n);
            }
        }
        if(!isEmpty(negatives))
            throw new NegativeNumberNotSupportedException(negatives);
    }

    public int calcSum(List<Integer> numbers) {
        int result = 0;
        for(Integer n : numbers) {
            result += n;
        }
        return result;
    }
}
