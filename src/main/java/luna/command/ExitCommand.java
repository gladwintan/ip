package luna.command;

import luna.Storage;
import luna.TaskList;

/**
 * Represents a command to end the chatbot session.
 */
public class ExitCommand extends Command {

    @Override
    public String execute(TaskList tasks, Storage storage) {
        return "Bye! Hope to see you again soon!";
    }
}
