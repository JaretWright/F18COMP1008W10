import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class AboutMeController implements Initializable {

    @FXML
    private Label nameLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        nameLabel.setText("I just changed the text");
    }    
    
    @FXML
    public void showNickName()
    {
        nameLabel.setText("My friends call me JDub");
    }
    
    @FXML
    public void showProperName()
    {
        nameLabel.setText("My name is Jaret Wright");
    }
    
}
