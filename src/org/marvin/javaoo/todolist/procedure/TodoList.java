package org.marvin.javaoo.todolist.procedure;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * 这是一个TODO list项目
 * 1. 代办列表
 * 2. 添加一个代办事项
 * 3. 完成一个代办事项，从代办事项里面移除掉
 * 下面这段代码是Marvin实现的
 */
public class TodoList {

    public static void main(String[] args) {
        //代办列表
        String[] todoList = new String[0];
        System.out.println("1.这是原来的数组");
        for (String task : todoList) {
            System.out.println(task);
        }

        //第1个代办事项
        String task1 = "早上6点早起去锻炼！";
        //如何把代办事项加入到代办列表当中？
        todoList = addTodo(task1, todoList);
        System.out.println("2.这是添加以后的数组");
        for (String task : todoList) {
            System.out.println(task);
        }

        //第2个代办事项
        String task2 = "晚上9点上床睡觉！";
        //如何把代办事项加入到代办列表当中？
        todoList = addTodo(task2, todoList);
        System.out.println("3.这是添加第二个任务以后的数组！");
        for (String task : todoList) {
            System.out.println(task);
        }

        //第3个代办事项
        String task3 = "中午吃大肉！";
        //如何把代办事项加入到代办列表当中？
        todoList = addTodo(task3, todoList);
        System.out.println("4.这是添加第3个任务以后的数组！");
        for (String task : todoList) {
            System.out.println(task);
        }

        //第4个代办事项
        String task4 = "来点下午茶！";
        //如何把代办事项加入到代办列表当中？
        todoList = addTodo(task4, todoList);
        System.out.println("5.这是添加第4个任务以后的数组！");
        for (String task : todoList) {
            System.out.println(task);
        }


    }

    // 面向过程编程！
    /**
     * 实现一个方法，
     * 你给我传一个代办事项和代办列表， - 参数
     * 我负责把代办事项添加到代办列表里面， - 方法内容
     * 并把添加以后的代办列表返回给你 - 返回
     */
    public static String[] addTodo(String todo, String[] todoList) {
        String[] newTodoList = new String[todoList.length + 1];
        for (int i = 0; i < todoList.length; i++) {
            newTodoList[i] = todoList[i];
        }
        newTodoList[todoList.length] = todo;
        return newTodoList;
    }


}