package spittr.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Spittle {

    private Spittle(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "spitter")
    private Spitter spitter;

    @Column(name = "message")
    private String message;

    @Column(name = "postedTime")
    private Date postedTime;

    public Spittle(Long id,Spitter spitter,String message,Date postedTime){
        this.id=id;
        this.spitter=spitter;
        this.message=message;
        this.postedTime=postedTime;
    }

    public Long getId() {
        return id;
    }

    public Spitter getSpitter() {
        return spitter;
    }

    public String getMessage() {
        return message;
    }

    public Date getPostedTime() {
        return postedTime;
    }
}
