class AdvancedSupport implements SupportService {
    private SupportService next;

    @Override
    public void setNext(SupportService nextService) {
        next = nextService;
    }

    @Override
    public void handleIssue(SupportIssue issue) {
        if(issue.getDifficultyLevel() == 3){
            System.out.println("Advanced Support handled the issue");
        } else if(next != null) {
            next.handleIssue(issue);
        } else {
            System.out.println("Issue couldn't be handled");
        }
    }
}