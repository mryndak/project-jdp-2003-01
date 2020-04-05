package com.kodilla.ecommercee.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Group {
    private Long id;
    private String groupName;
    private String description;
}
