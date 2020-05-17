package Models;

/**
 * INITIAL_CAPACITY - this is the size of the buckets
 *put -method that adds element to the map
 */
public class NodeMap {

    private static final int INITIAL_CAPACITY = 4;

    NodeList[] buckets;

    public NodeMap(){
        this.buckets = new NodeList[INITIAL_CAPACITY];
    }

    public void put(String key,String value) {
       int bucketIndex =  Math.abs(key.hashCode()) % buckets.length; // gets hash code for the string value of the key

       if (this.buckets[bucketIndex]==null){//if null then we make it not to be null
           this.buckets[bucketIndex] = new NodeList();
       }
       Node nodeToPut = new Node(key,value);
      this.buckets[bucketIndex].add(nodeToPut);

        System.out.println(bucketIndex);
    }


}
