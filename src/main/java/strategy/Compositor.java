package main.java.strategy;

import java.util.List;

public interface Compositor {
    List<String> compose(String textStream);
}
