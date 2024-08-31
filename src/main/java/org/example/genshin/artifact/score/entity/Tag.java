package org.example.genshin.artifact.score.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tag implements Serializable {
    private static final long serialVersionUID = 574660963463814930L;
    private String name;
    private Double value;
}
