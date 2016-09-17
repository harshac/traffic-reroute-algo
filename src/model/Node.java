package model;

public class Node {
    private Integer value;

    public Node(int source) {
        value = source;
    }

    public void print() {
        System.out.print((char) ('A' + value));
    }

    public Integer getValue(){
        return this.value;
    }
}
