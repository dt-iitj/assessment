package treeSort;
import java.io.*;
import java.lang.*;


public class makeNode{
        node leftChild(int val,node p){
           node d = new node(val,p);
           return d;
    }
    node rightChild(int val,node p){
           node d = new node(val,p);
           d.par = p;
           d.val = val;
           return d;
    }
}