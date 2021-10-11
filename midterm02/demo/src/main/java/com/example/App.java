package com.example;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    String ex = "12345";

    String r = reverseString(ex);
    System.out.println(r);
  }

  //
  // ─── 3 - 1 ────────────────────────────────────────────────────────────────────────
  //

  // Write a recursive function which returns the inputted string but with adjacent duplicate characters removed. Do not use any String functions other than .charAt(), .length(), .isEmpty()
  // and .substring(). Do not use any loops. You may use a helper function if you would like

  public static String removeAdjacentDup(String s) {
    return removeAdjDupChar(s, 0);
  }

  public static String removeAdjDupChar(String s, int index) {
    if (index < s.length() - 1) {
      if (s.charAt(index) == s.charAt(index + 1)) {
        return removeAdjDupChar(
          s.substring(0, index) + s.substring(index + 1),
          index
        );
      } else {
        return removeAdjDupChar(s, index + 1);
      }
    } else {
      return s;
    }
  }

  //
  // ─── 3 - 2 ─────────────────────────────────────────────────────────────────────────
  //
  //   Write a recursive function which returns the inputted string reversed. Do not use any String
  // functions other than .charAt(), .length(), .isEmpty() and .substring(). Do not use any loops.
  // You may not use a helper function

  public static String reverseString(String s) {
    if (s.length() > 0) {
      String top = s.substring(0, 1);
      return reverseString(s.substring(1, s.length())) + top;
    } else {
      return s;
    }
  }

  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  // Write a recursive function that returns the number of occurrences of an integer ’n’ inside of
  // an array of integers. You may not use loops or any array functions. You may use array.length
  // to determine the length of the array. Example output

  public static int countOccurences(int[] ar, int n) {
    return helper1(ar, n, ar.length);
  }

  private static int helper1(int[] ar, int n, int index) {
    if (index < ar.length) {
      if (ar[0] == n) {
        return 1 + helper1(ar, n, index + 1);
      } else {
        return helper1(ar, n, index + 1);
      }
    } else {
      return 0;
    }
  }
  //
  // ─── 3 - 4 ────────────────────────────────────────────────────────────────────────
  //


  


  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //

  //
  // ─── 3 3 ────────────────────────────────────────────────────────────────────────
  //
}
