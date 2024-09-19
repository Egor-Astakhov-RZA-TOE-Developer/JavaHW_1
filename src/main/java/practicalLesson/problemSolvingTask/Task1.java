package practicalLesson.problemSolvingTask;

import java.util.Arrays;

public class Task1 {
    private int number;
    public Task1(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPalindrome(){
        String numStr = Integer.toString(number);
        for (int i = 0; i < numStr.length()/2; i++) {
            if(numStr.charAt(i) != numStr.charAt(numStr.length() - 1 -i)){
                return false;
            }
        }
        return true;
    }

    public int sumOfNumbers(){
        String numStr = Integer.toString(number);

        return numStr.chars()
                     .filter(Character::isDigit)
                     .map(Character::getNumericValue)
                     .sum();
    }
}
