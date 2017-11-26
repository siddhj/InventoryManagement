
package POC;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author siddhartha.jain
 */
public class Loader extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TableTest.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Table View");
        stage.show();
    }
    
    public static void main(String args[])
    {
    launch(args);
    }
}
