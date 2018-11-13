package Models;


import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;




/**
 *
 * @author jwright
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    private Image image;
    
    private static List<String> validFaces = Arrays.asList("2","3","4","5","6","7",
                                        "8","9","10","Jack","Queen","King","Ace");
    
    private static List<String> validSuits = Arrays.asList("Spades","Clubs","Hearts",
                                                            "Diamonds");
    
    /**
     * This is a constructor.  It MUST have the exact same name as your class
     */
    public Card(String faceName, String suit)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue();
        setImage();
    }
    
    
    private void setImage()
    {
        String imageName = String.format("./images/%s_of_%s.png",faceName,suit);
        image = new Image(imageName);
    }

    public Image getImage() {
        return image;
    }
    
    
    /**
     * This method will validate the face name and then set the instance
     * variable
     */
    public void setFaceName(String face)
    {
        if (validFaces.contains(face))
            this.faceName=face;
        else
            throw new IllegalArgumentException("Only valid faces names are: "
                                        +validFaces);
    }
    
    public void setSuit(String suit)
    {
        if (validSuits.contains(suit))
            this.suit=suit;
        else
            throw new IllegalArgumentException("Only valid suits are: "+validSuits);
    }
    
    public void setFaceValue()
    {
        faceValue=validFaces.indexOf(this.faceName)+2;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s of %s with value %d", faceName, suit, faceValue);
    }

    /**
     * Return the value of the card
     */
    public int getFaceValue()
    {
        return faceValue;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public static List<String> getValidFaces() {
        return validFaces;
    }

    public static List<String> getValidSuits() {
        return validSuits;
    }
}