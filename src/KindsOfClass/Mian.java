/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KindsOfClass;

/**
 *
 * @author Irwan
 */
public class Mian {
    public static void main(String[] args) {
        MyOuter n = new MyOuter();
        n.outerMethod();
        System.out.println(n.getX());
    }
}
