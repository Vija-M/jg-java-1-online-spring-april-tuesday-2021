package students.ernests_subhankulovs.lesson_15.level_4.task_15;

class TennisGame1 implements TennisGame {

    private int score1 = 0;
    private int score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            score1 += 1;
        }
        else {
            score2 += 1;
        }
    }

    public String getScore() {
        String score = "";
        int tempScore;
        if (score1 == score2) {
            score = switch (score1) {
                case 0  -> "Love-All";
                case 1  -> "Fifteen-All";
                case 2  -> "Thirty-All";
                default -> "Deuce";
            };
        }

        else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) {
                score = "Advantage player1";
            }
            else if (minusResult == -1) {
                score = "Advantage player2";
            }
            else if (minusResult >= 2) {
                score = "Win for player1";
            }
            else score = "Win for player2";
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = score1;
                }
                else {
                    score += "-";
                    tempScore = score2;
                }
                score = switch (tempScore) {
                    case 0  -> score += "Love";
                    case 1  -> score += "Fifteen";
                    case 2  -> score += "Thirty";
                    case 3  -> score += "Forty";
                    default -> score;
                };
            }
        }
        return score;
    }
}