public class QueueCircularUsingArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        public Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front ==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int x){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front =0;
            }

            rear = (rear + 1)% size;
            arr[rear] = x;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int res = arr[front];
            
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }

        return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;    
            }
            
        return arr[front];
        }
    }

}
