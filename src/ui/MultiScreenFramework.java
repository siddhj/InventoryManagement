package ui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author siddhartha.jain
 */
public class MultiScreenFramework extends Application {
    public static String screen1ID = "main";
    public static String screen1File = "Screen1.fxml";
    public static String loginscreen = "LoginScreen";
    public static String loginscreenfile = "LoginScreen.fxml"; 
    public static String homescreen = "HomeScreen";
    public static String homescreenfile = "HomeScreen.fxml";
    
    @Override
    public void start(Stage primaryStage) {
        
        MainScreenController mainController = new MainScreenController();
        mainController.loadScreen(MultiScreenFramework.loginscreen, MultiScreenFramework.loginscreenfile);
        mainController.loadScreen(MultiScreenFramework.homescreen, MultiScreenFramework.homescreenfile);
        
        mainController.setScreen(MultiScreenFramework.loginscreen);
        
        Group root = new Group();
        root.getChildren().addAll(mainController);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
  
    public static void main(String[] args) {
        launch(args);
    }
}
