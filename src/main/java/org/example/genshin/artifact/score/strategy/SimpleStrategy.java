package org.example.genshin.artifact.score.strategy;

import org.example.genshin.artifact.score.entity.Artifact;
import org.example.genshin.artifact.score.entity.Tag;

import java.util.List;

public class SimpleStrategy implements IStrategy {
    @Override
    public double score(Artifact artifact) {
        // 计算 20 级 5 ⭐ 圣遗物的双爆得分
        // 暴击率 x 2 + 暴击伤害
        double score = 0.0;
        if (artifact == null) {
            return score;
        }
        if (artifact.getLevel() < 20 || artifact.getStar() < 5) {
            return score;
        }
        List<Tag> tags = artifact.getNormalTags();
        for (Tag tag : tags) {
            // 暴击率
            if (tag.getName().equals("critical")) {
                score += tag.getValue() * 100 * 2;
            }
            // 暴击伤害
            if (tag.getName().equals("criticalDamage")) {
                score += tag.getValue() * 100;
            }
        }
        // 返回计算结果
        return score;
    }
}
