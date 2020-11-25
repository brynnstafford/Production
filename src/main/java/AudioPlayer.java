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
      this.type = ItemType.AUDIO;
   }

   public String toString() {
      return "Name: " + this.name
         + "\nManufacturer: " + this.manufacturer
         //+ "\nItem Type: " + this.type
         + "\nType: " + this.type
         + "\nSupported Audio Formats: " + this.supportedAudioFormats
         + "\nSupported Playlist Formats: " + this.supportedPlaylistFormats;
   }

   @Override
   public void play() {
      System.out.println("Playing");

   }

   @Override
   public void stop() {
      System.out.println("Stopping");

   }

   @Override
   public void previous() {
      System.out.println("Previous");

   }

   @Override
   public void next() {
      System.out.println("Next");

   }

}
