package Models;

/**
 * INITIAL_CAPACITY - this is the size of the buckets
 * put -method that adds element to the map
 */
public class NodeMap {

    private static final int INITIAL_CAPACITY = 4;

    NodeList[] buckets;

    public NodeMap() {
        this.buckets = new NodeList[INITIAL_CAPACITY];
    }

    public void put(String key, String value) {

        //get bucket for key
        int bucketIndex = getBucketIndex(key);

        // if this bucket does not exist, initialize  it with an empty list
        if (this.buckets[bucketIndex] == null) {
            this.buckets[bucketIndex] = new NodeList();
        }

        //get the bucket where our element is added
        NodeList currentBucket = this.buckets[bucketIndex];


        Node existing =  currentBucket.getFirstElementWithKey(key);
        //there is no element with this key
        if (existing==null){

            //create object of type 'Node' with key and value
            Node nodeToPut = new Node(key, value);

            //add the element to the current bucket
            currentBucket.add(nodeToPut);

            return;
        }

        currentBucket.overrideElementWithKey(key,value);
    }


    public String get(String key) {

        int bucketIndex = getBucketIndex(key);

        NodeList currentBucket = buckets[bucketIndex];

        if (currentBucket == null) {
            return null;
        }

        Node node = currentBucket.getFirstElementWithKey(key);
        return node.value;
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
        // gets hash code for the string value of the key
    }
}
