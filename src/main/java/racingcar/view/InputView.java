package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String ROUND_NUM_MESSAGE = "시도할 회수는 몇회인가요?";

    public static String getInputCarName() {
        System.out.println(CAR_NAME_MESSAGE);
        return Console.readLine();
    }

    public static String getRoundNumMessage() {
        System.out.println(ROUND_NUM_MESSAGE);
        return Console.readLine();
    }


}
