package com.ntst.todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoListManager {
    // 定义一个静态的List，用于存储待办事项
    private static List<String> todoList = new ArrayList<>();

    // 添加待办事项
    public static void addTodo(String item) {
        // 将待办事项添加到List中
        todoList.add(item);
        // 输出添加成功的信息
        System.out.println("将"+"“"+item+"”"+"已添加到待办事项列表");
    }

    // 查看待办事项
    public static void viewTodos() {
        // 输出待办事项列表的标题
        System.out.println("~~~~~~~~以下是待办事项列表~~~~~~~~");
        // 如果待办事项列表为空，则输出提示信息
        if (todoList.isEmpty()) {
            System.out.println("待办事项列表为空......");
        } else {
            // 遍历待办事项列表，输出每个待办事项
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ".  " + todoList.get(i));
            }
        }   
    }

public static void main(String[] args) {
    // 添加待办事项
    addTodo("学习Java");
    addTodo("阅读《Java编程思想》");
    addTodo("周末前做好技术方案PPT，并预约腾讯会议");
    // 查看待办事项
    viewTodos();
    System.out.println( "~~~~~~~~沈彦彬~~~~~~~~");
}

}
