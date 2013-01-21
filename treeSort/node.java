package treeSort;
import java.lang.*;
import java.io.*;

public class node{
      public int val,num,tempValue;
      node par,temp;
      public node left;
      public node right;

      public node(int no,node parent){
               val = no;
               par = parent;
               node left=null;
               node right=null;
     }


    public static void assignNode(int num,node temp){
         if(num<temp.val){
                if(temp.left!=null)
                        node.assignNode(num,temp.left);
                else {
                        makeNode drawNode = new makeNode();
                        temp.left = drawNode.leftChild(num,temp);
                }
        }else if(num>temp.val){
                    //temp = temp.right;
                    if(temp.right!=null)
                        node.assignNode(num,temp.right);
                    else{
                         makeNode drawNode = new makeNode();
                        temp.right = drawNode.rightChild(num,temp);
        	}
          }
      }


}