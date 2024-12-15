package org.marvin.javaoo.todolist2.oo.task;

import org.marvin.javaoo.todolist2.oo.printer.Printer;

/**
 * code by Marvin
 * 继承的概念
 */
public class SleepTask extends Task {

    private float duration;

    public SleepTask(String name, String note, float duration, Printer printer) {
        super(name, note, printer);
        this.duration = duration;
    }

    @Override
    public void about() {
        System.out.println("我是一个睡觉任务！");
    }
}
