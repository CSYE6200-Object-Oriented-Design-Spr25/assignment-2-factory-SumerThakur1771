/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200;

import java.io.*;
import java.util.*;

/**
 *
 * @author sumer
 */
public class FileUtil {
    public static List<String> readFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        InputStream inputStream = FileUtil.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
