package com.learning.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    //    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
//        return new ListIterator(this);
    }

    public class ArrayIterator implements Iterator {
        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

//    public class ListIterator implements Iterator {
//        private BrowserHistory history;
//        private int index;
//
//        public ListIterator(BrowserHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index< history.urls.size());
//        }
//
//        @Override
//        public Object current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}
