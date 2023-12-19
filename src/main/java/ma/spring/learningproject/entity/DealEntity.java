package ma.spring.learningproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class DealEntity {
    @Id
    @GeneratedValue
    private String dealId;
    private String dealName;
    private Long likes;

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public DealEntity(String dealId, String dealName, Long likes) {
        this.dealId = dealId;
        this.dealName = dealName;
        this.likes = likes;
    }

    public DealEntity(String dealId, String dealName) {
        this.dealId = dealId;
        this.dealName = dealName;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public DealEntity() {

    }
}
