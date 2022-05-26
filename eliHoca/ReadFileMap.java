package eliHoca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFileMap {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> wordCounter = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(""));
    }
}
