package org.example;

public class LListMain {

    static class Node {

        Node nextNode;
        int val;

        public Node(int data) {
            this.val = data;
        }

        public Node() {
        }
    }

    interface LList {
        void add(int val);

        void remove(Node node);

        void getLList();
    }

    static class LListImpl implements LList {
        @Override
        public void add(int val) {
            Node newNode = new Node(val);
            if (header == null) {
                header = newNode;
                tail = newNode;
            } else {
                tail.nextNode = newNode;
                tail = newNode;
            }
        }

        @Override
        public void remove(Node node) {
            node.val = node.nextNode.val;
            node.nextNode = node.nextNode.nextNode;
        }

        @Override
        public void getLList() {
            Node current = header;
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
    }

    public static Node header = null;
    public static Node tail = null;

    public static void main(String[] args) {
        LListImpl list = new LListImpl();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.getLList();
    }
}
