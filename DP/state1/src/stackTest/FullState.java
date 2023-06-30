package stackTest;
class FullState extends StackState {
    protected FullState(Stack stack) {
        super(stack);
    }
    @Override
    protected StackState pop(ParamInt paramValue) {
        stack.top--;
        paramValue.value = new Integer(stack.buffer[stack.top]);
        return new RegularState(stack);
    }
    @Override
    protected StackState push(int value) {
        return this;
    }
}