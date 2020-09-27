public abstract class Product {
   private int id;
   private String type;
   private String manufacturer;
   private String name;

   int getId(){return id;}
   void setName(String name){}
   String getName(){return name;}
   void setManufacturer(String name){}
   String getManufacturer(){return name;}

   void setProduct(String n, String m, String t){
      n = name;
      m = manufacturer;
      t = type;
   }

   public String toString() {
      return "Name: " + name
         + "Manufacturer: " + manufacturer
         + "Type: " + type;
   }


}
