//куча
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        System.out.println(pq); // [5, 10]
    }
}



//хеш
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map); // {a=1, b=2}
    }
}
