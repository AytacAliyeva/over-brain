package app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String fullname;

    @NotNull
    private String country;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    @Column(columnDefinition = "text")
    private String photo;

    private String lastseen;

    @OneToOne(mappedBy = "user")
    private SocialMediaLink mediaLink;

    @OneToMany(mappedBy = "user")
    private List<Question> questions;

    @OneToMany(mappedBy = "user")
    private List<Answer> answers;

    @OneToMany(mappedBy = "user")
    private List<Reaction> reactions;

    @OneToMany(mappedBy = "who")
    private List<Message> messagesFromMe;

    @OneToMany(mappedBy = "whom")
    private List<Message> messagesToMe;

    @OneToMany(mappedBy = "who")
    private List<Follow> followers;

    @OneToMany(mappedBy = "whom")
    private List<Follow> followings;
}
