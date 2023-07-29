
package com.clientapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private Long id;
    private Event event;
    private User user;
    private String comment;
    private int rating;


}
