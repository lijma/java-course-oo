package org.marvin.javaoo.todolist2.oo;

import org.marvin.javaoo.todolist2.oo.printer.Printer;
import org.marvin.javaoo.todolist2.oo.task.Task;

/**
 * 这是一个TODO list项目
 * 1. 代办列表
 * 2. 添加一个代办事项
 * 3. 完成一个代办事项，从代办事项里面移除掉
 * 下面这段代码是Marvin实现的
 */
public class TodoList {

    private Task[] list = new Task[0];

    // 面向对象编程
    /**
     * 实现一个类方法，
     * 你给我传一个代办事项 - 参数
     * 我负责把代办事项添加到 TodoList的代办列表里面， - 方法内容
     * null - 返回
     */
    public void addTodo(Task todo) {
        Task[] newTodoList = new Task[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newTodoList[i] = list[i];
        }
        newTodoList[list.length] = todo;
        list = newTodoList;
    }

    /**
     * 1. print我可能是打印到控制太，我可能是打印到文件，我甚至可能会链接打印机打印出来
     * 2. FoodTask 要打印到控制台，然后SleepTask要打印到文件
     */
    public void print(){
        System.out.println("-------------");
        for (Task task : this.list) {
            Printer printer = task.getPrinter();
            printer.print(task.getName());
        }
    }

    public Task[] getList() {
        return list;
    }
}
