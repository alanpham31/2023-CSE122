import java.awt.*;

public class testImageManipulation {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // Load the image (replace with your image file path)
        Picture pic = new Picture("suzzallo.jpg");

        // Get the 2D array of pixel colors
        Color[][] pixels = pic.getPixels();

        // Apply image manipulation (increase the red component)
        increaseRed(pixels);

        // Set the modified pixels back to the picture
        pic.setPixels(pixels);

        // Display the modified image
        pic.show();
    }

    public static void increaseRed(Color[][] pixels) {
        // Loop through all the pixels in the 2D array
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                // Retrieve the original color of the pixel
                Color originalColor = pixels[i][j];

                // Retrieve the individual RGB components
                int red = originalColor.getRed();
                int green = originalColor.getGreen();
                int blue = originalColor.getBlue();

                // Increase the red component by 100 (cap it at 255)
                red = Math.min(red + 100, 255);

                // Create a new Color with the modified RGB values
                Color newColor = new Color(red, green, blue);

                // Replace the old Color in the 2D array with the new one
                pixels[i][j] = newColor;
            }
        }
    }
}