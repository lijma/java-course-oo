package org.marvin.javaoo.todolist.oo;

/**
 * 这是一个TODO list项目
 * 1. 代办列表
 * 2. 添加一个代办事项
 * 3. 完成一个代办事项，从代办事项里面移除掉
 * 下面这段代码是Marvin实现的
 */
public class TodoList {

    private Task[] list = new Task[0];

    // 面向过程编程！
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

    public void print(){
        System.out.println("-------------");
        for (Task task : this.list) {
            System.out.println(task.name);
        }
    }

    public Task[] getList() {
        return list;
    }
}
