package com.julia;

public class Main {

    public static void main(String[] args) {
        Tree tree = Tree.generate();
        System.out.println(tree.size());
        System.out.println(tree.height());
    }
}
