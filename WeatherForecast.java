public class WeatherForecast
{
  private int temperature;
  private String conditions;
  
  public WeatherForecast()
  {
    temperature = 70;
    conditions = "sunny";
  }
  
  int randomNumber = 0;
    
  public WeatherForecast(int inTemp, String inConditions)
  {
    if (inTemp >= -50 && inTemp <= 150)
      temperature = inTemp;
    else
      temperature = (int)(Math.random() * 201) - 50;
    
    if (inConditions.equals("sunny") || inConditions.equals("snowy") || inConditions.equals("cloudy") ||inConditions.equals("rainy"))
      conditions = inConditions;
    else
    {
      randomNumber = (int)(Math.random() * 4) + 1;
      if (randomNumber == 1)
        conditions = "sunny";
      else if (randomNumber == 2)
        conditions = "snowy";
      else if (randomNumber == 3)
        conditions = "cloudy";
      else if (randomNumber == 4)
        conditions = "rainy";
    }
  }

  
  public int toCelsius()
  {
    return (temperature - 32) * (5/9);
  }
  
  public boolean consistentAtrributes()
  {
    if (temperature < 32 && !conditions.equals("snowy"))
      return false;
    else if (temperature > 100 && !conditions.equals("sunny"))
      return false;
    else
      return true;
  }
  
  public String toString()
  {
    return "temperature: " + temperature + "\nconditions: " + conditions + "\n";
  }
}
