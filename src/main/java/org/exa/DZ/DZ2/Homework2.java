package org.exa.DZ.DZ2;

public class Homework2 {

/**
 * 1. Реализовать метод isPalindrome
 * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
 */

/**
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdedcba"));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("abba"));

    }
        static boolean isPalindrome(String source) {
            int count = source.length() / 2;
            for (int i =0; i<count; i++){
                if (source.charAt(i) != source.charAt(source.length() - i - 1))
                    return false;
            }
            return true;
    }
}
