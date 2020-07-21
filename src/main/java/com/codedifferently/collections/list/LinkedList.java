package com.codedifferently.collections.list;

public class LinkedList <DataType>{
    Node<DataType> head;
}


class Node<DataType> {
    DataType data;
    Node next;

    Node(DataType d) {
        data = d;
        next = null;
    }
}