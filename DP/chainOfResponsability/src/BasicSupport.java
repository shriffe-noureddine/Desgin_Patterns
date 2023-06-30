class BasicSupport implements SupportService {
    private SupportService next;

    @Override
    public void setNext(SupportService nextService) {
        next = nextService;
    }

    @Override
    public void handleIssue(SupportIssue issue) {
        if(issue.getDifficultyLevel() == 1){
            System.out.println("Basic Support handled the issue");
        } else if(next != null) {
            next.handleIssue(issue);
        }
    }
}