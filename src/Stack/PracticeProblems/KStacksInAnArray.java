package Stack.PracticeProblems;
//Not confident 100%
public class KStacksInAnArray {
    int[] arr, top, next;
    int k, freeTop, cap;    //freeTop stores the top of the free stack

    KStacksInAnArray(int k1, int n) {
        k = k1;
        cap = n;
        arr = new int[cap];
        next = new int[cap];
        top = new int[k];
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
        freeTop = 0;
        for (int i = 0; i < cap - 1; i++) {
            next[i] = i + 1;
        }
        next[cap - 1] = -1;
    }

    public void push(int sn, int x) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        int i = freeTop;
        arr[i] = x;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
    }

    public int pop(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Underflow");
            return -1;
        }
        int i = top[sn];
        int removed = arr[i];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return removed;
    }

    private boolean isFull() {
        return (freeTop == -1);
    }

    private boolean isEmpty(int sn) {
        return (top[sn] == -1);
    }
    public static void main(String[] args) {
        KStacksInAnArray kStack = new KStacksInAnArray(3, 6);
        kStack.push(0, 100);
        kStack.push(0, 200);
        kStack.push(0, 300);
        kStack.push(1, 400);
        System.out.println(kStack.pop(0));
        System.out.println(kStack.pop(1));
    }
}
