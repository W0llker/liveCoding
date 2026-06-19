package struktury.Queue;

public interface QueueCRUD {
    void insert(Integer element);
    Integer remove();
    Integer peek();
    boolean isFull();
    boolean isEmpty();
    Integer size();
}
