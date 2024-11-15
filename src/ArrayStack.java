import emptyStack.EmptyStack;

import java.lang.annotation.ElementType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;
public class ArrayStack<m> {
    //isempty done.
    //Size done.
    //push done.
    //pop done.
    //peek done.
    //isfull.
    //display-display element stack from last to first.
    //getlength-get full length of the arraystack including null.
    // element.done
    int top;
    private final static int DEFAULT_CAPACITY = 3;
    private m[] Stack;

    ArrayStack(int initialCapacity) {
        top = 0;
        Stack = (m[]) (new Object[initialCapacity]);

    }

    ArrayStack() {
        this(DEFAULT_CAPACITY);

    }

    public int size() {
        return top;
    }

    public m pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        m result = Stack[top];
        Stack[top] = null;
        return result;
    }

    public m peek() {
        return Stack[top];
    }

    public boolean isEmpty() {
        return top == 0;

    }

    {
       // System.out.println("isEmpty");
    }

    public void push(m element) {
        if (isfull()) {
            Stack = Arrays.copyOf(Stack, Stack.length * 3); // expanding Capacity
            // System.out.println("Array was full and got expanded by 3");
        }
        Stack[top] = element;
        top++;
    }

    public boolean isfull() {
        return Stack.length == top;
    }

    public void display() {
        for (int i = top - 1; i >= Stack.length; i--) {
            System.out.println(Stack[i]);
        }
    }

    public m getelementbyindex(int i) {
        return Stack[i];
    }

    private boolean isDuplicated(ArrayStack array, m element) {
        if (size() == 0) {
            return false;
        }
        for (int i = 0; i < array.size(); i++) {
            return true;
        }
        return false;
    }
//
    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(Stack) +
                '}';


    }

    public void merge(ArrayStack<m> arr1, ArrayStack<m> arr2) {
        int newSize = arr1.size() + arr2.size();


        if (Stack.length < newSize) {
            Stack = Arrays.copyOf(Stack, newSize);
        }
        for (int i = 0; i < arr1.size(); i++) {
            boolean duplicated;
            duplicated = isDuplicated(this, arr1.getelementbyindex(i));
            if (!duplicated)
                this.push(arr1.Stack[i]);


        }
        for (int i = 0; i < arr1.size(); i++) {
            boolean duplicated;
            duplicated = isDuplicated(this, arr1.getelementbyindex(i));
            if (!duplicated)
                this.push(arr1.Stack[i]);

        }

    }

}







