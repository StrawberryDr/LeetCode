import java.util.HashMap;
import java.util.Map;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

public class solution {
    public static Node copyRandomList(Node head) {
        if(null == head){
            return null;
        }
        Map<Node,Node> m = new HashMap<>();
        Node node = head;
        while (node != null){
            m.put(node,new Node(node.val));
            node = node.next;
        }
        node = head;
        while (node != null) {
            m.get(node).next = m.get(node.next);
            m.get(node).random = m.get(node.random);
            node = node.next;
        }
        return m.get(head);
    }

    public static void main(String[] args) {
        Node node = new Node(0);
        copyRandomList(node);
    }
}
