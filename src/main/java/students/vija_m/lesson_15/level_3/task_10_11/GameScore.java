package students.vija_m.lesson_15.level_3.task_10_11;

class GameScore implements TennisGame {
    private String firstPlayerName;
    private String secondPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    public GameScore(String firstPlayerName, String secondPlayerName) {
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
            return gameScore(firstPlayerScore) + " - " + gameScore(secondPlayerScore);
        }
    }

    private boolean deuce() {
        return firstPlayerScore >= 3 && firstPlayerScore == secondPlayerScore;
    }

    private boolean advantageFirstPlayer() {
        return secondPlayerScore >= 3 && firstPlayerScore == secondPlayerScore + 1;
    }

    private boolean advantageSecondPlayer() {
        return firstPlayerScore >= 3 && secondPlayerScore == firstPlayerScore + 1;
    }

    private String gameScore(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Wrong score";
        };
    }

}

