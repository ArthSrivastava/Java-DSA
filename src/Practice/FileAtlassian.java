import java.util.*;

public class FileAtlassian {
    static class Pair {
        private String collectionName;
        private int value;

        public Pair(String collectionName, int value) {
            this.collectionName = collectionName;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + collectionName + ":" + value + "}";
        }
    }

    static class FileCollection {
        private int totalSize;
        private Map<String, Integer> collectionMap;

        public FileCollection() {
            this.totalSize = 0;
            this.collectionMap = new HashMap<>();
        }

        public void addFile(String fileName, int fileSize, List<String> collectionName) {
            this.totalSize += fileSize;
            for (String collection : collectionName) {
                int temp = 0;
                if (collectionMap.containsKey(collection)) {
                    temp = collectionMap.get(collection);
                }
                temp += fileSize;
                collectionMap.put(collection, temp);
            }
        }

        public List<Pair> topK(int k) {
            PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.value - p2.value);
            for(String collection: collectionMap.keySet()) {
                pq.offer(new Pair(collection, collectionMap.get(collection)));
                if(pq.size() > k) pq.poll();
            }
            List<Pair> ans = new ArrayList<>();
            while(!pq.isEmpty()) ans.add(0, pq.poll());
            return ans;
        }

    }

    public static void main(String[] args) {
        FileCollection fileCollection = new FileCollection();
        fileCollection.addFile("file1.txt", 100, Collections.emptyList());
        fileCollection.addFile("file2.txt", 200, List.of("collection1"));
        fileCollection.addFile("file3.txt", 200, List.of("collection1"));
        fileCollection.addFile("file4.txt", 300, List.of("collection2"));
        fileCollection.addFile("file5.txt", 100, Collections.emptyList());
        System.out.println(fileCollection.totalSize);
        System.out.println(fileCollection.topK(2));
    }
}