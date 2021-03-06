package org.ivkua.lesson5.task1;

import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilter implements FilenameFilter {

    private final String[] extensions;

    public ExtensionFilter(String[] extensions) {
        this.extensions = extensions;
    }

    @Override
    public boolean accept(File dir, String name) {
        for (String extension : extensions) {
            if (name.endsWith("." + extension)) {
                return true;
            }
        }
        return false;
    }

}
