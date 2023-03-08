package main.java.strategy;

import java.util.Arrays;
import java.util.List;

public class SimpleCompositor implements Compositor{
    @Override
    public List<String> compose(String textStream) {
        String newTextStream = textStream.replaceAll("\\.\\s", "\\.\n");

        return Arrays.asList(newTextStream.split("\n"));
    }
}
