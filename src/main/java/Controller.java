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


import java.sql.*;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

// controller
public class Controller {

   // Product line

   // Production log

   // Employee



   @FXML
   private Label lblProductOutput; // label output for add product
   @FXML
   private Label lblOutput2;       // label output for record production
   @FXML
   private Label lblOutput;
   @FXML
   private TextField txtProductId;
   @FXML
   private TextField txtProductManufacturer;
   @FXML
   private ComboBox<String> produceCmbQuantity;  // fxml ID for product combo box
   @FXML
   private ChoiceBox<ItemType> productCbItemType;
   @FXML
   private TextArea displayProductionRecord;
   @FXML
   private TableView<Product> displayProductTblView;

   ObservableList<Product> productLine = FXCollections.observableArrayList();
   ObservableList<String> productNames = FXCollections.observableArrayList();
   ArrayList<ProductionRecord> productionRun = new ArrayList<>();


   final String JDBC_DRIVER = "org.h2.Driver";
   final String DB_URL = "jdbc:h2:./res/HR";

   //  Database credentials
   final String USER = "";
   final String PASS = "";

   Connection conn = null;
   Statement stmt = null  ;


   /*
    * executes all methods in controller
    */
   public void initialize() throws SQLException {
      connectToDb();
      produceCmbQuantity();
      productCbItemType();
      addProduct();

      disconnect();
   }

   /*
    * connects to database and sets up H2 driver
    */
   public void connectToDb() {
      try {
         // STEP 1: Register JDBC driver
         Class.forName(JDBC_DRIVER);

         //STEP 2: Open a connection
         conn = DriverManager.getConnection(DB_URL, USER, PASS);

         //STEP 3: Execute a query
         stmt = conn.createStatement();

      } catch (ClassNotFoundException e) {
         e.printStackTrace();

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   /*
    * disconnects from database
    */
   public void disconnect(){
         try {
            //stmt.close();
            conn.close();
         } catch (SQLException ex) {
            ex.printStackTrace();
         }
      }



/*

   // connect to database, set up h2 driver
   public void saveToDb() {

      try {
         // STEP 1: Register JDBC driver
         Class.forName(JDBC_DRIVER);

         //STEP 2: Open a connection
         conn = DriverManager.getConnection(DB_URL, USER, PASS);

         //STEP 3: Execute a query
         stmt = conn.createStatement();



         // product state
         String productName = txtProductId.getText();
         String productManufacturer = txtProductManufacturer.getText();
         String productType = String.valueOf(productCbItemType.getValue());


         // string inserts type, ma
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

*/


   /*
    * populate combobox in Production Log tab with 1-10
    */
   public void produceCmbQuantity() {
      for (int count = 1; count <= 10; count++) {
         produceCmbQuantity.getItems().add(String.valueOf(count));
         produceCmbQuantity.setEditable(true);
      }
   }

   /*
    * populate choice-box in Product Line tab with ItemTypes
    */
   public void productCbItemType() {
      for (ItemType it : ItemType.values()) {
         //System.out.println(it + " " + it.code);
         productCbItemType.getItems().add(it);
      }
   }


   /*
    * adds product into database
    */
   public void addProduct() throws SQLException {

      connectToDb();

      try{
         String productName = txtProductId.getText();
         String productManufacturer = txtProductManufacturer.getText();
         String productType = String.valueOf(productCbItemType.getValue());
         Product product = new Widget(productName, productManufacturer, productType);
         // ObservableList that holds all products that can be produces with widget constructor
         productLine.add(product);

         String insertSql = "INSERT INTO Product(type, manufacturer, name) "
            + "VALUES ( '"+productType+"', '"+productManufacturer+"', '"+productName+"' )";

         stmt.executeUpdate(insertSql);
         //System.out.println(insertSql);

      } catch (SQLException e) {
         e.printStackTrace();

      }

      disconnect();





   }


   // saves displayProduct to database and prints "Product added"
   public void displayProduct() {
      lblProductOutput.setText("Product Added");

   }

   // output for record production method (need to change name)
   public void display2(ActionEvent actionEvent) {
      lblOutput2.setText("(System.out.println)");
   }




   @FXML
   void showDetails(ActionEvent event) {
      connectToDb();
   }





}