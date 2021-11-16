package DoublyLinkedList;

import ArrayList.Employee;

import java.util.Iterator;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (head == null) {
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }
    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        if (existingEmployee == null) {
            return false;
        }

        EmployeeNode current = head;
        EmployeeNode next;
        EmployeeNode newNode = new EmployeeNode(newEmployee);

        while (current != null && current.getNext() != null) {
            next = current.getNext();
            if (current.getPrev() == null) {
                addToFront(newEmployee);
                return true;
            } else if (next.getEmployee() == existingEmployee){
                newNode.setNext(next);
                next.setPrev(newNode);
                current.setNext(newNode);
                newNode.setPrev(current);
                size++;
                return true;
            }

            current = current.getNext();
        }
        return false;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;
        if (tail.getPrev() == null) {
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        size--;
        removedNode.setPrev(null);
        return removedNode;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {return size;}

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
