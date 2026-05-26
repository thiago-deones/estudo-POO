package org.devdojo.maratonajava.introducao;


public class TwoSum {

    static class ListNode{
        int val;
        ListNode next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();

        ListNode prime1 = new ListNode();
        ListNode prime2 = new ListNode();
        ListNode prime3 = new ListNode();

        ListNode resposta1 = new ListNode();
        ListNode resposta2 = new ListNode();
        ListNode resposta3 = new ListNode();

        node1.val = 2;
        node1.next = node2;
        node2.val = 4;
        node2.next = node3;
        node3.val = 3;
        node3.next = null;

        prime1.val = 5;
        prime1.next = prime2;
        prime2.val = 6;
        prime2.next = prime3;
        prime3.val = 4;
        prime3.next = null;

        resposta1.next = resposta2;
        resposta2.next = resposta3;
        resposta3.next = null;


        ListNode l1 = node1;
        ListNode l2 = prime1;


        while (l1 != null || l2 != null){
            resposta1.val = l1.val+l2.val;
            System.out.println(resposta1.val);
            resposta1 = resposta1.next;
            l1 = l1.next;
            l2 = l2.next;
        }

    }
}
