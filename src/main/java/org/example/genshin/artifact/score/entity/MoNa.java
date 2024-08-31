package org.example.genshin.artifact.score.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MoNa implements Serializable {
    private static final long serialVersionUID = -1788120733849027024L;
    private String version;
    // 生之花
    private List<Artifact> flower;
    // 死之羽
    private List<Artifact> feather;
    // 时之沙
    private List<Artifact> sand;
    // 空之杯
    private List<Artifact> cup;
    // 理之冠
    private List<Artifact> head;
}
