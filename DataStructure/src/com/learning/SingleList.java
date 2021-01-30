package com.learning;

public class SingleList {

    Node root;
    Node lastNode;
    private int size;

    public void addNewNode(int val){

        Node temp = root;

        Node newNode;

        if(temp==null){
            newNode = new Node();
            newNode.val=val;
           // root=newNode;
            lastNode = newNode;
            root=lastNode;

        }
        else{

            newNode = new Node();
            newNode.val=val;
            lastNode.next=newNode;
            lastNode=newNode;
        }

    size++;

    }

    public void insertAtPos(int pos,int val){

        int count =0;
      /*  if(pos>size-1){
            throw new IllegalArgumentException("position is invalid");
        }*/



            if(pos==0){

                Node newNode = new Node();
                newNode.val = val;
                newNode.next =root;
                root=newNode;
            }
            else{
                Node temp =root;
                while(count!=pos-1){
                    count++;
                    temp=temp.next;
                }

                Node newNode = new Node();
                newNode.val = val;

                Node addOfLink = temp.next;
                temp.next =newNode;
                newNode.next =addOfLink;

            }



        }

        public void reverseList(){

           Node current = root;
           Node prev =null;

           while (current!=null){

               Node nextNode = current.next;
               current.next = prev;
               prev =current;
               current=nextNode;


           }
           lastNode =root;
           root=prev;

        }




    public void print(){
        Node temp= root;
        while(temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }

    }


    public static void main(String [] arsg){
        SingleList test = new SingleList();
        test.addNewNode(1);
        test.addNewNode(2);
        test.addNewNode(3);
        test.addNewNode(4);
      //  test.insertAtPos(0,3);


        test.print();

        test.reverseList();
        test.addNewNode(100);

        test.print();
    }
}


class Node{

    Node next;
    int val;

}
