// Create a class called MoviePlayer that extends
// Product and implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

   // Add 2 fields to this class called screen and monitorType and assign
   // appropriate types to them.
   Screen screen;
   MonitorType monitorType;

   public MoviePlayer(String name,
                      String manufacturer,
                      Screen screen,
                      MonitorType monitorType) {
      super();
      this.name = name;
      this.manufacturer = manufacturer;
      this.screen = screen;
      this.monitorType = monitorType;
      this.type = ItemType.VISUAL;
   }

   public String toString() {
      return "Name: " + this.name
         + "\nManufacturer: " + this.manufacturer
         + "\nScreen: " + this.screen
         + "\nMonitor Type: " + this.monitorType
         + "\nItem Type: " + this.type;
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
