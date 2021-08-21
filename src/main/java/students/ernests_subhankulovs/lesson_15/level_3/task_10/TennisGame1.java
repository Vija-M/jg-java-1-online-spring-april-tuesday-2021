package students.ernests_subhankulovs.lesson_15.level_3.task_10;

public class TennisGame1 implements TennisGame {

    private int mScore1 = 0;
    private int mScore2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            mScore1 += 1;
        else
            mScore2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (mScore1 == mScore2) {
            switch (mScore1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }

        else if (mScore1 >= 4 || mScore2 >= 4) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) {
                score ="Advantage player1";
            }
            else if (minusResult == -1) {
                score ="Advantage player2";
            }
            else if (minusResult >= 2) {
                score = "Win for player1";
            }
            else score = "Win for player2";
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = mScore1;
                }
                else {
                    score += "-";
                    tempScore = mScore2;
                }
                switch(tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}