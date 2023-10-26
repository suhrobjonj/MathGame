public class Player {

    private String name;
    private int score;
    private int streak;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public int getStreak() {
        return streak;
    }

    public String getName() {
        return name;
    }

    public void incrementScore() {
        score++;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public void reset() {
        score = 0;
    }
}