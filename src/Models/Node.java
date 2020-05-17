package Models;
/**
 * Head
 * Tail - next
 * Size
 *  key from String can be generic
 *  value from String can be generic
 *  Node reference it points to the next node until the last node points to null
 *  Node drives the list forward to the next node
 */
public class Node {

    final String key;
    final String value;
    public Node next = null;

    public Node (String key,String value){
       this.key=key;
       this.value=value;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("key='").append(key).append('\'');
        sb.append(", value='").append(value).append('\'');
        return sb.toString();
    }
}
