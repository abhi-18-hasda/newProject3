package learning.practices.src.logicpatterns.behaviourpattern.commandpattern;

public class LoanService {
    public void approveLoan(String loanId) {
        System.out.println("Loan approved: " + loanId);
    }

    public void rejectLoan(String loanId) {
        System.out.println("Loan rejected: " + loanId);
    }
}
