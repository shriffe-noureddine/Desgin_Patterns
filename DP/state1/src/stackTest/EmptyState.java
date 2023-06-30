package stackTest;
class EmptyState extends StackState {
    protected EmptyState(Stack stack) {
        super(stack);
    }
    @Override
    protected StackState pop(ParamInt paramValue) {
        paramValue.value=null;
        return this;
    }
    @Override
    protected StackState push(int value) {
        stack.buffer[stack.top]=value;
        stack.top++;
        return new RegularState(stack);
    }
}