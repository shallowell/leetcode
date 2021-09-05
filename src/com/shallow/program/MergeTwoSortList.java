package com.shallow.program;

import java.util.Stack;

public class MergeTwoSortList {
	ListNode returnListNode;
	Stack<Integer> stack = new Stack<>();
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				l1 = mainlogic(l1,l2);
			} else {
				l2 = mainlogic(l2,l1);
			}
		}
		parsingFromStackToNodeList();
		return returnListNode;
	}

	private ListNode mainlogic(ListNode lower, ListNode higher) {
		stack.push(lower.val);
		if (lower.next != null) {
			return lower.next;
		} else {
			while ( higher.next != null) {
				stack.push(higher.val);
				higher = higher.next;
			}
			stack.push(higher.val);
		}
		return null;
	}

	private void parsingFromStackToNodeList() {
		while (!stack.empty()) {
			returnListNode = new ListNode(stack.pop(), returnListNode);
		}
	}
}