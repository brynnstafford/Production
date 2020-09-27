
/******************************************************************************
 *     File: io.github.brynnstafford.Main.java
 *     Date: 09/19/2020
 *    Class: COP 3003
 *   Author: B.Stafford
 *  Purpose: main application file for production project. Program permits
 *           a user to add new products that are able to be produced and store
 *           them in a collection. The collection of products that can be
 *           produced can be displayed at any time. Allow a user to track
 *           production of products, including specifying how many items of that
 *           product were created. The program will then create a record for each
 *           of these items and store them in a collection..
 * Websites: https://sites.google.com/site/profvanselow/course/cop-3003/oop-project
 *           https://sites.google.com/site/profvanselow/course/cop-3003/gui
 *******************************************************************************/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// main loads and builds fxml production interface (driver class?)
public class Main extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
      // use sample.fxml as format
      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

      // build scene
      Scene scene = new Scene(root, 300, 275);

      primaryStage.setTitle("Brynn's Awesome Production Project"); // title
      primaryStage.setScene(scene);
      primaryStage.show();

   }
}
