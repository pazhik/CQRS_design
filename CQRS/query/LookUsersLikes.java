package CQRS.query;

public class LookUsersLikes implements IQuery{
    private final int postId;

    public LookUsersLikes(int postId) {
        this.postId = postId;
    }
}
