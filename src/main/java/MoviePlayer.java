// Create a class called MoviePlayer that extends
// Product and implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

   // Add 2 fields to this class called screen and monitorType and assign
   // appropriate types to them.
   public Screen screen;
   public MonitorType monitorType;

   public MoviePlayer(String name,
                      String manufacturer,
                      Screen screen,
                      MonitorType monitorType){
      this.name = name;
      this.manufacturer = manufacturer;
      this.screen = screen;
      this.monitorType = monitorType;
      this.type = ItemType.VISUAL;
   }

   public String toString() {
      return "Name: " + this.name
         + "Manufacturer: " + this.manufacturer
         + "Screen: " + this.screen
         + "Monitor Type: " + this.monitorType
         + "Item Type: " + this.type;
   }

   // just like audioPlayer there is an error if getID method isnt here. Need
   @Override
   public int getId() {
      return 0;
   }

   @Override
   public void play() {
      System.out.println("Playing");

   }

   @Override
   public void stop() {
      System.out.println("Stopped");

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
