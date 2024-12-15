package org.marvin.javaoo.todolist2.oo.task;

import org.marvin.javaoo.todolist2.oo.printer.Printer;

/**
 * code by Marvin
 * 继承的概念
 */
public class FoodTask extends Task {

    public FoodTask(String name, String note, Printer printer) {
        super(name, note, printer);
    }

    public void about(){
        System.out.println("我是一个吃饭任务！");
    }
}
