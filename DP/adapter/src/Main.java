public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new LinkedListAdapter(linkedList);

        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}