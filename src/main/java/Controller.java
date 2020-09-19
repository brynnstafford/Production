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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

// controller manages the functions used to keep track of production log information
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
}