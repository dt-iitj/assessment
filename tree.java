import treeSort.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class tree{
      public static void main(String args[])throws IOException{
      int no,num=0;
      char c= 'y';
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("enter the value u wanna enter at root:");
             no = Integer.parseInt(br.readLine());

             node root = new node(no,null);
             //node temp;

             /*System.out.println("Do u want to enter another node:");
             c = (char)br.read();

	System.out.flush();
	System.out.println(c);
	System.out.flush();*/
             while(num!=9000){
                    System.out.println("\nEnter the no u wanna enter:");

                    num = Integer.parseInt(br.readLine());
                    node.assignNode(num,root);
                    //System.out.println("Do u want to enter another node:");
                    //c = (char)br.read();
                    //System.out.flush();
            }

            System.out.println("Print sorted Values...:");
            //temp = root;
            sort(root);
            System.out.println("\nvalue of root:"+root.val);
            System.out.println("\nvalue of first right child of root:"+root.left.val);
        }

        static void sort(node n){
             if(n.left!=null)
                    sort(n.left);
            System.out.print(n.val+"->");
            if(n.right!=null)
                    sort(n.right);
        }

}