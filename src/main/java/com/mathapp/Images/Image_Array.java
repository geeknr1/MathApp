package com.mathapp.Images;

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.io.File;

import java.util.Random;

public class Image_Array extends Applet{
    private int nrImages;
    private ArrayList<Image> memeImages;
    private static String folderPath;
    private Image randomImage;

    public Image_Array()    {};
    public Image_Array(int nr, String path){
        this.nrImages = nr;
        this.folderPath = path;
    }

    public void loadImages(String folderPath){
        File folder = new File("/home/alex/programming/MathApp/Avg_Memes");
        if(! folder.exists() || ! folder.isDirectory()){
            System.out.println("System error!");
            return; 
        }
        
        File[] imgFiles = folder.listFiles();
        if(imgFiles.length == 0){
            System.out.println("No image found");
            return;
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(File img: imgFiles){
            Image i = toolkit.getImage(img.getAbsolutePath());
            memeImages.add(i);
        }  
    }

    public void drawRandomMeme(){
        setSize(500,400);
        loadImages(folderPath);
        if(! memeImages.isEmpty()){
            Random randImg = new Random();
            int randomIndex = randImg.nextInt(memeImages.size());
            randomImage = memeImages.get(randomIndex);
        }

        JPanel memePanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(randomImage, 200, 200, this);
            }
        };
    }
}