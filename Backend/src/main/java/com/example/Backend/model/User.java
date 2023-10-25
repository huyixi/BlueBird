import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private String salt;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private Set<Post> posts = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments = new HashSet<>();

    // Constructors, getters and setters
}
