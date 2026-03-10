package learning.practices.src.logicpatterns.behaviourpattern.commandpattern;

public class ApproveLoanCommand implements LoanCommand {

    private String loanId;
    private LoanService loanService;

    public ApproveLoanCommand(LoanService loanService, String loanId) {
        this.loanService = loanService;
        this.loanId = loanId;
    }

    @Override
    public void execute() {
        loanService.approveLoan(loanId);
    }

}
