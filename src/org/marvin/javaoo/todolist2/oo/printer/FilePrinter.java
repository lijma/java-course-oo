package org.marvin.javaoo.todolist2.oo.printer;

public class FilePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.printf("File Printer：%s%n",message);
    }
}
