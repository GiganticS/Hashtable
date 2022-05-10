package com.company;

public class BinaryTree {
    public static void main(String[] args){
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50, "Yera");
        theTree.addNode(25, "Nursultan");
        theTree.addNode(15, "CHE");
        theTree.addNode(30, "Noname");
        theTree.addNode(85, "Name");

        theTree.inOrderTraverseTree(theTree.root);

}
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while(true){
                parent = focusNode;
                if(key<focusNode.key){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }   else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }


    }

}
