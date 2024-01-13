package oop.collection.app;

public class Node implements Comparable<Node>{


    private String content;
    private int order;

    public Node(String content,int order) {
        this.content = content;
        this.order = order;
    }

    @Override

    public int compareTo(Node o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                ", order=" + order +
                '}';
    }
}
