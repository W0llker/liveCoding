package struktury;

import struktury.Stack.Stack;
import struktury.Stack.StackCRUD;

import java.util.LinkedList;

public class Main {
    static void main() {
        StackCRUD stackCRUD = new Stack(10);
        stackCRUD.push(16);
        stackCRUD.push(13);
        stackCRUD.push(11);
        stackCRUD.push(7);

        System.out.println(stackCRUD.pop());
    }
}
