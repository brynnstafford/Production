//concrete class that will allow us to capture the details of an audio
// player. Create a class called AudioPlayer that is a subclass of Product
// and implements the MultimediaControl interface.
public class AudioPlayer extends Product implements MultimediaControl {

   public String supportedAudioFormats;
   public String supportedPlaylistFormats;

   public AudioPlayer(String name,
                      String manufacturer,
                      String supportedAudioFormats,
                      String supportedPlaylistFormats) {
      super();
      this.name = name;
      this.manufacturer = manufacturer;
      this.supportedAudioFormats = supportedAudioFormats;
      this.supportedPlaylistFormats = supportedPlaylistFormats;

   }

   public String toString() {
      return "Name: " + this.name
         + "Manufacturer: " + this.manufacturer
         + "Supported Audio Formats: " + this.supportedAudioFormats
         + "Supported Playlist Formats: " + this.supportedPlaylistFormats;
   }

   @Override
   public void play() {

   }

   @Override
   public void stop() {

   }

   @Override
   public void previous() {

   }

   @Override
   public void next() {

   }

   @Override
   public int getId() {
      return 0;
   }
}
