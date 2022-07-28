package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        for(int i = 1000; i >= 1; i /= 10)
        {
            sum += number / i;
            number %= i;
        }
        System.out.println(sum);
    }
}
