package java12;

import java.util.List;

public class Result {
    private long count;
    private List<Integer> filtered;

    public Result(long count, List<Integer> filtered) {
        this.count = count;
        this.filtered = filtered;
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", filtered=" + filtered +
                '}';
    }
}
