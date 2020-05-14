public class Node<T extends Comparable<? super T>> {

    private final T value;

    protected Node<T> leftChild;
    protected Node<T> rightChild;



    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }
}