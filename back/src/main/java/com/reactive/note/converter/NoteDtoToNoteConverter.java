package com.reactive.note.converter;

import com.reactive.note.Note;
import com.reactive.note.NoteDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class NoteDtoToNoteConverter implements Converter<NoteDto, Note> {
    @Override
    public Note convert(NoteDto source) {
        return new Note(
                source.text()
        );
    }
}
