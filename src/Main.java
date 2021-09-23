import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Main {
    void arrayExample() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("foo", "bar", "test1", "test2", "METCS622", "BU", "Boston University"));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list.indexOf("BU"));
        System.out.println(list.contains("METCS622"));
        System.out.println(list.contains("test2"));
        System.out.println(list.contains("test3"));
        list.remove("foo");
        list.remove("bar");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    void navigableSet() {

    }

    void arrayDeque() {
        Deque<Integer> deque = new ArrayDeque<Integer>(4);
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        for (Integer integer : deque) {
            System.out.println(integer);
        }
        deque.removeLast();
        for (Integer integer : deque) {
            System.out.println(integer);
        }


    }

    void hashSet() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(3);
        boolean b2 = set.add(1);
        boolean b3 = set.add(3);
        boolean b4 = set.add(2);

        for (Integer integer : set) {
            System.out.print(integer + ",");
        }
    }

    void queue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.poll();
        queue.poll();
        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }

    void map() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    void hashSetEx() {
        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("bar");
        set.add("test1");
        set.add("test2");
        set.add("METCS622");
        set.add("BU");
        set.add("BOSTON UNIVERSITY");

        for (String str : set) {
            System.out.println(str);
        }
        System.out.println(set.contains("BU"));
        System.out.println(set.contains("test3"));
        set.remove("foo");
        set.remove("bar");

    }

    void testPerformance() {
        Instant startV = Instant.now();
        Vector<Integer> a = new Vector();
        for (int i = 0; i < 1000000; i++) {
            a.add(i);
        }
        Instant stopV = Instant.now();
        System.out.println("--vector--->" + Duration.between(startV, stopV).getNano());

        Instant startQ = Instant.now();
        ArrayDeque c = new ArrayDeque(20);
        for (int k = 0; k < 1000000; k++) {
            c.add(k);
        }
        Instant stopQ = Instant.now();
        System.out.println("--arrayDeque--->" + Duration.between(startQ, stopQ).getNano());

        Instant startA = Instant.now();
        ArrayList b = new ArrayList();
        for (int j = 0; j < 1000000; j++) {
            b.add(j);
        }
        Instant stopA = Instant.now();
        System.out.println("--arraylist--->" + Duration.between(startA, stopA).getNano());

        Instant startHM = Instant.now();
        Map<String, String> map = new HashMap<>();
        for (int k = 0; k < 1000000; k++) {
            map.put(String.valueOf(k), "x");
        }
        Instant stopHM = Instant.now();
        System.out.println("--HashMap--->" + Duration.between(startHM, stopHM).getNano());

        Instant startTM = Instant.now();
        Map<String, String> tmap = new TreeMap<>();
        for (int k = 0; k < 1000000; k++) {
            tmap.put(String.valueOf(k), "x");
        }
        Instant stopTM = Instant.now();
        System.out.println("--TreeMap--->" + Duration.between(startTM, stopTM).getNano());

    }

    public static void main(String[] args) {
        // write your code here

        Main main = new Main();
        //main.hashSet();
        //main.arrayExample();
        //main.arrayDeque();
        //main.queue();
        //main.map();
        //main.hashSetEx();
        main.testPerformance();
    }
}
