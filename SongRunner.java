import java.util.*;

public class SongRunner
{
  public static void main (String [] args)
  {
    ArrayList<Song> playlist = new ArrayList<Song>();
    
    // original four songs
    Song tempSong = new Song("Wishful Thinking", "BENEE", 3.32);
    playlist.add(tempSong);
    tempSong = new Song("SUGAR", "BROCKHAMPTON", 3.23);
    playlist.add(tempSong);
    tempSong = new Song("Don't Start Now", "Dua Lipa", 3.03);
    playlist.add(tempSong);
    tempSong = new Song("3 Nights", "Dominic Fike", 2.57);
    playlist.add(tempSong);
    
    System.out.println(playlist);
    System.out.println();
    
    // adding one song
    tempSong = new Song("Love You Better", "EchoSmith", 3.40);
    playlist.add(tempSong);
    
    System.out.println(playlist);
    System.out.println(playlist.size());
    System.out.println();
    
    // adding song at position 2
    tempSong = new Song("Glitter", "BENEE", 3.00);
    playlist.add(2,tempSong);
    System.out.println(playlist.size());
    System.out.println();
    
    // removing a song
    playlist.remove(5);
    System.out.println(playlist);
    System.out.println();
    
    // using the set method
    tempSong = new Song("Talk Too Much", "COIN", 3.07);
    System.out.println(playlist.set(4,tempSong));
    System.out.println();
    System.out.println(playlist);
    
    
    
    
    
  }
}