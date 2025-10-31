public class strLexico {
    public static void main(String[] args) {
        String movies[] = {"Interstellar","Spiderman","Shutter Island"};
        String largest = movies[0];

        for (int i=1;i<movies.length;i++){
            if (largest.compareTo(movies[i]) < 0){
                largest = movies[i];
                System.out.println(largest);
            }
        
        }
        System.out.println(largest);
    }
}
