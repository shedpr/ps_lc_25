package Graph;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


class CloneGraph {
//    public Node cloneGraph(Node node) {
//        // dfs
//     if (node == null)
//            return null;
//
//        if (visited.containsKey(node)) {
//        return visited.get(node);
//    }
//
//        visited.put(node, new Node(node.val));
//
//
//        for (Node n : node.neighbors) {
//        visited.get(node).neighbors.add(cloneGraph(n));
//    }
//
//        return visited.get(node);

    // the primary goal here is the neighbors and relationship between them. focus on that.
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList();
        queue.add(node);
        visited.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            for (Node t : temp.neighbors) {
                if (!visited.containsKey(t)) {
                    Node child = new Node(t.val);
                    visited.put(t, child);
                    queue.offer(t);
                }
                visited.get(temp).neighbors.add(visited.get(t));
            }

        }
        return visited.get(node);
    }
}
