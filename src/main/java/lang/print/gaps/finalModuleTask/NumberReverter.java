package lang.print.gaps.finalModuleTask;

public class NumberReverter
{
    public void revert(int number)
    {
        for(int i = 10; i <= 1000; i *= 10)
            System.out.print((number % i) / (i / 10));
        System.out.println();
    }
}
