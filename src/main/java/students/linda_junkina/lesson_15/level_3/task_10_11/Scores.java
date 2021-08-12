package students.linda_junkina.lesson_15.level_3.task_10_11;

class Scores implements TennisGame {
    int firstPlayerScore;
    int secondPlayerScore;
    String firstPlayerName;
    String secondPlayerName;

    public Scores(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            firstPlayerScore++;
        } else {
            secondPlayerScore++;
        }
    }

    @Override
    public String score() {
        if (deuce()) {
            return "Deuce!";
        } else if (advantageFirstPlayer()) {
            return "Advantage player1";
        } else if (advantageSecondPlayer()) {
            return "Advantage player2";
        } else {
            return scores(firstPlayerScore) + " - " + scores(secondPlayerScore);
        }
    }

    public boolean deuce() {
        return firstPlayerScore >= 3 && firstPlayerScore == secondPlayerScore;
    }

    public boolean advantageFirstPlayer() {
        return secondPlayerScore >= 3 && firstPlayerScore == secondPlayerScore + 1;
    }

    public boolean advantageSecondPlayer() {
        return firstPlayerScore >= 3 && secondPlayerScore == firstPlayerScore + 1;
    }

    public String scores(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Invalid score";
        };
    }
}
