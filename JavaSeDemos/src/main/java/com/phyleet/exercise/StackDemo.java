package com.phyleet.exercise;

import java.util.LinkedList;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        for (String s : "the perfect code".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();

        for (char s : "写了个一句话倒过来说的程序".toCharArray()) {
            stack.push(String.valueOf(s));
        }
        while (!stack.empty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        System.out.println();
    }
}

class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public synchronized void push(T e) {
        storage.addFirst(e);
    }

    public T peek() {
        return storage.getFirst();
    }

    public void pop() {
        storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }
}


