/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KindsOfClass;

import java.util.*;

/**
 *
 * @author Irwan
 */
public class TryList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(200);
        list.add("irwan");
        list.add('O');
        
        for (int i = 0; i<list.size();i++){
            Object o = list.get(i);
            System.out.println(o);
        }
        
        for (Object o:list){
            System.out.println(o);
        }
    }
}
