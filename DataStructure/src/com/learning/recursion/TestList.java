package com.learning.recursion;

public class TestList {

    public static void main(String []args){
        ListNode list=new ListNode();

        list.add(4);
        list.add(6);
        list.add(7);
       list.add(8);
        list.add(9);
        list.add(10);

        ListNode list2=new ListNode();
        list2.add(1);
        list2.add(3);
        list2.add(5);


        ListNode list4=new ListNode();
        list4.add(1);
        list4.add(5);
        list4.add(2);
        list4.add(3);
        list4.add(9);
        list4.add(15);
        list4.add(27);
        list4.add(6);
        list4.add(9);



       // list4.displayelements(list4.getHead());
        //list4.reverseElementsInpair(list4.getHead());
        //list4.findModular(list4.getHead(),11,2);
       // list4.findstartNodeinmodular(list4.getHead(),11,2);
      //  list4.findModularNodeFor(list4.getHead(),9,6);
        list4.rotateList(list4.getHead(),3);


       // list4.nthNodefromEnd(list4.getHead(),3);

       // System.out.println("loop detected :"+list4.removeLoop(temp));


       /* ListNode list5=new ListNode();
        list5.removeDuplicate(list4.getHead());

        ListNode list3=new ListNode();*/

      // list.addOneLinkedList(list4.getHead());
      // list.reverseListGroup(list4.getHead(),4);

     //  list3.mergelist(list.getHead(),list2.getHead());
       // list.print();

        //list.remove(9);

        //list.insertAtBegining(20);
       // list.insertAtMiddle(30);

      // list.print();

    }
}
