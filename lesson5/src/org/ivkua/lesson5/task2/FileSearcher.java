package org.ivkua.lesson5.task2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileSearcher {
    private final FilenameFilter filterMore5;
    private static final FileFilter directoryFilter = new DirectoryFilter();


    FileSearcher(FilenameFilter filter) {
        this.filterMore5 = filter;
    }

    public void search(String path) {
        File file = new File(path);

        if(!file.exists()){
            throw new IllegalArgumentException("Path doesn't exist");
        } else if (!file.isDirectory()){
            throw new IllegalArgumentException("Directory wasn't find");
        }

        search(file);
    }

    private void search(File file) {
        String[] filteredList = file.list(filterMore5);
        if (filteredList != null) {
            for (String element : filteredList) {
                System.out.println(element);
            }
        }

        File[] directories = file.listFiles(directoryFilter);
        if (directories != null) {
            for (File directory : directories) {
                search(directory);
            }
        }
    }
}
