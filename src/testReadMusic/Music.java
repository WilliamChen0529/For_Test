package testReadMusic;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Music {

    public static void main(String[] args) {

        String bip = "Z:\\MUSIC\\航海王OP\\配樂\\海賊王配樂4.mp3";
     //   File f = new File("Z:\\MUSIC\\航海王OP\\配樂\\海賊王配樂4.mp3");
      
        
         try {
            File f = new File("Z:\\MUSIC\\航海王OP\\配樂\\海賊王配樂4.mp3");
            InputStream in = new FileInputStream(f);

            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(new FileInputStream(f));
            // play the audio clip with the audioplayer class
           
            AudioPlayer.player.start(audioStream);
    } catch (FileNotFoundException fnfe) {
             
    } catch (IOException ioe) {
          
    }
        
        
        
    }
}
