package com.learning.missionimpossible.immutable.datastructure;

public class constructtreeinpostorder {

    public static void main(String [] args){

        int [] inOrder = {4,2,1,7,5,8,3,6};
        int [] postOrder = {4,2,7,8,5,6,3,1};
       TreeNode root = constructBTree(inOrder,postOrder,0,inOrder.length-1,0,postOrder.length-1);

        System.out.println("root:"+root.data);
        System.out.println("root left:"+root.left.data);
        System.out.println("root right:"+root.right.data);
    }

    public  static TreeNode constructBTree(int [] inOrder,int [] postOrder,int inoS,int inoE,int poS,int poE){


        if(inoS>inoE || poS>poE)
            return  null;


        int poLs = poS;

        int pos =0;

        for(int i=inoS;i<=inoE;i++){

            if(inOrder[i]==postOrder[poE]){
                pos = i;
                break;
            }
        }

        int inoRs = pos+1;
        int inoRe = inoE;
        int inoLs = inoS;
        int inOLe = pos-1;

        int poRe = poE-1;

        int poLe = poLs+inOLe-inoLs;

        int poRs = poLe+1;

        TreeNode root = new TreeNode(postOrder[poE]);

        root.left = constructBTree(inOrder,postOrder,inoLs,inOLe,poLs,poLe);
        root.right = constructBTree(inOrder,postOrder,inoRs,inoRe,poRs,poRe);

        return root;


    }
}
