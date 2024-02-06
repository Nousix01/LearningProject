package ma.spring.learningproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.lang.NonNull;


@Entity
@Getter

public class DealEntity {
    @Id
    @GeneratedValue
    @NonNull
    private Long dealId;
    private String dealName;
    private Long likes;


    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public DealEntity(@NonNull Long dealId, String dealName, Long likes) {
        this.dealId = dealId;
        this.dealName = dealName;
        this.likes = likes;
    }
    public DealEntity() {

    }
}
