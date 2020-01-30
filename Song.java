public class Song
{
  private String title;
  private String artist;
  private double duration;
  
  public Song (String doubleitle, String inArtist, double inDuration)
  {
    title = doubleitle;
    artist = inArtist;
    duration = inDuration;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public String getArtist()
  {
    return artist;
  }
  
  public double getDuration()
  {
    return duration;
  }
  
  public void setTitle(String doubleitle)
  {
    title = doubleitle;
  }
  
  public void setArtist(String inArtist)
  {
    artist = inArtist;
  }
    
  public void setDuration(double inDuration)
  {
    duration = inDuration;
  }
  
  public boolean equals(Song inSong)
  {
    if (this.title.equals(inSong.getTitle()) && this.artist.equals(inSong.getArtist()) & this.duration == inSong.getDuration())
      return true;
    else
      return false;
  }
  
  public String toString()
  {
    return "\ntitle: " + title + " \tartist: " + artist + " \tduration: " + duration;
  }
    
}