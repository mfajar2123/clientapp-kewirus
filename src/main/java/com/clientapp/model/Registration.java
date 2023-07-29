package com.clientapp.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
    private Long id;
    private Event event;
    private User user;
    private Date registrationDate;

}
