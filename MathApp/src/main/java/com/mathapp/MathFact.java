import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MathFact{
    private int factID;
    private String historyFigure;
    private ImageIcon historyFigureImg;
    private JLabel historyFigureLabel;
    private String factContent;

    public MathFact()  {}
    public MathFact(int id, String figure, ImageIcon figureImg, JLabel figureLabel, String content){
        this.factID = id;
        this.historyFigure = figure;
        this.historyFigureImg = figureImg;
        this.historyFigureLabel = figureLabel;
        this.factContent = content;
    }

    public int getFactID(){
        return this.factID;
    }

    public void setFactID(int other){
        this.factID = other;
    }

    public String getHistoryFigure(){
        return this.historyFigure;
    }

    public void setHistoryFigure(String other){
        this.historyFigure = other;
    }

    public ImageIcon getHistoryFigureIcon(){
        return this.historyFigureImg;
    }

    public void setHistoryFigureIcon(ImageIcon other){
        this.historyFigureImg = other;
    }

    public JLabel getHistoryFigureLabel(){
        return this.historyFigureLabel;
    }

    public void setHistoryFigureLabel(JLabel other){
        this.historyFigureLabel = other;
    }

    public String getFactContent(){
        return this.factContent;
    }

    public void setFactContent(String other){
        this.factContent = other;
    }

}