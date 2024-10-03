package com.reactive.note;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Getter
@Setter
@NoArgsConstructor
public class Note {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "note_g")
    @SequenceGenerator(name = "note_g", sequenceName = "note_seq", allocationSize = 1)
    private Long id;

    @Column(length = 5000)
    private String text;

    public Note(String text) {
        this.text = text;
    }

    public void set(String text) {
        this.text = text;
    }
}
