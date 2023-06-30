public class Main {
    public static void main(String[] args) {
        // Setup Chain of Responsibility
        SupportService basic = new BasicSupport();
        SupportService intermediate = new IntermediateSupport();
        SupportService advanced = new AdvancedSupport();

        basic.setNext(intermediate);
        intermediate.setNext(advanced);

        basic.handleIssue(new SupportIssue(1));
        basic.handleIssue(new SupportIssue(2));
        basic.handleIssue(new SupportIssue(3));
        basic.handleIssue(new SupportIssue(4));
    }
}