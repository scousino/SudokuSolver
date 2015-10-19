
public class DLinkedList<T> {

    private Node firstNode;
    private Node lastNode;
    private Node middleNode;
    private int numberOfEntries;
    private int middlePosition;

    public DLinkedList() {
        firstNode = null;
        lastNode = null;
        middleNode = null;
        numberOfEntries = 0;
        middlePosition = 0;
    }

    public void add(T newEntry) {
        if (firstNode == null) {
            firstNode = new Node(null, newEntry, null);
            lastNode = firstNode;
        } else {
            Node newNode = new Node(lastNode, newEntry, null);
            lastNode.next = newNode;
            lastNode = newNode;
        }

        numberOfEntries++;

        if (numberOfEntries % 2 == 1) {
            if (middleNode == null) {
                middleNode = firstNode;
            } else {
                middleNode = middleNode.next;
            }
            middlePosition++;
        }
    }

    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            result = (getNodeAt(givenPosition)).data;
        }

        return result;
    }

    public boolean contains(T entry) {
        if (this.isEmpty()) {
            return false;
        }
        for (int i = 1; i <= numberOfEntries; i++) {
            T listEntry = getEntry(i);
            if (listEntry.equals(entry)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        middleNode = null;
        numberOfEntries = 0;
        middlePosition = 0;
    }

    public int size() {
        return numberOfEntries;
    }

    /**
     * Modify this method according to the Solution 2
     */
    private Node getNodeAt(int givenPosition) {
        // TO DO
        Node currentNode = null;
        //givenPosition is the first position

        //Traverse from firstNode forward
        if (givenPosition <= (numberOfEntries / 4)) {
            currentNode = firstNode;
            for (int i = 1; i < givenPosition; i++) {
                currentNode = currentNode.next;
            }
        } //Traverse from middleNode backwards
        else if ((givenPosition <= (numberOfEntries / 2))
                && (givenPosition > (numberOfEntries / 4))) {
            currentNode = middleNode;
            for (int i = middlePosition; i != givenPosition; i--) {
                currentNode = currentNode.previous;
            }
        } //Traverse from middleNode forwards
        else if ((givenPosition >= (numberOfEntries / 2)) && (givenPosition < (numberOfEntries * 3) / 4)) {
            currentNode = middleNode;
            for (int i = middlePosition; i < givenPosition; i++) {
                if (currentNode.next == null) {
                    break;
                }
                currentNode = currentNode.next;
            }
        } //Traverse from lastNode backwards
        else if ((givenPosition >= (numberOfEntries * 3) / 4)) {
            currentNode = lastNode;
            for (int i = numberOfEntries; i != givenPosition; i--) {
                currentNode = currentNode.previous;
            }
        }

        return currentNode;
    }

    private class Node {

        private Node previous;
        private T data;
        private Node next;

        private Node(Node previousNode, T aData, Node nextNode) {
            previous = previousNode;
            data = aData;
            next = nextNode;
        }
    }
}
