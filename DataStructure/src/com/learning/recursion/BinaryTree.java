package com.learning.recursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    public static int maximum;
    static class TreeNode{
        TreeNode right;
        TreeNode left;

        int data;

        TreeNode(int data){
            this.data=data;
        }
    }

    public static void preOrder(TreeNode rootNode){
        if(rootNode==null){
            return;
        }

        System.out.println("data is:"+rootNode.data);
        preOrder(rootNode.left);

        preOrder(rootNode.right);
    }

    public static  int findMaximum(TreeNode rootNode){
        if(rootNode==null){
            return 0;
        }
        if(rootNode.data>maximum)
            maximum=rootNode.data;

        findMaximum(rootNode.left);
        findMaximum(rootNode.right);

        return  maximum;
    }

    public static void insertElement(TreeNode rootNode,int element){
        if(rootNode==null){
            return;
        }
        insertElement(rootNode.right,element);
        insertElement(rootNode.left,element);
        TreeNode newnode=new TreeNode(element);
        rootNode.left=newnode;
    }

    public static boolean findMaximumElementWithoutRecursion(TreeNode rootNode,int element){

        int maximum=0;

        boolean found=false;
        Stack<TreeNode>  stackoftree=new Stack<>();
        stackoftree.push(rootNode);

        while(!stackoftree.isEmpty())
        {
            TreeNode popnode=stackoftree.pop();
            System.out.println("data"+popnode.data);
            if(popnode.data==element){
                found=true;
                break;
            }

            if(popnode.right!=null){
                stackoftree.push(popnode.right);
            }
            if(popnode.left!=null){
                stackoftree.push(popnode.left);
            }
        }

        return found;
    }

    public static void levelOrderTraversal(TreeNode rootNode){
        if(rootNode==null){
            return;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(rootNode);
        while(!queue.isEmpty())
        {
            TreeNode temp=queue.poll();

            System.out.println("data is:"+temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }


    }

    public static void insertTreeNode(TreeNode rootNode,int element){
        if(rootNode==null){
            return;
        }

        int counter=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(rootNode);
        while(!queue.isEmpty())
        {
            TreeNode temp=queue.poll();


            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            if(temp.right==null){
                if(counter==0){
                    TreeNode newnodepoint=temp;
                    temp.right=new TreeNode(element);
                }
                counter++;
            }

        }

    }

    public static int findMinimum(TreeNode rooNode){
        if(rooNode.left==null){
            return rooNode.data;
        }
        int data=findMinimum(rooNode.left);
        return data;

    }
    public static int findMaximumElement(TreeNode rootNode){
        if(rootNode.right==null){
            return rootNode.data;
        }
        int data=findMaximumElement(rootNode.right);

        return data;
    }

    public static void insertNodeBST(TreeNode rootNode,int key){

        TreeNode prev=null;
        TreeNode temp=rootNode;

        while(temp!=null){

            if(key>temp.data){
                prev=temp;
                temp=temp.right;
            }
            else if(key<temp.data){
                prev=temp;
                temp=temp.left;
            }
        }
        if(key<prev.data){
            prev.left=new TreeNode(key);
            prev.left.left=null;
            prev.left.right=null;
        }
        else{
            prev.right=new TreeNode(key);
            prev.right.left=null;
            prev.right.right=null;
        }
    }

    public static int findMaximumDepth(TreeNode rootNode){
        if(rootNode.left==null || rootNode.right==null){
            return 1;
        }
        int maximumdepthleft=findMaximumDepth(rootNode.left);
        int maximumdepthright=findMaximumDepth(rootNode.right);

        return (1+Math.max(maximumdepthleft,maximumdepthright));
    }

    public static int findMinimumHeight(TreeNode rootNode){

        if (rootNode==null){
            return 0;
        }
        int minimumdepth=findMinimumHeight(rootNode.left);
        int maximumdepth=findMinimumHeight(rootNode.right);
        return (1+Math.min(minimumdepth,maximumdepth));
    }

    public static int findMinimumHeightIteration(TreeNode rootNode){

        Queue<TreeNode> queue=new LinkedList<>() ;
        queue.add(rootNode);
        queue.add(null);
        int count =1;
        while(!queue.isEmpty()) {

            TreeNode currentNode = queue.poll();
            if (currentNode == null) {
                count++;
                queue.poll();
            } else {


                if (currentNode.left == null && currentNode.right == null) {
                    break;

                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);

                }

            }
        }
        return count;
    }

    public static boolean findSum(TreeNode rootNode,int sum){

        if(rootNode!=null) {
            if (rootNode.data == sum) {
                return true;
            }
        }
        else{
            return false;
        }


        boolean leftSum=findSum(rootNode.left,sum-rootNode.data);
        boolean rightSum=findSum(rootNode.right,sum-rootNode.data);


        return leftSum||rightSum;
    }

    public static void printZigZag(TreeNode rootNode){

        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(rootNode);

        while(!stack1.isEmpty()){

            TreeNode node=stack1.pop();
            System.out.println("nodes:"+node.data);

            if(node.right!=null){
                stack2.push(node.right);
            }
            if(node.left!=null){
                stack2.push(node.left);
            }

            while(!stack2.isEmpty()){
                TreeNode newnode=stack2.pop();
                System.out.println("nodes:"+newnode.data);
                if(newnode.left!=null){
                    stack1.push(newnode.left);
                }
                if(newnode.right!=null){
                    stack1.push(newnode.right);
                }
            }
        }

    }

    public static int findMaximumWidth(TreeNode rootNode){

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(rootNode);
        queue.add(null);
        int maxDepth=0;
        int count=0;

        int maximumsum=0;
        int prevsum=0;
        while(!queue.isEmpty()){
            TreeNode currentNode=queue.poll();

            if(currentNode!=null){

                maximumsum+=currentNode.data;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
                count++;
            }
            else if (!queue.isEmpty()){
                if(count>maxDepth){
                    maxDepth=count;

                }


                if(prevsum<maximumsum){
                    prevsum=maximumsum;
                }
                count=0;
                maximumsum=0;

                queue.add(null);
            }
        }

        System.out.println("maximum sum is:"+prevsum);
        return  maxDepth;
    }

}