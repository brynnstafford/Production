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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

// controller
public class Controller {
   @FXML
   private Label lblOutput1; // label output for add product
   @FXML
   private Label lblOutput2; // label output for record production

   public void display1(ActionEvent actionEvent) {
      lblOutput1.setText("(System.out.println)");
   }

   public void display2(ActionEvent actionEvent) {
      lblOutput2.setText("(System.out.println)");
   }

   @FXML
   private Label lblOutput;

   @FXML
   private TextField txtProductId;

   /*
   @FXML
   private TextField txtEmpId;

   @FXML
   private Label lblEmpInfo;
   */

   @FXML
   private ComboBox<String> cmbQuantity;

   // employee combo box drop down 1-10
   public void initialize() {
      for (int count = 1; count <= 10; count++) {
         cmbQuantity.getItems().add(String.valueOf(count));
      }
   }

   @FXML
   void showDetails(ActionEvent event) {
      connectToDB();
   }

   // connect to database, set up h2 driver
   public void connectToDB() {
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

         String insertSql = "INSERT INTO Product(type, manufacturer, name) "
         + "VALUES ( 'AUDIO', 'Apple', 'iPod' )";

         stmt.executeUpdate(insertSql);



         //String empId = txtEmpId.getText();

         /*String insertSql = "INSERT INTO EMPLOYEES(employee_id, first_name, last_name, email, "
            + "phone_int, hire_date, job_id, salary, department_id) VALUES (300, 'Vlad', "
            + "'Hardy', 'vhardy', '22', '1987-06-17', 'AD_PRES', 200000, 90)";
          */

         // stmt.executeUpdate(insertSql);

         /*String sql = "SELECT email, first_name, last_name "
            + "FROM employees "
            + "where employee_id = " + empId;

         ResultSet rs = stmt.executeQuery(sql);

         rs.next();
         String empEmail = rs.getString(1);
         String empFirstName = rs.getString(2);
         String empLastName = rs.getString(3);

         lblEmpInfo.setText(empFirstName + " " + empLastName + " " + empEmail + "@tiktok.com");
         */

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