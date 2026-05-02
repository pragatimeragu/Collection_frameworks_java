class LL {

    Node head ;
    private int size;

    LL()
    {
        this.size=0;
    }
    class Node {
        String data;
        Node next = null;


        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addfirst(String data)
    {
        Node newNode = new Node(data); 
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // adding at last 
    public void addLast(String data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            head = newNode;
            return;
        }
        while(currNode.next != null)
        {
            currNode=currNode.next;
        }
        currNode.next = newNode;

    }

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.print("Linked List empty to delete elements");
        }
        size--;
        head=head.next;
    }

    public void deleteLast()
    {
        if(head==null)
        {
             System.out.print("Linked List empty to delete elements");
        }
        size--;
        if(head.next==null)
        {
            head = null;
            return;
        }
        Node SecLastNode = head;
        Node LastNode = head.next;

        while(LastNode.next!=null)
        {
            LastNode=LastNode.next;
            SecLastNode=SecLastNode.next;
        }
        SecLastNode.next=null;


    }

    public void printList()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.print("Empty Linked list");
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data + " -> "  );
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public int getSize()
    {
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("Pragati");
        list.printList();

        list.addfirst("am");
        list.printList();

        list.addfirst("I ");
        list.printList();

    
        list.addLast("Meragu");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.print("Linkedlist size:"+list.getSize());
    }
}
