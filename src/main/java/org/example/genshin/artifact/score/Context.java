package org.example.genshin.artifact.score;

import org.example.genshin.artifact.score.entity.Artifact;

public class Context {
    private final IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(Artifact artifact) {
        return strategy.score(artifact);
    }
}
