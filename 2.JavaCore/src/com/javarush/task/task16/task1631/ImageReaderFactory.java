package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes ext) {

        ImageReader res = null;

        if (ext == ImageTypes.JPG) res = new JpgReader();
        if (ext == ImageTypes.BMP) res = new BmpReader();
        if (ext == ImageTypes.PNG) res = new PngReader();

        if(res == null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return res;
    }
}
