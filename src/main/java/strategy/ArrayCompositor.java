package main.java.strategy;

import java.util.ArrayList;
import java.util.List;

public class ArrayCompositor implements Compositor{
    @Override
    public List<String> compose(String textStream) {
        List<String> newTextStream = new ArrayList<>();

        int tokenSize = 20;
        for (int i = 0; i < textStream.length(); i += tokenSize + 1) {
            int end = Math.min(i + tokenSize, textStream.length());
            newTextStream.add(textStream.substring(i, end));
        }
        return newTextStream;
    }
}
