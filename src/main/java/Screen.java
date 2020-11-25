// Create a class called Screen that implements ScreenSpec.
// Add three fields
public class Screen implements ScreenSpec{
   String resolution;
   int refreshRate;
   int responseTime;

   public Screen(String resolution,
                 int refreshRate,
                 int responseTime){
      this.resolution = resolution;
      this.refreshRate = refreshRate;
      this.responseTime = responseTime;
   }

   // Add a toString method that will return the details of the
   // 3 fields in the same format as the Product class.
   @Override
   public String toString(){
      return "Resolution: " + this.resolution
         + "\nRefresh rate: " + this.refreshRate
         + "\nResponse time: "+ this.responseTime;
   }


   // Complete the methods from the ScreenSpec interface.
   @Override
   public String getResolution() {
      return resolution;
   }

   @Override
   public int getRefreshRate() {
      return refreshRate;
   }

   @Override
   public int getResponseTime() {
      return responseTime;
   }
}


