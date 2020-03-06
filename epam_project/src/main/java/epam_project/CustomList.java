package epam_project;

public class CustomList {
	LinkedList first;
	LinkedList second;
	LinkedList third;
	LinkedList fourth;
	LinkedList fifth;
	LinkedList six;
	LinkedList seven;
	LinkedList eight;
	LinkedList nine;
	LinkedList ten;

    
    CustomList(){
    	 first=new LinkedList(0);
    	 second=new LinkedList(0);
    	first.next=second;
    	 third=new LinkedList(0);
    	second.next=third;
    	 fourth=new LinkedList(0);
    	third.next=fourth;
    	 fifth=new LinkedList(0);
    	fourth.next=fifth;
    	 six=new LinkedList(0);
    	fifth.next=six;
    	 seven=new LinkedList(0);
    	six.next=seven;
    	 eight=new LinkedList(0);
    	seven.next=eight;
    	 nine=new LinkedList(0);
    	eight.next=nine;
    	 ten=new LinkedList(0);
    	nine.next=ten;
        
        
    }
    public void insert(int s){
        LinkedList n=new LinkedList(s);
        if(first==null){
            first=n;
        }
        else
        {
            LinkedList x=first;
            while(x.next!=null){
                x=x.next;
            }
            x.next=n;
        }
    }
    public int search(int s) {
    	LinkedList f=first;
    	while(f.myList!=s && f.next!=null) {
    		f=f.next;
    	}
    	return f.myList;
    }
    public void delete(int p){
    	LinkedList t=first;
    	LinkedList pr=first;
    	while(t.myList!=p && t!=null) {
    		pr=t;
    		t=t.next;
    		
    	}
        if(t==null){
            System.out.println("Invalid Input");
            
        }
        else{
           pr.next=t.next;
            
        }
    }
    public void print(){
        LinkedList t=first;
        while(t.next!=null){
            System.out.print(t.myList+" ");
           t=t.next;
        }
        System.out.println(t.myList);
           
    }
}
