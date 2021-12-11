package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes types) {
        if (types == null) {
            throw new IllegalArgumentException();
        }
        try {
            if (types.equals(ImageTypes.BMP)) {
                return new BmpReader();
            }
            if (types.equals(ImageTypes.JPG)) {
                return new JpgReader();
            }
            if (types.equals(ImageTypes.PNG)) {
                return new PngReader();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }
        return null;
    }
}
