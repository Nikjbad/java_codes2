public class LL {
       
     private int size;
        Node head;

     LL() {
        this.size = 0;
    }
        
       class Node {
            
            String data;
            Node next;
            Node(String data) {
                this.data = data;
                this.next = null;
                size++;

            }
        }
            public void addFirst(String data) {
                Node newNode = new Node(data);
                   if (head == null) {
                       head = newNode;
                       return;
                   }
                   newNode.next = head;
                   head = newNode;
            }
            public void addLast(String data) {
                Node newNode = new Node(data);
                   if (head == null) {
                       head = newNode;
                       return;
                   }
                   Node currNode = head;
                   while (currNode.next!= null) {
                    currNode = currNode.next;
                   }
                   currNode.next = newNode;
                }
                public void printList() {
                
                    if(head == null) {
                        System.out.println("the list is empty");
                    }
                   Node currNode = head;
                   while (currNode!= null) {
                    System.out.print(currNode.data+"-->");
                    currNode = currNode.next;
                   }

                   System.out.println("Null");
                
            }
            public void deleteFirst() {
                if (head == null) {
                     System.out.println("the list is empty");
                     return;
                }
                size--;
                head = head.next;
            }
             public void deleteLast() {
                if (head == null) {
                     System.out.println("the list is empty");
                     return;
                }
                size--;
                if(head.next == null) {
                    head = null;
                    return;
                }
                Node secondlast = head;
                Node lastnode = head.next;
                while(lastnode.next!= null) {
                    secondlast = secondlast.next;
                    lastnode = lastnode.next;
                }
                secondlast.next = null;

            }
            public int getsize() {
                    return size;
            }
            public void reverse_LL() {
                if (head == null || head.next == null) {
                    return;
                }
                Node prevnode = head;
                Node currnode = head.next;
                while(currnode!= null) {
                    Node nextnode = currnode.next;
                    currnode.next = prevnode;
                    prevnode = currnode;
                    currnode = nextnode;
                }
                head.next = null;
                head = prevnode;
            }
            public Node reverserecursive(Node head) {
                if(head == null || head.next == null) {
                    return head;
                }
                Node newhead = reverserecursive(head.next);
                head.next.next = head;
                head.next = null;
                return newhead;

            }
    
    public static void main (String args[]) {
      LL list = new LL();
  
        list.addFirst("2");
      list.addFirst("1");
      list.addLast("3");
      list.addLast("4");
       list.printList();
       list.head = list.reverserecursive(list.head);
      list.printList();
      list.reverse_LL();
      list.printList();
    }
}
