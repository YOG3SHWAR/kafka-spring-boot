package com.kafka.domain;

import lombok.Data;

@Data
public class LibraryEvent {
    private Integer libraryEventId;
    private LibraryEventType libraryEventType;
    private Book book;
}
