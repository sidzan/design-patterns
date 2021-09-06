package com.learning;

import com.learning.iterator.BrowserHistory;
import com.learning.iterator.Iterator;
import com.learning.strategy.BlackAndWhite;
import com.learning.strategy.ImageStorage;
import com.learning.strategy.JpegCompressor;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JpegCompressor(),new BlackAndWhite());
        imageStorage.store("a");
        // write your code here
// Iterator pattern
//        var history = new BrowserHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        Iterator iterator = history.createIterator();
//        while (iterator.hasNext()){
//            var url = iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }

//        for (var i = 0; i < history.getUrls().size(); i++) {
//            var url = history.createIterator().current();
//            System.out.println(url);
//        }
        // iterator Pattern END
    }
}
