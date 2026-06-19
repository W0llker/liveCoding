package struktury.Stack;

public interface StackCRUD {
    void push(int element);
    Integer pop();
    Integer peek();
    boolean isEmpty();
    boolean isFull();
}
