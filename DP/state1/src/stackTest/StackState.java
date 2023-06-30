package stackTest;
abstract class StackState {
    protected Stack stack;
    StackState(Stack stack) {
        this.stack = stack;
    }
    abstract protected StackState push(int value);
    abstract protected StackState pop(ParamInt paramValue);
}