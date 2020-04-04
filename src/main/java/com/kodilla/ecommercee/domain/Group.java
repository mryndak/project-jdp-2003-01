package com.kodilla.ecommercee.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GROUP")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long groupId;
    private String groupName;
    private String description;
}
