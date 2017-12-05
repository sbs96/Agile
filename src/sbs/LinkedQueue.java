/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbs;

/**
 *
 * @author PC2
 */
public class LinkedQueue<T> implements QueueInterface<T> {

    private Node firstNode;

    public LinkedQueue() {
        firstNode = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty())
        {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            T data = firstNode.data;
            firstNode = firstNode.next;
            return data;
        }
    }

    @Override
    public T getFront() {
        if (isEmpty()) {
            return null;
        } else {
            T data = firstNode.data;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void clear() {
        firstNode = null;
    }

    public String toString() {
        String s = "";
        Node firstNodeCopy = firstNode;
        while (firstNodeCopy != null) {
            s += firstNodeCopy.data + "\n";
            firstNodeCopy = firstNodeCopy.next;
        }
        return s;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    } // end Node
}
