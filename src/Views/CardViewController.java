package Views;

import Models.Card;
import Models.DeckOfCards;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class CardViewController implements Initializable {

    
    @FXML
    private ImageView imageView;

    @FXML
    private Label suitLabel;

    @FXML
    private Label faceNameLabel;

    @FXML
    private Label valueLabel;
    
    private DeckOfCards deck;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        deck = new DeckOfCards();
        deck.shuffle();
        updateViewWithNewCard();
    }    
    
    @FXML
    public void updateViewWithNewCard()
    {
        Card card = deck.dealTopCard();
        imageView.setImage(card.getImage());
        suitLabel.setText(card.getSuit());
        faceNameLabel.setText(card.getFaceName());
        valueLabel.setText(Integer.toString(card.getFaceValue()));
    }
    
    
}
