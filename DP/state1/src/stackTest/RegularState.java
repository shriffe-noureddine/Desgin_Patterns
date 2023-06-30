package stackTest;
class RegularState extends StackState {
    protected RegularState(Stack stack) {
        super(stack);
    }
    @Override
    protected StackState pop(ParamInt paramValue) {
        stack.top--;
        paramValue.value=new Integer(stack.buffer[stack.top]);
        if (stack.top == 0)
            return new EmptyState(stack);
        return this;
    }
    @Override
    protected StackState push(int value) {
        stack.buffer[stack.top]=value;
        stack.top++;
        if (stack.top == Stack.maxSize)
            return new FullState(stack);
        return this;
    }
}