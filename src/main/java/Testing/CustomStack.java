package Testing;

import java.util.Stack;

public class CustomStack extends Stack {

    @Override
    public synchronized Object pop() {
        return super.pop();
    }

    @Override
    public synchronized Object peek() {
        return super.peek();
    }
}
