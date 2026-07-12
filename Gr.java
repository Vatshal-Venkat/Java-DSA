import java.util.Scanner;

public class G {

    static class Player {
        private int playerId;
        private String playerName;
        private int runs;
        private String playerType;
        private String matchType;

        public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
            this.playerId = playerId;
            this.playerName = playerName;
            this.runs = runs;
            this.playerType = playerType;
            this.matchType = matchType;
        }

        public int getPlayerId() {
            return playerId;
        }

        public void setPlayerId(int playerId) {
            this.playerId = playerId;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public int getRuns() {
            return runs;
        }

        public void setRuns(int runs) {
            this.runs = runs;
        }

        public String getPlayerType() {
            return playerType;
        }

        public void setPlayerType(String playerType) {
            this.playerType = playerType;
        }

        public String getMatchType() {
            return matchType;
        }

        public void setMatchType(String matchType) {
            this.matchType = matchType;
        }
    }

    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int min = Integer.MAX_VALUE;

        for (Player p : players) {
            if (p.getPlayerType().equalsIgnoreCase(playerType)) {
                if (p.getRuns() < min) {
                    min = p.getRuns();
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            return 0;
        }

        return min;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {

        int count = 0;

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Player[] result = new Player[count];
        int index = 0;

        for (Player p : players) {
            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                result[index++] = p;
            }
        }

        // Descending order of playerId
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].getPlayerId() < result[j].getPlayerId()) {
                    Player temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players[i] = new Player(id, name, runs, playerType, matchType);
        }

        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int ans = findPlayerWithLowestRuns(players, playerType);

        if (ans == 0)
            System.out.println("No such player");
        else
            System.out.println(ans);

        Player[] res = findPlayerByMatchType(players, matchType);

        if (res == null)
            System.out.println("No Player found with mentioned match type");
        else {
            for (Player p : res) {
                System.out.println(p.getPlayerId());
            }
        }

        sc.close();
    }
}