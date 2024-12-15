package org.marvin.javaoo.todolist2.oo.printer;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.printf("命令行Printer：%s%n",message);
    }
}
