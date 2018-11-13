package Views;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class LaunchCardView extends Application{
    
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("CardView.fxml"));
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Card View");
       primaryStage.show();
    }
    
    
}
