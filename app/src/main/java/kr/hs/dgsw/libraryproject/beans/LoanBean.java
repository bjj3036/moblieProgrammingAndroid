package kr.hs.dgsw.libraryproject.beans;

//대출 Bean
public class LoanBean {
    private UserBean user;
    private HoldBean book;
    private long loanStart;
    private long loanEnd;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public HoldBean getBook() {
        return book;
    }

    public void setBook(HoldBean book) {
        this.book = book;
    }

    public long getLoanStart() {
        return loanStart;
    }

    public void setLoanStart(long loanStart) {
        this.loanStart = loanStart;
    }

    public long getLoanEnd() {
        return loanEnd;
    }

    public void setLoanEnd(long loanEnd) {
        this.loanEnd = loanEnd;
    }
}
