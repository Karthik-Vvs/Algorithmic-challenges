/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;
import com.graph.EdgeNode;

/**
 *
 * @author suryakarthik.v
 */
public class EdgeNodeLL {
    EdgeNode first;
    EdgeNode last;
    public void put(int y,int weight){        
        EdgeNode oldfirst=first;
        first=new EdgeNode(y,weight);
        if(last==null)last=first;
        first.next=oldfirst;
    }
    public int getY(){
        int y=first.y;        
        return y;
    }
    public int getWeight(){
        int weight=first.weight;
        return weight;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
}
