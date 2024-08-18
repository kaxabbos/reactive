package com.reactive.note;

import com.reactive.note.converter.NoteDtoToNoteConverter;
import com.reactive.note.converter.NoteToNoteDtoConverter;
import com.reactive.system.Result;
import com.reactive.system.StatusCode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService service;
    private final NoteToNoteDtoConverter toNoteDtoConverter;
    private final NoteDtoToNoteConverter toNoteConverter;

    @GetMapping
    public Mono<Result> findAll() {
        return service.findAll()
                .mapNotNull(toNoteDtoConverter::convert).collectList()
                .map(noteDtos -> new Result(true, StatusCode.SUCCESS, "Find All", noteDtos))
                .onErrorResume(e -> Mono.just(new Result(false, StatusCode.INTERNAL_SERVER_ERROR, "Error")));
    }

}
