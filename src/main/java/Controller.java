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
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

// controller
public class Controller {

   private ObservableList<Product> productLine;



   @FXML
   private Label lblProductOutput; // label output for add product
   @FXML
   private Label lblOutput2;       // label output for record production
   @FXML
   private Label lblOutput;
   @FXML
   private TextField txtProductId;
   @FXML
   private ComboBox<String> produceCmbQuantity;  // fxml ID for product combo box
   @FXML
   private ChoiceBox<ItemType> productCbItemType;


   // saves displayProduct to database and prints "Product added"
   public void displayProduct(ActionEvent actionEvent) {
      saveToDb();
      lblProductOutput.setText("Product Added");
   }


   // output for record production method (need to change name)
   public void display2(ActionEvent actionEvent) {
      lblOutput2.setText("(System.out.println)");
   }



   public void initialize() {

      // set produce combobox values 1-10 (editable)
      for (int count = 1; count <= 10; count++) {
         produceCmbQuantity.getItems().add(String.valueOf(count));
         produceCmbQuantity.setEditable(true);
         //getSelectionModel().selectFirst(); used scene builder to set default
      }

      // set product choicebox values to ItemType values
      for (ItemType it : ItemType.values()) {
         //System.out.println(it + " " + it.code);
         productCbItemType.getItems().add(it);
      }

   }

   // Demonstrate this functionality in your user interface. For example, you could use the code below and
   // call testMultimedia in your initialize method or you could do something more elaborate in the GUI.
   public static void testMultimedia() {

      AudioPlayer newAudioProduct = new AudioPlayer("DP-X1A", "Onkyo",

         "DSD/FLAC/ALAC/WAV/AIFF/MQA/Ogg-Vorbis/MP3/AAC", "M3U/PLS/WPL");

      Screen newScreen = new Screen("720x480", 40, 22);

      MoviePlayer newMovieProduct = new MoviePlayer("DBPOWER MK101", "OracleProduction", newScreen,

         MonitorType.LCD);

      ArrayList<MultimediaControl> productList = new ArrayList<MultimediaControl>();

      productList.add(newAudioProduct);

      productList.add(newMovieProduct);

      for (MultimediaControl p : productList) {

         System.out.println(p);

         p.play();

         p.stop();

         p.next();

         p.previous();

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

         // string instrts type, ma
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