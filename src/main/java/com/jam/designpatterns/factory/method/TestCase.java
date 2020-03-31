package com.jam.designpatterns.factory.method;

import com.jam.designpatterns.factory.method.factory.impl.GifReaderFactory;
import com.jam.designpatterns.factory.method.factory.impl.JpgReaderFactory;
import com.jam.designpatterns.factory.method.factory.impl.PngReaderFactory;
import com.jam.designpatterns.factory.method.factory.ReaderFactory;
import com.jam.designpatterns.factory.method.reader.Reader;

/**
 * @author wangjun
 * @description TODO
 * @date 2020/03/31
 */
public class TestCase {

    public static void main(String[] args) {
        ReaderFactory jpgReaderFactory = new JpgReaderFactory();
        Reader jpgReader = jpgReaderFactory.getReader();
        jpgReader.read();

        ReaderFactory pngReaderFactory = new PngReaderFactory();
        Reader pngReader = pngReaderFactory.getReader();
        pngReader.read();

        ReaderFactory gifReaderFactory = new GifReaderFactory();
        Reader gifReader = gifReaderFactory.getReader();
        gifReader.read();
    }
}
