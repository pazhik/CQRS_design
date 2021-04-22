package CQRS.command;

public class PublishLikeCommand implements ICommand{
    private final int publisherId;
    private final int postId;

    public PublishLikeCommand(int publisherId, int postId) {
        this.publisherId = publisherId;
        this.postId = postId;
    }
}
