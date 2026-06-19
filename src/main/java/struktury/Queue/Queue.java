package struktury.Queue;

public class Queue implements QueueCRUD {
    private Integer top;
    private Integer front;
    private Integer nElement;
    private Integer maxSize;
    private Integer[] queue;

    public Queue(Integer size) {
        maxSize = size;
        queue = new Integer[maxSize];
        top = -1;
        nElement = 0;
        front = 0;
    }

    @Override
    public void insert(Integer element) {
        if (top == maxSize - 1)
            top = -1;
        queue[++top] = element;
        nElement++;
    }

    public void showAllElement() {
        if (front < top)
            for (int i = front; i < top + 1; i++) {
                System.out.println(queue[i]);
            }
        else if (top < front) {
            for (int i = top - 1; i < front; i++) {
                System.out.println(queue[i]);
            }

        }
    }

    @Override
    public Integer remove() {
        Integer result = queue[front++];
        if (front == maxSize)
            front = 0;
        nElement--;
        return result;

    }

    @Override
    public Integer peek() {
        return queue[front];
    }

    @Override
    public boolean isFull() {
        return nElement == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return nElement == 0;
    }

    @Override
    public Integer size() {
        return nElement;
    }
}
