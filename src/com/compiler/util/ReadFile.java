package com.compiler.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private static final String CHARSET  = "UTF-8";

    public static List<String> file(String fileName) {

        List<String> lines = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream(fileName);
            Reader reader = new InputStreamReader(inputStream, CHARSET);
            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();

            while (line != null) {
                lines.add(line);
                line = br.readLine();
            }

            br.close();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return lines;
    }
}
