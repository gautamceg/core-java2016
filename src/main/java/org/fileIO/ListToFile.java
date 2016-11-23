package org.fileIO;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gargg on 15/11/16.
 */
public class ListToFile {


    public static void main(String[] args) {
        Path file = Paths.get("/cobalt/test123.txt");
        List<String> lines = new ArrayList<>();
        lines.add("Lorem Ipsum is simply dummy text of the printing ");
        lines.add("and typesetting industry. Lorem Ipsum has been the ");
        lines.add("industry's standard dummy text ever since the 1500s, ");
        lines.add("when an unknown printer took a galley of type and ");
        lines.add("scrambled it to make a type specimen book.");

        try {
            //
            // Write lines of text to a file.
            //
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
