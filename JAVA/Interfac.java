public class Interfac {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
}

interface  ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up,Down,Left,Right,Diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up,Down,Left,Right");
    }
}

class Soldier implements ChessPlayer{
    public void moves() {
        System.out.println("Up");
    }
}

/*interface Herbivore{
 * 
} 
 interface Carnivore{
}
 class omnivore implements Herbivore, carnivore*/