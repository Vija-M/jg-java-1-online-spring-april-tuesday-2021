package students.ernests_subhankulovs.lesson_15.level_4.task_12;

class TennisGame2 implements students.ernests_subhankulovs.lesson_15.level_4.task_12.TennisGame {
    public int p1point = 0;
    public int p2point = 0;

    public String p1res = "";
    public String p2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        if (p1point == p2point && p1point < 4) {
            if (p1point == 0) {
                score = "Love";
            }
            if (p1point == 1) {
                score = "Fifteen";
            }
            if (p1point == 2) {
                score = "Thirty";
            }
            score += "-All";
        }
        if (p1point == p2point && p1point >= 3) {
            score = "Deuce";
        }

        if (p1point > 0 && p2point == 0) {
            if (p1point == 1) {
                p1res = "Fifteen";
            }
            if (p1point == 2) {
                p1res = "Thirty";
            }
            if (p1point == 3) {
                p1res = "Forty";
            }
            p2res = "Love";
            score = p1res + "-" + p2res;
        }
        if (p2point > 0 && p1point == 0) {
            if (p2point == 1) {
                p2res = "Fifteen";
            }
            if (p2point == 2) {
                p2res = "Thirty";
            }
            if (p2point == 3) {
                p2res = "Forty";
            }
            p1res = "Love";
            score = p1res + "-" + p2res;
        }

        if (p1point > p2point && p1point < 4) {
            if (p1point == 2) {
                p1res = "Thirty";
            }
            if (p1point == 3) {
                p1res = "Forty";
            }
            if (p2point == 1) {
                p2res = "Fifteen";
            }
            if (p2point == 2) {
                p2res = "Thirty";
            }
            score = p1res + "-" + p2res;
        }

        if (p2point > p1point && p2point < 4) {
            if (p2point == 2) {
                p2res = "Thirty";
            }
            if (p2point == 3) {
                p2res = "Forty";
            }
            if (p1point == 1) {
                p1res = "Fifteen";
            }
            if (p1point == 2) {
                p1res = "Thirty";
            }
            score = p1res + "-" + p2res;
        }

        if (p1point > p2point && p2point >= 3) {
            score = "Advantage player1";
        }

        if (p2point > p1point && p1point >= 3) {
            score = "Advantage player2";
        }

        if (p1point >= 4 && p2point >= 0 && (p1point - p2point) >= 2) {
            score = "Win for player1";
        }
        if (p2point >= 4 && p1point >= 0 && (p2point - p1point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void setP1Score(int number) {
        for (int i = 0; i < number; i++) {
            p1Score();
        }

    }

    public void setP2Score(int number){
        for (int i = 0; i < number; i++) {
            p2Score();
        }
    }

    public void p1Score() {
        p1point++;
    }

    public void p2Score() {
        p2point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            p1Score();
        else
            p2Score();
    }
}
