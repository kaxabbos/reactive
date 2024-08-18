package com.reactive.note.converter;

import com.reactive.note.Note;
import com.reactive.note.NoteDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class NoteToNoteDtoConverter implements Converter<Note, NoteDto> {
    @Override
    public NoteDto convert(Note source) {
        return new NoteDto(
                source.getId(),
                source.getText()
        );
    }
}
