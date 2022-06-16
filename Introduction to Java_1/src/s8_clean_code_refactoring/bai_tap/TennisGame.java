package s8_clean_code_refactoring.bai_tap;

public class TennisGame {
    public static String tieScore(int scorePlayer) {
        String score;
        switch (scorePlayer) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String advantagePlayer(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusScore = scorePlayer1 - scorePlayer2;
        if (minusScore == 1) score = "Advantage player1";
        else if (minusScore == -1) score = "Advantage player2";
        else if (minusScore >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String underDeuce(int scorePlayer1, int scorePlayer2) {
        int tempScore;
        StringBuilder score = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score.append("-");
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
        return score.toString();
    }

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score;
        if (scorePlayer1 == scorePlayer2) {
            score = tieScore(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = advantagePlayer(scorePlayer1, scorePlayer2);
        } else {
            score = underDeuce(scorePlayer1, scorePlayer2);
        }
        return score;
    }
}
