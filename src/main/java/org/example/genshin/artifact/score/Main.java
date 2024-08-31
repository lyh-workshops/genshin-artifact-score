package org.example.genshin.artifact.score;

import cn.hutool.core.io.file.FileReader;
import com.alibaba.fastjson2.JSON;
import org.example.genshin.artifact.score.entity.Artifact;
import org.example.genshin.artifact.score.entity.MoNa;
import org.example.genshin.artifact.score.strategy.SimpleStrategy;
import org.example.genshin.artifact.score.strategy.StrategyContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("data/mona.json");
        String jsonString = fileReader.readString();
        MoNa data = JSON.parseObject(jsonString, MoNa.class);
        List<Artifact> artifacts = new ArrayList<>();
        artifacts.addAll(data.getFlower());
        artifacts.addAll(data.getFeather());
        artifacts.addAll(data.getSand());
        artifacts.addAll(data.getCup());
        artifacts.addAll(data.getHead());
        StrategyContext strategyContext = new StrategyContext(new SimpleStrategy());
        artifacts.sort((o1, o2) -> {
            double score1 = strategyContext.executeStrategy(o1);
            double score2 = strategyContext.executeStrategy(o2);
            return Double.compare(score2, score1);
        });
        for (Artifact artifact : artifacts) {
            System.out.printf("名称 = %s, 部位 = %s, 双暴得分 = %.2f, 装备者 = %s\n", artifact.getSetName(), artifact.getPosition(), strategyContext.executeStrategy(artifact), artifact.getEquip());
        }
    }
}
