class Solution {
    public long solution(String numbers) {
        String[] input = {
                "zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};

        for (int i = 0; i < input.length; i++) {
            numbers = numbers.replaceAll(input[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}