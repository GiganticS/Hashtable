package com.company;

public class Node {

    public int key;
    int K;
    String name;

    Node rightChild;
    Node leftChild;

    Node(int key, String name){
        this.key=key;
        this.name=name;
    }

    public String toString(){
        return name + " has a key " + key;
    }

}
