package com.company;

public class BinarySearchTree implements Tree {

    @Override
    public void insert() {
        System.out.println("Inserting a new item ....");
    }

    @Override
    public void delete() {
        System.out.println("Removing a given item 2 ....");
    }

    @Override
    public void traverse() {
        System.out.println("In order traversal a given item ....");
    }

}
