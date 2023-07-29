package com.clientapp.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String speaker;
    private String location;
    private Date date;
    private String time;
    private String registrationLink;
    private String poster;
    private Date createdAt;

}
