// Create an abstract type called Product that will implement the
// Item interface. Product will implement the basic functionality
// that all items on a production line should have
public abstract class Product implements Item {
   public int id;
   public ItemType type;
   public String manufacturer;
   public String name;

   // Add a constructor that will take in the name, manufacturer,
   // and type of the product and set them to the field variables.
   public Product(String name,
                  String manufacturer,
                  ItemType type) {
      this.name = name;
      this.manufacturer = manufacturer;
      this.type = type;
   }


   public Product() {
   }


   public String toString() {
      return "Name: " + name
         + "\nManufacturer: " + manufacturer
         + "\nType: " + type.getType();
   }


   // Complete the methods from the interface Item.

   public int getId() {
      return id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public ItemType getType() {return type;}

   public void setType(ItemType type){this.type = type;}


}

class Widget extends Product {
   Widget(String name,
          String manufacturer,
          ItemType type) {
      super(name, manufacturer, type);
   }

}