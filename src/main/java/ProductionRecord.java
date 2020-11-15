// Create a  ProductionRecord class with int fields for
// productionNumber (this will be unique for every item produced
// and get auto incremented by the database), an int field for productID
// (to correspond to the productID from the Product table / class),
// String field for serialNumber, and a field for the dateProduced that
// is type Date (from java.util).
import java.util.Date;
public class ProductionRecord {

   private int productionNumber;
   private int productID;
   private String serialNumber;
   private Date dateProduced;


   // Make one constructor that just has a parameter for the productID.
   // This will be the constructor called when the user records production
   // from the user interface.
   public ProductionRecord(int productID){
      this.productionNumber = 0;
      this.serialNumber = "0";
      this.dateProduced = new Date();
   }



   // Create accessors and mutators for all fields.
   public void setProductionNumber(int productionNumber){
      this.productionNumber = productionNumber;
   }

   public int getProductionNumber(){
      return this.productionNumber;
   }

   public void setProductID(int productID){
      this.productID = productID;
   }

   public int getProductID(){
      return this.productID;
   }

   public void setSerialNumber(String serialNumber){
      this.serialNumber = serialNumber;
   }

   public String getSerialNumber(){
      return this.serialNumber;
   }

   public void setDateProduced(Date dateProduced){
      this.dateProduced = dateProduced;
   }

   public Date getDateProduced(){
      return this.dateProduced;
   }


}

