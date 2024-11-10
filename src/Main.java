public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> numbers1 = new ArrayStack<>();
        ArrayStack<Integer> numbers2 = new ArrayStack<>();
        ArrayStack<Integer> number3 = new ArrayStack<>();
//

        numbers1.push(200);
        numbers1.push(200);
        numbers1.push(100);

        numbers2.push(100);
        numbers2.push(100);
        numbers2.push(200);

        number3.merge(numbers1, numbers2);
        number3.toString();

    }
}