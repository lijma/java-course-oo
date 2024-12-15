package org.marvin.javaoo.todolist2.oo;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.marvin.javaoo.todolist2.oo.printer.ConsolePrinter;
import org.marvin.javaoo.todolist2.oo.printer.FilePrinter;
import org.marvin.javaoo.todolist2.oo.task.ExceriseTask;
import org.marvin.javaoo.todolist2.oo.task.FoodTask;
import org.marvin.javaoo.todolist2.oo.task.SleepTask;

/**
 * 这是一个TODO list项目
 * 1. 代办列表
 * 2. 添加一个代办事项
 * 3. 完成一个代办事项，从代办事项里面移除掉
 * 下面这段代码是Marvin实现的
 */
public class Main {

    public static void main(String[] args) {
        //创建了一个代办列表的对象，myList
        TodoList myList = new TodoList();
        myList.print();

        FilePrinter filePrinter = new FilePrinter();
        ConsolePrinter consolePrinter = new ConsolePrinter();

        //第1个代办事项
        ExceriseTask task1 = new ExceriseTask("早上6点早起去锻炼！", "demo", 2, consolePrinter);
        task1.about();
        myList.addTodo(task1);
        myList.print();

        //第2个代办事项
        SleepTask task2 = new SleepTask("晚上9点上床睡觉！", "demo",9.5f, filePrinter);
        task2.about();
        myList.addTodo(task2);
        myList.print();

        //第3个代办事项
        FoodTask task3 = new FoodTask("中午吃大肉！", "demo", consolePrinter);
        task3.about();
        myList.addTodo(task3);
        myList.print();

        //第4个代办事项
        FoodTask task4 = new FoodTask("来点下午茶！", "demo", filePrinter);
        task4.about();
        myList.addTodo(task4);
        myList.print();

    }


}