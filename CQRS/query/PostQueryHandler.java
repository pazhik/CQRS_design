package CQRS.query;

import CQRS.DataBase;
import CQRS.IResponse;

public class PostQueryHandler implements IQueryHandler{
    private final DataBase db;

    public PostQueryHandler(DataBase db) {
        this.db = db;
    }

    public IResponse readPost(IQuery message) {
        return db.readPost(message);
    }

    public IResponse readPostComments(IQuery message) {
        return db.readPostComments(message);
    }

    public IResponse lookUsersLikes(IQuery message) {return db.lookUsersLikes(message);}
}
