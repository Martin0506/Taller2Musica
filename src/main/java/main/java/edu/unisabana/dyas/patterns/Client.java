package main.java.edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
      AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter("mp4") {
          @Override
          public void stop() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
        audioPlayer.play("mp4", "song.mp4");

        audioPlayer = new AdvancedAudioPlayerAdapter("vlc") {
          @Override
          public void stop() {
              throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          }
      };
        audioPlayer.play("vlc", "movie.vlc");

        // Intentar reproducir un formato no soportado
        audioPlayer.play("avi", "video.avi");
}
}