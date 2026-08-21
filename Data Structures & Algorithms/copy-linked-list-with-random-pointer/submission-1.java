/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       //Create a Copy Node and InstertNode 
       Node curr = head;
       // Assigning and Inserting value in b/w nodes 
       while(curr!=null){
        Node copy = new Node(curr.val);
           copy.next = curr.next;
           curr.next=copy;
           curr=copy.next;
           
        
        }

        //Assign Random pointers
        curr= head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }


            curr = curr.next.next;
            
        }

        //Seprate the two List
        //Dummy
        Node dummy = new Node(0);
        Node copyCurr=dummy;
        curr = head;
        while(curr!=null){
            Node copy = curr.next;

            curr.next = copy.next;   // Restore original list
            copyCurr.next = copy;    // Build copied list

            copyCurr = copy;
            curr = curr.next;

        }
        return dummy.next;



    }
}
