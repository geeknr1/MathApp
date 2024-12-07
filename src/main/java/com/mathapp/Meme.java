import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Meme{
    private int memeID;
    private ImageIcon imgIcon;
    private JLabel label;

    public Meme()   {}
    public Meme(int id, ImageIcon icon, JLabel label){
        this.memeID = id;
        this.imgIcon = icon;
        this.label = label;
    }

    public int getMemeID(){
        return this.memeID;
    }

    public void setMemeID(int other){
        this.memeID = other;
    }

    public ImageIcon getIcon(){
        return this.imgIcon;
    }

    public void setIcon(ImageIcon other){
        this.imgIcon = other;
    }

    public JLabel getLabel(){
        return this.label;
    }

    public void setLabel(JLabel other){
        this.label = other;
    }
}