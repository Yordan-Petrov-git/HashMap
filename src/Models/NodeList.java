package Models;

/**
 * Head - firstElement
 * Tail - next
 * Size - size
 * Add method
 */


public class NodeList {
    private Node firstElement;
    private int size = 0;

    public void add(Node node) {
        size++;
        if (firstElement == null) {
            firstElement = node;
            return;
        }
        Node currentNode = firstElement;
        while (true) {
            if (currentNode.next == null) {
                currentNode.next = node;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        if (firstElement == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Node currentNode = firstElement;
        while (currentNode != null) {
            sb.append("{");
            sb.append(currentNode.toString());
            sb.append("}");
            sb.append(",");
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}
