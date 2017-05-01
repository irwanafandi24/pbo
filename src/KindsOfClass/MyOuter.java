/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KindsOfClass;

/**
 *
 * @author Irwan
 */
public class MyOuter {
    private  int x = 0;
    private MyInner inner;
    
    public void outerMethod(){
        inner = new MyInner();
        inner.innerMethod();
    }
    
    public int getX(){
        return x;
    }
    
    public class MyInner{
        public void innerMethod(){
            x = x+20;
        }
    }
}
