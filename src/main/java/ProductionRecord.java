// Create a  ProductionRecord class with int fields for
// productionNumber (this will be unique for every item produced
// and get auto incremented by the database), an int field for productID
// (to correspond to the productID from the Product table / class),
// String field for serialNumber, and a field for the dateProduced that
// is type Date (from java.util).
import java.util.Date;
public class ProductionRecord {

   int productionNumber = 0;
   int productID;
   String serialNumber;
   Date dateProduced;

   Product product;
   int itemCount;


   // Make one constructor that just has a parameter for the productID.
   // This will be the constructor called when the user records production
   // from the user interface.
   public ProductionRecord(int productID){
      this.productID = productID;
      this.serialNumber = String.valueOf(0);
      this.dateProduced = new Date();
   }


   // overloaded constructor with all parameters
   public ProductionRecord(int productionNumber,
                           int productID,
                           String serialNumber,
                           Date dateProduced){
      this.productionNumber = productionNumber;
      this.productID = productID;
      this.serialNumber = serialNumber;
      this.dateProduced = dateProduced;
   }

   // overloaded ProductionRecord constructor to accept a product and an int
   // which holds the count of the number of items
   // of its type that have been created
   public ProductionRecord(Product product,
                           int itemCount){
      this.product = product;
      this.itemCount = itemCount;
      // substring returns the the first 3 letters of the manufacturer
      this.serialNumber = product.getManufacturer().substring(0,3)
         + product.getType().code
         + String.format("%05d", itemCount);
      this.dateProduced = new Date();



   }

   public String toString(){
      return "Prod. Num: " + getProductionNumber()
         + "\nProduct ID: " + getProductID()
         + "\nSerial Num: " + getSerialNumber()
         + "\nDate: " + getDateProduced();
   }




   // Create accessors and mutators for all fields.
   public void setProductionNumber(int productionNumber){
      this.productionNumber = productionNumber;
   }

   public int getProductionNumber(){
      return productionNumber;
   }

   public void setProductID(int productID){
      this.productID = productID;
   }

   public int getProductID(){
      return productID;
   }

   public void setSerialNumber(String serialNumber){
      this.serialNumber = serialNumber;
   }

   public String getSerialNumber(){
      return serialNumber;
   }

   public void setDateProduced(Date dateProduced){
      this.dateProduced = dateProduced;
   }

   public Date getDateProduced(){
      return dateProduced;
   }


}

