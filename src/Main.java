import Models.Node;
import Models.NodeList;
import Models.NodeMap;
import jdk.swing.interop.SwingInterOpUtils;

public class
Main {
    public static void main(String[] args) {

        //  System.out.println("abc".hashCode() % 8);

//        NodeList list = new NodeList();
//
//         Node alice = new Node("Alice","London");
//         Node zoe = new Node("Zoe","Sofia");
//         Node charlie = new Node("Charlie","Toronto");
//
//        list.add(alice);
//        list.add(zoe);
//        list.add(charlie);
//        list.overrideElementWithKey("Charlie","Plovdiv");
//
//        System.out.println(list.getFirstElementWithKey("Charlie"));

       // System.out.println(list);

        NodeMap nodeMap = new NodeMap();

        nodeMap.put("Alice", "Sofia");
        nodeMap.put("Alice", "Plovdiv");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");
        nodeMap.put("Alice", "Varna");

//        nodeMap.put("Dylan", "Karnobat");
//        nodeMap.put("Derek", "Sopot");
//        nodeMap.put("Ali", "Trqvna");
//        nodeMap.put("Adam", "Haskovo");
//        nodeMap.put("Sarah", "Blagoevgrad");
//        nodeMap.put("Peter", "Sofia");
//        nodeMap.put("Frank", "Sofia");
//        nodeMap.put("George", "Sofia");
//        nodeMap.put("Garry", "Sofia");
//        nodeMap.put("Bush", "Sofia");
//        nodeMap.put("Boris", "Sofia");
//        nodeMap.put("Ivan", "Sofia");
//        nodeMap.put("Iliqn", "Sofia");
//        nodeMap.put("Vladimir", "Sofia");

//        nodeMap.put("Zoe", "Brussels");
//        nodeMap.put("Charlie", "Varna");
     //   System.out.println(nodeMap.get("aaa"));
        System.out.println(nodeMap.getSize());
      //  System.out.println();
    }


}
