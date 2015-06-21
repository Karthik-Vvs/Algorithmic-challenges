package Default;


import java.util.NoSuchElementException;

class ArrayStack {

    String[] id;
    int N = 0;

    public ArrayStack(int N) {
        id = new String[N];

    }

    public boolean isEmpty() {
        return id == null;
    }

    public void push(String item) {
        if (this.N == id.length) {
            resize(2 * id.length);

        }
        id[N++] = item;
    }

    public String pop() {

        if (isEmpty()) {
            throw new NoSuchElementException("Stack Underflow");
        }
        String item=id[N-1];
        id[N-1]=null;
        N--;
         if (N > 0 && N == id.length/4) resize(id.length/2);
        return item;
    }

    public int count() {
        return this.N;
    }

    public void resize(int capacity) {
        String[] id1 = new String[capacity];

        for (int i = 0; i < N; i++) {
            id1[i] = id[i];
        }
        id = id1;
    }

    public String top() {
        return id[--N];
    }
}

public class GrowableArrayStackTest {

    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(3);
        as.push("Karthik");
        as.push("Ravi");
        as.push("Raghu");
        as.push("raghav");
        as.push("raghav1");
        as.push("raghav2");
        as.push("raghav3");

        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());





    }
}