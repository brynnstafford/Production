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
