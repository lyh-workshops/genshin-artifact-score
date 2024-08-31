package org.example.genshin.artifact.score;

import org.example.genshin.artifact.score.entity.Artifact;

public interface IStrategy {
    double score(Artifact artifact);
}
