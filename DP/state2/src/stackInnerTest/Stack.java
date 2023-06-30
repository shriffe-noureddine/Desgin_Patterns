package stackInnerTest;
public class Stack {
    protected final static int maxSize = 10;
    private StackState state = new EmptyState();
    protected int buffer[] = new int[maxSize];
    protected int top = 0;
    private abstract class StackState {
        abstract protected void push(int value);
        abstract protected Integer pop();
    }
    private class EmptyState extends StackState {
        @Override
        protected Integer pop() {
            return null;
        }
        @Override
        protected void push(int value) {
            buffer[top] = value;
            top++;
            state = new RegularState();
        }
    }
    private class RegularState extends StackState {
        @Override
        protected Integer pop() {
            top--;
            if (top == 0)
                state = new EmptyState();
            return buffer[top];
        }
        @Override
        protected void push(int value) {
            buffer[top] = value;
            top++;
            if (top == Stack.maxSize)
                state = new FullState();
        }
    }
    private class FullState extends StackState {
        @Override
        protected Integer pop() {
            top--;
            state = new RegularState();
            return buffer[top];
        }
        @Override
        protected void push(int value) {
        }
    }
    public void push(int value) {
        state.push(value);
    }
    public Integer pop() {
        return state.pop();
    }
}