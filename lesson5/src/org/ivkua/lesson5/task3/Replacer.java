package org.ivkua.lesson5.task3;

import java.io.*;

public class Replacer {
    private final String from;
    private final String to;

    Replacer(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void replace(String path) {
        File file = new File(path);
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader fileReader = new FileReader(file)) {
            try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                while(true) {
                    String line = bufferedReader.readLine();

                    if(line == null) {
                        break;
                    }

                    String replacedLine = line.replace(from, to);
                    stringBuilder.append(replacedLine)
                            .append("\r\n");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File was not found", e);
        } catch (IOException e) {
            throw new RuntimeException("Exception during reading", e);
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream)) {
                String content = stringBuilder.toString();
                outputStreamWriter.write(content);
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception during writing", e);
        }
    }
}