package com.learning.recursion;

public class   BinaryTreepreOrder {

    public static void main(String []args){


        BinaryTreepreOrder preOrderTraversal=new BinaryTreepreOrder();
// BinaryTree.TreeNode rootNode=preOrderTraversal.createNode();
        BinaryTree.TreeNode rootNode1=preOrderTraversal.createBinarySearchTree();
        //BinaryTree.preOrder(rootNode);
       /*int maximum= BinaryTree.findMaximum(rootNode );
        System.out.println("maximum element is:"+maximum);
*/

      /* boolean found= BinaryTree.findMaximumElementWithoutRecursion(rootNode,81);
        System.out.println("element found:"+found);*/
      /*  BinaryTree.insertElement(rootNode,101);
        BinaryTree.preOrder(rootNode);*/
        //BinaryTree.insertTreeNode(rootNode,101);

     /* BinaryTree.insertNodeBST(rootNode1,72);
        BinaryTree.levelOrderTraversal(rootNode1);*/

    /* int minimum=BinaryTree.findMinimum(rootNode1);
        System.out.println("minimum element in binary tree:"+minimum);

        int maximum=BinaryTree.findMaximum(rootNode1);
        System.out.println("maximum element in binary tree us :"+maximum);

        int maximumdepth=BinaryTree.findMaximumDepth(rootNode1);
        System.out.println("maximum depth of tree is :"+maximumdepth);

        int minimumdepthiteration=BinaryTree.findMinimumHeightIteration(rootNode1);
        System.out.println("minimum height without iteration:"+minimumdepthiteration);

        boolean tag=BinaryTree.findSum(rootNode1,279);
        System.out.println("sum exist:"+tag);*/
        BinaryTree.printZigZag(rootNode1);
        int width=BinaryTree.findMaximumWidth(rootNode1);
        System.out.println("maximum width:"+width);
    }


    public static BinaryTree.TreeNode createNode(){

        BinaryTree.TreeNode rootNode=new BinaryTree.TreeNode(34);
        BinaryTree.TreeNode node1=new BinaryTree.TreeNode(56);
        BinaryTree.TreeNode node2=new BinaryTree.TreeNode(76);
        BinaryTree.TreeNode node3=new BinaryTree.TreeNode(81);
        BinaryTree.TreeNode node4=new BinaryTree.TreeNode(71);
        BinaryTree.TreeNode node5=new BinaryTree.TreeNode(14);
        BinaryTree.TreeNode node6=new BinaryTree.TreeNode(7);
        BinaryTree.TreeNode node7=new BinaryTree.TreeNode(12);


        rootNode.left=node1;
        node1.left=node2;
        node1.right=node3;
        rootNode.right=node4;
        node4.left=node5;
        node4.right=node6;
        node6.right=node7;

        return rootNode;

    }

    public static BinaryTree.TreeNode createBinarySearchTree(){
        BinaryTree.TreeNode rootNode=new BinaryTree.TreeNode(34);
        BinaryTree.TreeNode node1=new BinaryTree.TreeNode(32);
        BinaryTree.TreeNode node2=new BinaryTree.TreeNode(31);
        BinaryTree.TreeNode node3=new BinaryTree.TreeNode(33);
        BinaryTree.TreeNode node4=new BinaryTree.TreeNode(71);
        BinaryTree.TreeNode node5=new BinaryTree.TreeNode(67);
        BinaryTree.TreeNode node6=new BinaryTree.TreeNode(75);
        BinaryTree.TreeNode node7=new BinaryTree.TreeNode(79);

        rootNode.left=node1;
        node1.left=node2;
        node1.right=node3;
        rootNode.right=node4;
        node4.left=node5;
        node4.right=node6;
        node6.right=node7;
        return rootNode;
    }
}
