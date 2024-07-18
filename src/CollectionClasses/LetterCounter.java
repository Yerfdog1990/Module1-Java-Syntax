package CollectionClasses;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {
        String input = "HSIDGYREJKSBFCKITPOLHNVCXPOWSGVAZMZVQAFZHJINSWAQPFVMJHQWAVZBNM";
        Map<Character, Integer> lettercounter = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if(lettercounter.containsKey(letter)){
                int value = lettercounter.get(letter);
                lettercounter.put(letter, value + 1);
            }else{
                lettercounter.put(letter, 1);
            }
        }
        System.out.println(lettercounter);
    }
}
