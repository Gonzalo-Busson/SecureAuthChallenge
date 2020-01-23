package backEnd;

import java.util.List;

public class ResponsePayload {


    public Paging paging;
    public List<Result> results;

    public static class Paging {
        public int total;
        public int limit;

        public String toString() {
            return "Total: " + total +"\n" + "Limit: " + limit;
        }
    }
    public static class Result {
        public String title;
    }
}
