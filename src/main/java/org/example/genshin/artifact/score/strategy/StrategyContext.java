package org.example.genshin.artifact.score.strategy;

import org.example.genshin.artifact.score.entity.Artifact;

public class StrategyContext {
    private final IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(Artifact artifact) {
        return strategy.score(artifact);
    }
}
