package learning.practices.src.logicpatterns.behaviourpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class LoanWorkFlowEngine {
    private List<LoanCommand> commands = new ArrayList<LoanCommand>();

    public void addCommand(LoanCommand command) {
        commands.add(command);
    }

    public void processCommand() {
        for (LoanCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
