public class tree {


    private int id;
    public int data;
    public tree left;
    public tree right;

    public int getId() {
        return id;
    }

    public tree(int data, tree left, tree right) {
        this.id = this.hashCode();
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        String leftValue = this.left==null?"null": String.valueOf(this.left.hashCode());
        String rightValue = this.left==null?"null": String.valueOf(this.right.hashCode());
        return "LinkedListNode{" +
                "id=" + this.getId() +
                ", data=" + this.data +
                ", left=" + leftValue +
                ", right=" + rightValue +
                '}';
    }
}