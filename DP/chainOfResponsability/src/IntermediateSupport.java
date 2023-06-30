class IntermediateSupport implements SupportService {
    private SupportService next;

    @Override
    public void setNext(SupportService nextService) {
        next = nextService;
    }

    @Override
    public void handleIssue(SupportIssue issue) {
        if(issue.getDifficultyLevel() == 2){
            System.out.println("Intermediate Support handled the issue");
        } else if(next != null) {
            next.handleIssue(issue);
        }
    }
}