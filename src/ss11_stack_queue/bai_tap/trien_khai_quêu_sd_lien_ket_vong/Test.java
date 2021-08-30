package ss11_stack_queue.bai_tap.trien_khai_quêu_sd_lien_ket_vong;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = null;
        queue.rear = null;
        Solution solution = new Solution();
        solution.enQueue(queue, 2);
        solution.enQueue(queue, 4);
        solution.enQueue(queue, -6);
        solution.displayQueue(queue);

        solution.deQueue(queue);
        solution.displayQueue(queue);

        solution.deQueue(queue);
        solution.displayQueue(queue);

        solution.enQueue(queue, 2);
        solution.displayQueue(queue);

        solution.enQueue(queue, 5);
        solution.displayQueue(queue);

    }

}
