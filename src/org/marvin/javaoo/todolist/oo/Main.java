package org.marvin.javaoo.todolist.oo;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

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

        //第1个代办事项
        Task task1 = new Task("早上6点早起去锻炼！","demo");
        myList.addTodo(task1);
        myList.print();

        //第2个代办事项
        Task task2 = new Task("晚上9点上床睡觉！","demo");
        myList.addTodo(task2);
        myList.print();

        //第3个代办事项
        Task task3 = new Task("中午吃大肉！","demo");
        myList.addTodo(task3);
        myList.print();

        //第4个代办事项
        Task task4 = new Task("来点下午茶！","demo");
        myList.addTodo(task4);
        myList.print();
    }



}