package struktury.Stack;

public class Stack implements StackCRUD {
    private int maxSize;
    private Integer[] stack;
    private int topElement;

    public Stack(int size) {
        this.maxSize = size;
        stack = new Integer[size];
        topElement = -1;
    }

    @Override
    public void push(int element) {
        stack[++topElement] = element;
    }

    @Override
    public Integer pop() {
        return stack[topElement--];
    }

    @Override
    public Integer peek() {
        return stack[topElement];
    }

    @Override
    public boolean isEmpty() {
        return topElement == -1;
    }

    @Override
    public boolean isFull() {
        return (topElement + 1) == maxSize;
    }
}
