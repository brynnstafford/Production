
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


//-----------------------------------------------------------------------------
// Global space- constants, functions, data structures, etc.
//-----------------------------------------------------------------------------

// main calls functions to run Production log window
public class Main extends Application {

   public static void main(String[] args) {
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

      Scene scene = new Scene(root, 300, 275);

      primaryStage.setTitle("Production Project");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
