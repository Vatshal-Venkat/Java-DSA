public class LinearSearch {
        public static void sct(int num[], int find){
            for (int i=0;i<=num.length;i++){
                if (num[i]==find){
                    System.out.println(find+" is found at index "+i);
                }
            }
            
        }
        public static void main(String[] args) {
            int num[] = {2,4,6,8,10,12,14,16};
            
            sct(num, 14);
        }
    }

