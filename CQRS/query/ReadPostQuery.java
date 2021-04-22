package CQRS.query;

public class ReadPostQuery implements IQuery{
    private final int postId;

    public ReadPostQuery(int postId) {
        this.postId = postId;
    }
}
