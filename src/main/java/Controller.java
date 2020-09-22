/******************************************************************************
 *    File: io.github.brynnstafford.Controller.java
 *    Date: 09/19/2020
 *   Class: COP 3003
 *  Author: B.Stafford
 * Purpose: controller file for production project. Program permits
 *          a user to add new products that are able to be produced and store
 *          them in a collection. The collection of products that can be
 *          produced can be displayed at any time. Allow a user to track
 *          production of products, including specifying how many items of that
 *          product were created. The program will then create a record for each
 *          of these items and store them in a collection..
 *******************************************************************************/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// controller
public class Controller {
   @FXML
   private Label lblProductOutput; // label output for add product
   @FXML
   private Label lblOutput2;       // label output for record production

   // saves displayProduct to database and prints "Product added"
   public void displayProduct(ActionEvent actionEvent) {
      saveToDb();
      lblProductOutput.setText("Product Added");
   }

   public void display2(ActionEvent actionEvent) {

      lblOutput2.setText("(System.out.println)");
   }

   @FXML
   private Label lblOutput;

   @FXML
   private TextField txtProductId;


   @FXML
   private ComboBox<String> productCmbQuantity;  // fxml ID for product combo box

   // product combo box drop down 1-10
   public void initialize() {
      for (int count = 1; count <= 10; count++) {
         productCmbQuantity.getItems().add(String.valueOf(count));
      }
   }



   @FXML
   void showDetails(ActionEvent event) {
      saveToDb();
   }

   // connect to database, set up h2 driver
   public void saveToDb() {
      final String JDBC_DRIVER = "org.h2.Driver";
      final String DB_URL = "jdbc:h2:./res/HR";

      //  Database credentials
      final String USER = "";
      final String PASS = "";
      Connection conn = null;
      Statement stmt = null;


      try {
         // STEP 1: Register JDBC driver
         Class.forName(JDBC_DRIVER);

         //STEP 2: Open a connection
         conn = DriverManager.getConnection(DB_URL, USER, PASS);

         //STEP 3: Execute a query
         stmt = conn.createStatement();

         //String productName = txtProductId.getText();

         // product state
         String productType = "Audio";
         String productManufacturer = "Apple";
         String productName = "Ipod";

         String insertSql = "INSERT INTO Product(type, manufacturer, name) "
         + "VALUES ( '"+productType+"', '"+productManufacturer+"', '"+productName+"' )";

         stmt.executeUpdate(insertSql);
         System.out.println(insertSql);


         // STEP 4: Clean-up environment
         stmt.close();
         conn.close();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}