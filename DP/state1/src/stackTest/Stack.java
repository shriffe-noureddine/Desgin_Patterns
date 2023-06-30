package stackTest;
public class Stack {
    protected final static int maxSize = 10;
    private StackState state = new EmptyState(this);
    protected int buffer[] = new int[maxSize];
    protected int top = 0;
    public void push(int value) {
        StackState newState = state.push(value);
        state = newState;
    }
    public Integer pop() {
        ParamInt paramValue = new ParamInt();
        StackState newState = state.pop(paramValue);
        state = newState;
        return paramValue.value;
    }
}