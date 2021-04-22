package CQRS;

import CQRS.command.ICommand;
import CQRS.query.IQuery;

public interface DataBase {
    void createUser(ICommand command);
    void createPost(ICommand command);
    void publishLike(ICommand command);
    void publishComment(ICommand command);

    IResponse readPost(IQuery query);
    IResponse readPostComments(IQuery query);
    IResponse lookUsersLikes (IQuery query);
}
