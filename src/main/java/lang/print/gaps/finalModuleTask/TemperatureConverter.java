package lang.print.gaps.finalModuleTask;

public class TemperatureConverter
{
    public void toFahrenheit(int temperatureCelsius)
    {
        System.out.println(Math.round(((temperatureCelsius * 9.0f / 5) + 32.0) * 10)/10.0);
    }
}
