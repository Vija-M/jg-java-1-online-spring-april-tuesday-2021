package students.ernests_subhankulovs.lesson_15.level_4.task_15;

public class TennisGame3 implements TennisGame {

    private int p1point;
    private int p2point;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (p1point < 4 && p2point < 4 && p1point + p2point != 6) {
            String[] p = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
            s = p[p1point];
            return (p1point == p2point) ? s + "-All" : s + "-" + p[p2point];
        } else {
            if (p1point == p2point) {
                return "Deuce";
            }
            s = p1point > p2point ? player1Name : player2Name;
            return ((p1point - p2point) * (p1point - p2point) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.p1point += 1;
        }
        else {
            this.p2point += 1;
        }
    }

}
