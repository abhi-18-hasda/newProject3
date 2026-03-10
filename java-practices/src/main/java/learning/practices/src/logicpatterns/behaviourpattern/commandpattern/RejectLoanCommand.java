package learning.practices.src.logicpatterns.behaviourpattern.commandpattern;

public class RejectLoanCommand implements LoanCommand {

    private String loanId;
    private LoanService loanService;

    public RejectLoanCommand(LoanService loanService, String loanId) {
        this.loanService = loanService;
        this.loanId = loanId;
    }

    @Override
    public void execute() {
        loanService.rejectLoan(loanId);
    }

}
