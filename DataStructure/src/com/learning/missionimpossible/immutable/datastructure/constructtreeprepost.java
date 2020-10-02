package com.learning.missionimpossible.immutable.datastructure;

public class constructtreeprepost {

    public static void main(String [] args){

        int [] pre = {1,2,4,8,9,5,3,6,7};
        int [] post = {8,9,4,5,2,6,7,3,1};


       TreeNode root = createTree(pre,post,0,pre.length-1,0,post.length-1);

        System.out.println("root:"+root.data);
        System.out.println("right:"+root.right.data);
        System.out.println("left:"+root.left.data);

    }

    static TreeNode createTree(int [] pre,int [] post,int preS,int preE,int posS,int posE){


        if(preS>preE || posS>posE)
            return null;

        int preLs=preS+1;

        int pos =0;
        for(int i=posS;i<=posE;i++){
            if(post[i]==pre[preLs]) {
                pos = i;
                break;
            }
        }

        int preLE=pos-1;
        int preRs=pos;
        int preRe=preE;
        int posLs=posS;
        int posLe=pos;
        int posRs=pos+1;
        int posRe=posE;

        TreeNode root = new TreeNode(pre[preS]);

        root.left = createTree(pre,post,preLs,preLE,posLs,posLe);
        root.right = createTree(pre,post,preRs,preRe,posRs,posRe);

        return root;
    }
}

class TreeNode{

    TreeNode left;
    TreeNode right;

    int data;

    TreeNode(int data){
        this.data = data;
    }
}
