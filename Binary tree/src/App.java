public class App {
    public static void main(String[] args) throws Exception {

        Node a = new Node ('a'));
        Node b = new Node ('b');
        Node c = new Node ('c');
        Node d = new Node ('d');
        Node e = new Node ('e');
        Node f = new Node ('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right =e;
        c.right =f;

        //         a
        //       /   \
        //      b     c
        //     /  \    \
        //    d    e     f       

    }
}


