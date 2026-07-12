public class TCS2{

    class Player {
        private int id;
        private String playerName;
        private int runs;
        private String playerType;
        private String matchType;

        public Player() {}
        public Player(int id, String playerName, int runs, String playerTpe, String matchType){
            this.id = id;
            this.playerName = playerName;
            this.runs = runs;
            this.playerType = playerType;
            this.matchType = matchType;
        }

        public int id() {
            return id;
        }

        public String name() {
            return playerName;
        }

        public int runs() {
            return runs;
        }

        public String playerType () {
            return playerType;
        }

        public String matchType(){
            return matchType;
        }
    }

    public static void main(String[] args){

    }
}