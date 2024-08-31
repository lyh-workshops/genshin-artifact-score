package org.example.genshin.artifact.score.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Artifact implements Serializable {
    private static final long serialVersionUID = -2265516204212864589L;
    private String setName;
    private String position;
    private Tag mainTag;
    private List<Tag> normalTags;
    private Boolean omit;
    private Integer level;
    private Integer star;
    private String equip;
}
