package com.clientapp.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Advertisement {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String targetUrl;
    private Date startDate;
    private Date endDate;
    private Date createdAt;

}
