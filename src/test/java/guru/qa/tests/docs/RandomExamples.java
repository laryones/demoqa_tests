package guru.qa.tests.docs;

import static guru.qa.tests.utils.RandomUtils.getRandomMessage;
import static guru.qa.tests.utils.RandomUtils.getRandomString;

public class RandomExamples {
    public static void main(String[] args) {
        System.out.println(getRandomString(29));

        String randomMessage = getRandomMessage(32, 42);
        System.out.println(randomMessage);


    }

}
