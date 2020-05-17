package Models;

/**
 * INITIAL_CAPACITY - this is the size of the buckets
 * put -method that adds element to the map
 */
public class NodeMap {

    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.5;
    private int size;

    NodeList[] buckets;

    public NodeMap() {
        this.buckets = new NodeList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void put(String key, String value) {


        resizeWhenNeeded();

        //get bucket for key
        int bucketIndex = getBucketIndex(key);

        // if this bucket does not exist, initialize  it with an empty list
        if (this.buckets[bucketIndex] == null) {
            this.buckets[bucketIndex] = new NodeList();
        }

        //get the bucket where our element is added
        NodeList currentBucket = this.buckets[bucketIndex];


        Node existing = currentBucket.getFirstElementWithKey(key);
        //there is no element with this key
        if (existing == null) {

            //increase size only when element is unique
            size++;

            //create object of type 'Node' with key and value
            Node nodeToPut = new Node(key, value);

            //add the element to the current bucket
            currentBucket.add(nodeToPut);

            return;
        }

        currentBucket.overrideElementWithKey(key, value);
    }

    private void resizeWhenNeeded() {

        //TODO IMPLEMENT RESIZE BUCKETS


        //bucket length = 4
        //load factor = 0.5
        //size = 1
        //1 < 2 => true
        if (size < buckets.length * LOAD_FACTOR) {
            return;
        }
        //bucket length = 4
        //load factor = 0.5
        //size = 2
        //2 < 2 => true
        NodeList[] newBuckets = new NodeList[buckets.length * 2];

        for (NodeList existingList : buckets) {

        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean contains(String key) {
        String node = this.get(key);
        if (node != null) {
            return true;
        }
        return false;
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
