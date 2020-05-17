import Models.Node;
import Models.NodeList;
import Models.NodeMap;

public class
Main {
    public static void main(String[] args) {

        //  System.out.println("abc".hashCode() % 8);

        NodeList list = new NodeList();

         Node alice = new Node("Alice","London");
         Node zoe = new Node("Zoe","Sofia");
         Node charlie = new Node("Charlie","Toronto");

        list.add(alice);
        list.add(zoe);
        list.add(charlie);

        System.out.println(list.getFirstElementWithKey("Alice"));

       // System.out.println(list);

//        NodeMap nodeMap = new NodeMap();
//        nodeMap.put("Alice", "Sofia");
//        nodeMap.put("Zoe", "Brussels");
//        nodeMap.put("Charlie", "Varna");
//
//        nodeMap.get("Alice");
//
//        System.out.println();
    }


}
