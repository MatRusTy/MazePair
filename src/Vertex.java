import java.util.LinkedList;

public class Vertex {
    private String color;
    private int d;
    private LinkedList<Vertex> adj;
    private int type;

    public Vertex(int type){
        this.color = "white";
        this.d = Integer.MAX_VALUE;
        this.adj = new LinkedList<>();
        this.type = type;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getD() {
        return d;
    }
    public int getType() {
        return type;
    }
    public void setD(int d) {
        this.d = d;
    }
    public LinkedList<Vertex> getAdj() {
        return adj;
    }

}
