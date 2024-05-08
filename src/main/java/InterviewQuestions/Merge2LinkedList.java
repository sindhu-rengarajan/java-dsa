package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class Merge2LinkedList {
	
	
	public static void merge(ListNode l1, ListNode l2) {
		
		ListNode t1 = l1;
		ListNode t2 = l2;
		List<Integer> arr = new ArrayList<Integer>();
		while(t1!=null) {
			arr.add(t1.data);
			t1 = t1.next;
			
		}
		while(t2!=null) {
			arr.add(t2.data);
			t2=t2.next;
		}
		
		Collections.sort(arr);
		LinkedList<Integer> li = new LinkedList<Integer> (arr);
		System.out.println(li);
		
	}
	
	public static ListNode merge2(ListNode l1, ListNode l2) {
		ListNode t1 =l1;
		ListNode t2 = l2;
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;
		
		while(t1!=null && t2!= null) {
			if(t1.data<t2.data) {
				curr.next = t1;
				curr = t1;
				t1=t1.next;
			}
			else {
				curr.next = t2;
				curr = t2;
				t2 =t2.next;
			}
			
		}
		
		if(t1!=null) {
			curr.next = t1;
		}
		else {
			curr.next = t2;
		}
		
		return dummy.next;
		
	}
}
