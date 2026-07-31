package liveCoding.Thread.CallableFuture;

import java.util.concurrent.Callable;

public class Parallelepiped implements Callable<Integer> {
    private Integer height;
    private Integer wight;
    private Integer length;
    private Integer result;

    public Parallelepiped(Integer height, Integer wight, Integer length) {
        this.height = height;
        this.wight = wight;
        this.length = length;
    }

    @Override
    public Integer call() throws Exception {
        result = height*wight*length;
        return result;
    }
}
