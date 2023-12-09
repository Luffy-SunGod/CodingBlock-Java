package lec30;

import java.util.LinkedList;

public class MidllleOfLL {
private class Node {
			int data;
			Node next;
		}

		private Node head;
		private int size;
		private Node tail;

		public void addFirst(int item) {
			Node nn = new Node();
			nn.data = item;
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size++;
			} else {
				nn.next = this.head;	
				this.head = nn;
				this.size++;
			}

		}

		public void addLast(int item) {

			if (this.size == 0) {
				addFirst(item);
			} else {
				Node nn = new Node();
				nn.data = item;
				this.tail.next = nn;
				this.tail = nn;
				this.size++;
			}

		}
		
		public int mid() {
			Node fast=head;
			Node slow=head;
			while(fast!=null&&fast.next!=null) {
				fast=fast.next.next;
				slow=slow.next;
			}
			
			return slow.data;
		}
		
		
		public void Dispaly() {

			Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println(".");
		}
		
		public static void main(String[] args) {
			MidllleOfLL l=new MidllleOfLL();
			l.addLast(1);
			l.addLast(2);
			l.addLast(3);
			l.addLast(4);
			l.addLast(5);
			l.addLast(6);
			l.Dispaly();
			System.out.println(l.mid());
			
		}
	}

