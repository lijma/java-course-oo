package org.marvin.javaoo.todolist2.oo.task;

import org.marvin.javaoo.todolist2.oo.printer.Printer;

/**
 * code by Marvin
 */
public abstract class Task {

    private Printer printer;
    private String name;
    private String note;

    public Task(String name,String note, Printer printer) {
        this.name = name;
        this.note = note;
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public abstract void about();

    public Printer getPrinter() {
        return printer;
    }
}
