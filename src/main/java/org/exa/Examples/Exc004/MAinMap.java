package org.exa.Examples.Exc004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MAinMap {
    public static void main(String[] args) {
        String text = "Являясь всего лишь частью общей картины, " +
                "акционеры крупнейших компаний освещают чрезвычайно интересные особенности " +
                "картины в целом, однако конкретные выводы, разумеется, " +
                "указаны как претенденты на роль ключевых факторов. " +
                "Идейные соображения высшего порядка, " +
                "а также разбавленное изрядной долей эмпатии, рациональное " +
                "мышление создаёт предпосылки для экспериментов, поражающих " +
                "по своей масштабности и грандиозности.";
        String[] words = text.split("[.,]{0,1}\\s++"); // [точка или запятая]{0 или 1 раз} и один или больше пробелов
        HashMap<Integer, List<String>> stats = new HashMap<>();
        for (String word : words) {
            // Отбросили знаки препинания
            String pureWord = word.toLowerCase();
//                    word.replace(".", "")
//                    .replace(",", "")
//                    .toLowerCase();

            int length = pureWord.length();
            if (!stats.containsKey(length)) {
                stats.put(length, new ArrayList<>(Arrays.asList(pureWord)));
            } else {
                List<String> otherWords = stats.get(length);
                otherWords.add(pureWord);
                stats.put(length, otherWords); // Необязательно
            }
        }
        System.out.println(stats);
    }
}
