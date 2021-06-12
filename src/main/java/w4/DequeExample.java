package w4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> messages = new ArrayDeque<>();
        messages.addLast("A");
        messages.addLast("B");
        messages.addLast("C");
        messages.addLast("D");
        System.out.println(messages);
        while(!messages.isEmpty()){
            System.out.println(messages.removeLast());
            System.out.println(messages);
        }

    }
}
