class MyLinkedList {    
     class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                next=null;
            }

        }
        
        Node head;
        int size;



    public MyLinkedList() {
        
            head=null; 
            size=0;  
    }



    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
if(temp==null){
    return -1;

}
                temp=temp.next;



        }
        if(temp==null){
            return -1;
        }
        
             return temp.data;
        
        
    }
    
    public void addAtHead(int val) {
        Node node =new Node(val);
        if(head==null){

           head=node;
           size++;
            return;
        }
        node.next=head;
        head=node;

        size++;
    }
    
    public void addAtTail(int val) {
        Node temp=head;
        Node node =new Node(val);
        if(head==null){
            head=node;
            size++;
            return;
            

        }
        while(temp.next!=null){
         
            temp=temp.next;

        }
        temp.next=node;
        size++;

        
    }
    
    public void addAtIndex(int index, int val) {
        Node temp=head;
        Node prev=null;
       
        Node node =new Node(val);
        if(index<0 || index>size){
            return  ;
        }
         if(head==null){
         head=node;   
         size++;
         return;
        }
        if(index==0){
            addAtHead(val);
            return; 
        }
        for(int i=1;i<=index;i++){
            prev=temp;
            temp=temp.next;

        }
        prev.next=node;
        node.next=temp;
        size++;

        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >=size) return;

        Node temp=head;
        Node prev=null;
        if(head==null){
            return;
        }
        if(index == 0){
    head = head.next;
    size--;
    return;
}

        for(int i=1;i<=index;i++){
            prev=temp;
            temp=temp.next;

        }
        prev.next=temp.next;
        size--;

        
    }

    }
    
    

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */