public class LinkaList {
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    private int size;

    LinkaList(){
        this.size = 0;
    }
    private Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deletefirst(){
        
        if (head == null){
            System.out.println("The List is empty");
            return;
        }

        head = head.next;
    }
    
    public void deleteLast(){
        if (head == null){
            System.out.println("The List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node Secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            Secondlast = Secondlast.next;
        }
        Secondlast.next = null;
    }    

    public void printList(){
        if (head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkaList list = new LinkaList();
        list.addFirst("Vatshal");
        list.addFirst("Venkat");
        list.printList();
        list.addLast("SpiderMan");
        list.printList();
        list.deletefirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}
