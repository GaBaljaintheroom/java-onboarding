package onboarding;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        Stream<String> pobiPage = getPage(pobi);
        Stream<String> crongPage = getPage(crong);


    }

    private static Stream<String> getPage(List<Integer> user) {
        return user.stream().map(Object::toString);
    }

    private static OptionalInt getPageSumMax(Stream<String> page) {
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .sum())
                .max();
    }

    private static OptionalInt getPageMultiMax(Stream<String> page) {
        return page.mapToInt(str -> str.chars()
                        .map(Character::getNumericValue)
                        .reduce(1, (a, b) -> a * b))
                .max();
    }



}