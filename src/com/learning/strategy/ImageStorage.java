package com.learning.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.apply(fileName);

//        if (compressor =="jpeg")
//            System.out.println(">>> compressing using JPEG");
//        else if (compressor =="png")
//            System.out.println(">>> compressing using JPEG");

//        if (filter =="b&w")
//            System.out.println(">>>Applying B& W filter");
//        if (filter =="high-contrast")
//            System.out.println(">>>Applying high-contrast filter");
    }
}
