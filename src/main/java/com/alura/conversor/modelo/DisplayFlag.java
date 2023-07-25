package com.alura.conversor.modelo;

import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

import javax.imageio.ImageIO;

public class DisplayFlag {
    public Image Display(String imageUrl) throws Exception {
        try {
            URI uri = new URI(imageUrl);
            URL url = uri.toURL();
            Image image = ImageIO.read(url);
            return image;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
