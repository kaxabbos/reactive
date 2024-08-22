package com.reactive.note;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository repository;

    public Flux<Note> findAll() {
        return repository.findAll();
    }

    public Mono<Note> findById(String id) {
        return repository.findById(Long.parseLong(id));
    }

    public Mono<Note> save(Note note) {
        return repository.save(note);
    }


}
