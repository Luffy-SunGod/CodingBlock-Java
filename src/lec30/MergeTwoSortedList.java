package lec30;

public class MergeTwoSortedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

			ListNode temp = new ListNode();
			ListNode ans = temp;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					temp.next = list1;
					temp = temp.next;
					list1 = list1.next;
				} else {
					temp.next = list2;
					temp = temp.next;
					list2 = list2.next;
				}

			}

			if (list1 != null) {
				temp.next = list1;

			}
			if (list2 != null) {
				temp.next = list2;

			}

			return ans.next;

		}
	}
}
