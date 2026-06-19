package struktury.PriorityQueue;

public class PriorityQueue implements PrioriQueue{
    private Integer maxSize;
    private Integer[] prioQueue;
    private Integer nElement;
    public PriorityQueue(Integer max) {
        maxSize = max;
        prioQueue = new Integer[maxSize];
        nElement = 0;
    }

    @Override
    public void insert(Integer element) {
        int i;
        if(nElement == 0)
            prioQueue[nElement++] = element;
        else {
            for (i = nElement - 1; i >=0 ; i--) {
                if(element>prioQueue[i])
                    prioQueue[i+1] = prioQueue[i];
                else
                    break;
            }
            prioQueue[i+1] = element;
            nElement++;
        }
    }

    @Override
    public Integer remove() {
        return prioQueue[--nElement];
    }

    @Override
    public Integer peek() {
        return prioQueue[nElement];
    }
}
