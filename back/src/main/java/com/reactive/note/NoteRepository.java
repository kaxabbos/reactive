package com.reactive.note;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface NoteRepository extends R2dbcRepository<Note, Long> {

}
