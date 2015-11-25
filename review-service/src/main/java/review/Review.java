package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id @GeneratedValue
    private Long id;

    private Long talkId;
    private int score;
    private String comments;
    private String reviewer;

    public Review(Long talkId) {
        this.talkId = talkId;
    }

    Review() {}

    public Long getId() {
        return id;
    }

    public Long getTalkId() {
        return talkId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
