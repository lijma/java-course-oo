package org.marvin.javaoo.todolist2.oo.task;

import org.marvin.javaoo.todolist2.oo.printer.Printer;

/**
 * code by Marvin
 * 继承的概念
 */
public class ExceriseTask extends Task {

    private int hours;

    public ExceriseTask(String name, String note, int hours, Printer printer) {
        super(name, note, printer);
        this.hours = hours;
    }

    @Override
    public void about() {
        System.out.println("我是一个运动任务！");
    }
}
