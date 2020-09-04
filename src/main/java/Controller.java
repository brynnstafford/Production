import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

   @FXML
   private Label lblOutput1;
   @FXML
   private Label lblOutput2;


   public void display1(ActionEvent actionEvent) {
      lblOutput1.setText("(System.out.println)");
   }

   public void display2(ActionEvent actionEvent) {
      lblOutput2.setText("(System.out.println)");
   }
}