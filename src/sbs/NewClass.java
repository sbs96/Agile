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
public class NewClass {
    public static void main(String[] args){
        LinkedQueue<String> q=new LinkedQueue<>();
        q.enqueue("qwe");
        q.enqueue("asd");
        q.enqueue("zxc");
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }
}
