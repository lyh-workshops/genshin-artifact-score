package org.example.genshin.artifact.score.strategy;

import org.example.genshin.artifact.score.entity.Artifact;

public interface IStrategy {
    double score(Artifact artifact);
}
