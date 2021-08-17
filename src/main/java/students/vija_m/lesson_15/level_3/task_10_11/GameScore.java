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

    }

    @Override
    public String score() {
        return null;
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

    private String scores(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "Invalid score";
        };
    }

}

