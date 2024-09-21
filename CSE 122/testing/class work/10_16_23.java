import java.util.*;
import java.io.*;

public class 10_16_23 {
    public static void main(String[] args) {
        // everything inside array all the same primitive type
        // int[] arr = new int[4];
        // int[][] a = new int[4][3];
        //  4 rows 3 columns
        
        // for (int i = 0; i < list.length; i++) {
        //     for (int j = 0; j < list[i].length; j++) {
        //         //do something with list [i][j]
        //     }
        // }
        // Arrays.toString(array);
        // .fill(array, value);
        // .equals(array1, array 2);
        // .deepToString(array);
        // .deepEquals(array1, array2);
        // 

        // picture.java - represents idea of a picture in program
        // color.java - rep colors in program, use rgb each color (0-255)
        //  each color has 8 bits, one color i 3 bits
        // 
        // pic.getPixels(); - returns color[][] representing colors in grid of pixel
        // .setPixsels(colorArray); - sets grid of pixels in pictures based on given color array
        // .save(fileName);
        // .show();

        // color.getRed(); 
        // .getGreen();
        // .getBlue();
        // Color color = new Color(redVal, greenVal, blueVal)
        // 

    }
}
import java.awt.*;

public class ImageManipulation {
    public static void main(String[] args) {
        Picture pic = new Picture("suzzallo.jpg");
        Color[][] pixels = pic.getPixels();

        // TODO: Apply filter from Task 1
        increaseColor(pixels);
        pic.setPixels(pixels);
        pic.save("creative1.jpg");

        // TODO: Apply filter from Task 2
        invertImage(pixels);
        pic.setPixels(pixels);
        pic.save("creative2.jpg");

        // TODO: Apply filter from Task 3
        invertArea(pixels, 100, 100, 190, 190);
        pic.setPixels(pixels);
        pic.save("creative3.jpg");
        pic.show();

        // TODO: Apply filter from Task 4

        // Save the completed image with all filters applied.
        pic.setPixels(pixels);
        pic.save("creative4.jpg");
    }

    // TODO: Your methods here
    public static void increaseColor(Color[][] pixels) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                Color originalColor = pixels[i][j];
                int red = originalColor.getRed();
                int green = originalColor.getGreen();
                int blue = originalColor.getBlue();

                // Amount of increase
                red = Math.min(red + 63, 255);
                green = Math.min(green + 13, 255);
                blue = Math min(blue + 94, 255);

                Color newColor = new Color(red, green, blue);
                pixels[i][j] = newColor;
            }
        }
    }

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
}
public static void mirrorRight(Color[][] pixels) {
    int width = pixels[0].length;

    for (int i = 0; i < pixels.length; i++) {
        for (int j = 0; j < width / 2; j++) {
            int x = width - 1 - j; // Calculate the corresponding x-coordinate on the right side

            // Swap the colors between the left and right sides
            Color leftColor = pixels[i][j];
            Color rightColor = pixels[i][x];

            pixels[i][j] = rightColor;
            pixels[i][x] = leftColor;
        }
    }
}

// idk wtf im doing
                if (j < pixels[i].length/2) {
                    Color originalColor = pixels[i][j];
                    int red = originalColor.getRed();
                    int green = originalColor.getGreen();
                    int blue = originalColor.getBlue();

                    Color newColor = new Color(red, green, blue);
                    pixels[i][j] = newColor;
                } else if (j > pixels[i].length) {
                    
                }
                int x = pixels[i].length - 1 - j;
                Color leftSide = pixels[i][j];
                int red = leftSide.getRed();
                int green = leftSide.getGreen();
                int blue = leftSide.getBlue();

                Color switchSide = new Color(red, green, blue);
                pixels[i][j] = switchSide;