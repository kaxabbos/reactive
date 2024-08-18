package com.reactive.note;

import com.reactive.system.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository repository;

    public Mono<Note> save(Note note) {
        return repository.save(note);
    }

    public Mono<Note> findById(String id) {
        try {
            Long longId = Long.parseLong(id);
            return repository.findById(longId);
        } catch (Exception e) {
            throw new ObjectNotFoundException("Note not found by id " + id);
        }
    }

    public Flux<Note> findAll() {
        return repository.findAll();
    }


}
