package org.example;

public class ListNode {

    static class LLNode {

        LLNode nextNode;
        int val;

        public LLNode(int data) {
            this.val = data;
        }

        public LLNode() {
        }
    }

    interface LList {
        void add(int val);

        void remove(LLNode node);

        void getLList();
    }

    static class LListImpl implements LList {
        @Override
        public void add(int val) {
            LLNode newNode = new LLNode(val);
            if (header == null) {
                header = newNode;
            } else {
                tail.nextNode = newNode;
            }
            tail = newNode;
        }

        @Override
        public void remove(LLNode node) {
            node.val = node.nextNode.val;
            node.nextNode = node.nextNode.nextNode;
        }

        @Override
        public void getLList() {
            LLNode current = header;
            if (header == null) {
                System.out.println("List is empty");
                return;
            }
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.nextNode;
            }

            System.out.println();
        }

        public static int length(LLNode head) {
            LLNode temp = head;
            int c = 0;
            if (temp == null)
                return 0;
            else {
                while (temp != null) {
                    temp = temp.nextNode;
                    c++;
                }
            }
            return c;
        }

        public static LLNode reverse(LLNode head) {
            LLNode prevLNode = null, curLNode = head, nextLNode = null;
            while (curLNode != null) {
                nextLNode = curLNode.nextNode;
                curLNode.nextNode = prevLNode;

                prevLNode = curLNode;
                curLNode = nextLNode;
            }

            head = prevLNode;
            return head;
        }

    }

    public static LLNode header = null;
    public static LLNode tail = null;

    public static void main(String[] args) {
        LListImpl list = new LListImpl();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.getLList();
    }
}
