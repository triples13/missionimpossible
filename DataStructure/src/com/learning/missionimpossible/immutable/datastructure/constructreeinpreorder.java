package com.learning.missionimpossible.immutable.datastructure;

public class constructreeinpreorder {

    public static  void main(String [] args){

        int [] preorder = {1,2,4,3,5,7,8,6};
        int [] inorder = {4,2,1,7,5,8,3,6};

        TreeNode root = constructTree(preorder,inorder,0,preorder.length-1,0, inorder.length-1);

        System.out.println("root:"+root.data);
        System.out.println("root.left"+root.left.left.data);
        System.out.println("root.right"+root.right.data);
    }


   static TreeNode constructTree( int [] preOrder, int [] inorder,int preS, int preE,int inoS,int inoE){

        if(preS>preE || inoS>inoE)
            return  null;

        int preLs = preS+1;


        int pos =0;

        for(int i=inoS;i<=inoE;i++){

            if(preOrder[preS]==inorder[i])
            {
                pos =i;
                break;
            }
        }

        int inOLs = inoS;
        int inOLe = pos-1;
        int inORs = pos+1;
        int inORe = inoE;
        int preLe = preLs+inOLe-inOLs;
        int preRe = preE;
        int preRs = preLe+1;



        TreeNode root = new TreeNode(preOrder[preS]);

        root.left = constructTree(preOrder,inorder,preLs,preLe,inOLs,inOLe);
        root.right = constructTree(preOrder,inorder,preRs,preRe,inORs,inORe);

        return  root;
   }
}


