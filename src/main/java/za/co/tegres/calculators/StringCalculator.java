package za.co.tegres.calculators;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public int Add(String numbers) {
        if(isEmpty(numbers)) return 0;
        List<Integer> extractedNumbers = extractNumbers(numbers);
        return calcSum(extractedNumbers);
    }

    private boolean isEmpty(String str) {
        return (str == null || str.trim().isEmpty());
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

    public int calcSum(List<Integer> numbers) {
        int result = 0;
        for(Integer n : numbers) {
            result += n;
        }
        return result;
    }
}
