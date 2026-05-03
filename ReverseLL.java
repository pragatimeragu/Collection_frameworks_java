class ReverseLL
{   
    Node head;
    class Node{
        int data;
        Node next;


        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
        
    }

    public void printList()
    {
        Node currNode=head;
        if(head==null)
        {
            System.out.print("Empty LL");
            return;
        }

        while(currNode!=null)
        {
             System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
           
        }
        System.out.println("null");
    }

    public void ReverseList()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node prev = head;
        Node currNode = head.next;

        while(currNode!=null)
        {
            Node nextNode = currNode.next;
            currNode.next=prev;

            //update
            prev = currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prev;
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.ReverseList();
        list.printList();
    }
}