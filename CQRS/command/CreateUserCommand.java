package CQRS.command;

import java.util.Set;

public class CreateUserCommand implements ICommand{
    private final String userName;
    private final int id;
    private final Settings settings;


    public CreateUserCommand(String userName, int id, Settings settings) {
        this.userName = userName;
        this.id = id;
        this.settings = settings;
    }
}
