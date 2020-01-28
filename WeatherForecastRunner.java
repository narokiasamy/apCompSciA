public class WeatherForecastRunner
{
  public static void main (String [] args)
  {
    WeatherForecast w1 = new WeatherForecast();
    System.out.println(w1);
    System.out.println(w1.toCelsius());
    
    WeatherForecast w2 = new WeatherForecast(58, "cloudy");
    System.out.println(w2);
    
    WeatherForecast w3 = new WeatherForecast(-100, "asdf");
    System.out.println(w3);
    System.out.println(w3.consistentAtrributes());
  }
}