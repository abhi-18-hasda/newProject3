package learning.practices.src.logicpatterns.behaviourpattern.commandpattern;

public class CommandPattern {
    public static void main(String args[]) {
        LoanService loanService = new LoanService();
        LoanWorkFlowEngine flowEngine = new LoanWorkFlowEngine();
        flowEngine.addCommand(new ApproveLoanCommand(loanService, "12A0"));
        flowEngine.addCommand(new RejectLoanCommand(loanService, "12B0"));

        flowEngine.processCommand();
    }
}
