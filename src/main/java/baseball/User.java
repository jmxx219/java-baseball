package baseball;

import baseball.util.InputValueValidation;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private List<Integer> bat;
    private final InputValueValidation inputValueValidation = new InputValueValidation();

    public List<Integer> getBat() {
        return this.bat;
    }

    public void hitTheBall() {
        String inputValue = Console.readLine().strip();

        if (!inputValueValidation.isValid(inputValue)) {
            throw new IllegalArgumentException();
        }

        bat = toListInteger(inputValue);
    }

    private List<Integer> toListInteger(String number) {
        return Arrays.stream(number.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }


}
