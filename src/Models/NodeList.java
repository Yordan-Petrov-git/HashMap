package Models;

/**
 * Node list implementation
 * add  - adds element to the list
 * toString - prints all elements of the list
 * getFirstElementWithKey - gets first value of element with the key
 * overrideElementWithKey - overrides value of the existing key
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


    public Node getFirstElementWithKey(String key) {
        Node currentNode = firstElement;

        while (currentNode != null) {
            if (key.equals(currentNode.key)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    //only works if the key exists,otherwise does nothing
    public void overrideElementWithKey(String key, String value) {
        Node currentNode = firstElement;
        if (firstElement == null) {
            return;
        }

        Node nodeToReplaceWith = new Node(key, value);
        if (key.equals(firstElement.key)) {
            nodeToReplaceWith.next = firstElement.next;
            firstElement = nodeToReplaceWith;
            return;
        }

        while (currentNode != null) {

            if (currentNode.next != null
                    && currentNode.next.key.equals(key)) {
                nodeToReplaceWith.next = currentNode.next.next;
                currentNode.next = nodeToReplaceWith;
                return;
            }
            currentNode = currentNode.next;
        }

    }
}
