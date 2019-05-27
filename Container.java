package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SaveTo(path="D:\\1.txt")
public class Container {
    String text="...";
    @Saver
    public void save(String path) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(text);
        }
    }
}
