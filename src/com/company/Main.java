package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RotationTree tree = new BalancedTree();
        tree.insert();
        tree.delete();
        tree.traverse();
        tree.leftRotation();
        tree.rightRotation();

        System.out.println("Ini Bagus banget");
    }
}
