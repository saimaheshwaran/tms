package com.tools.tms.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Builder
@Getter
@Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Entity
public class User {

    @Id
    @SequenceGenerator(name="usr_seq_gen", sequenceName = "usr_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usr_seq_gen")
    @JsonProperty("user_id")
    @Setter(AccessLevel.NONE)
    @Column(name = "id")
    private Long id;

    @JsonProperty("user_name")
    @Column(nullable = false, unique=true)
    private String username;

    @JsonProperty("user_pwd")
    @Column(name = "usr_pwd", nullable = false)
    private String password;

    @JsonProperty("user_role")
    @Column(nullable = false, unique=true)
    private String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getRole(), user.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword(), getRole());
    }
}
