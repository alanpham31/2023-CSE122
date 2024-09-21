// Name: Alan Pham
// TA: Kevin Nguyen
// Date: Oct 26 2023
// This program applies filters to images. the filters can add a tint,
// invert colors for the whole picture and a specified area, and mirror the right
// side of the image. 

import java.util.*;
import java.awt.*;

public class ImageManipulation {
    public static void main(String[] args) {
        
        Picture pic = new Picture("suzzallo.jpg");
        Color[][] pixels = pic.getPixels();

        // TODO: Apply filter from Task 1
        // increaseColor(colorPixels, width, height, color c)
        increaseColor(pixels);
        pic.setPixels(pixels);
        pic.save("creative1.jpg");

        // TODO: Apply filter from Task 2
        invertImage(pixels);
        pic.setPixels(pixels);
        pic.save("creative2.jpg");

        // TODO: Apply filter from Task 3
        invertArea(pixels, 100, 100, 200, 500);
        pic.setPixels(pixels);
        pic.save("creative3.jpg");

        // TODO: Apply filter from Task 4
        mirrorRight(pixels);
        // save completed image with all filters applied.
        pic.setPixels(pixels);
        pic.save("creative4.jpg");
        pic.show();
    }

    // TODO: Your methods here

    // this method puts a color filter over image
    public static void increaseColor(Color[][] pixels) {
        // System.out.println("x: " + x + " " + "y: " + y);
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                Color originalColor = pixels[i][j];
                int red = originalColor.getRed();
                int green = originalColor.getGreen();
                int blue = originalColor.getBlue();

                // amount of increase
                red = Math.min(red + 63, 255);
                green = Math.min(green + 13, 255);
                blue = Math.min(blue + 94, 255);

                Color newColor = new Color(red, green, blue);
                pixels[i][j] = newColor;
            }
        }
    }

    // this method inverts images
    public static void invertImage(Color[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                Color originalColor = pixels[i][j];
                int red = originalColor.getRed();
                int green = originalColor.getGreen();
                int blue = originalColor.getBlue();

                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;

                Color newColor = new Color(red, green, blue);
                pixels[i][j] = newColor;
            }
        }
    }

    // this method inverts a specified area
    public static void invertArea(Color[][] pixels, int row1, int col1, int row2, int col2) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                Color originalColor = pixels[i][j];
                int red = originalColor.getRed();
                int green = originalColor.getGreen();
                int blue = originalColor.getBlue();
                
                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;

                Color newColor = new Color(red, green, blue);
                pixels[i][j] = newColor;
            }
        }
    }

    // this method mirrors the right side of an image
    public static void mirrorRight(Color[][] pixels) {
       for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int x = pixels[i].length - 1 -j;
                Color rightSide = pixels[i][x];
                pixels[i][j] = rightSide;
            }
        }
    }
}