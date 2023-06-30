interface SupportService {
    void setNext(SupportService nextService);
    void handleIssue(SupportIssue issue);
}