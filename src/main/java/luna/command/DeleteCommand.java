package luna.command;

import luna.LunaException;
import luna.Storage;
import luna.TaskList;

/**
 * Represents a command to delete task from list of tasks.
 */
public class DeleteCommand extends Command {
    private final int taskToDelete;

    /**
     * Creates a command to delete task.
     *
     * @param taskToDelete Index of task to delete.
     */
    public DeleteCommand(int taskToDelete) {
        this.taskToDelete = taskToDelete;
    }

    @Override
    public String execute(TaskList tasks, Storage storage) throws LunaException {
        return tasks.deleteTask(taskToDelete, storage);
    }
}
