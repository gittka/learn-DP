package main.java.strategy;

import java.util.Arrays;
import java.util.List;

public class TextCompositor implements Compositor{
    @Override
    public List<String> compose(String textStream) {
        return Arrays.asList(textStream.split("\n"));
    }
}
