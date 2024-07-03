defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "sample" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.70,
                 final: 0.9
               })
    end
    test "tc1" do
      assert 45 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.9,
                 final: 0.9
               })
    end
    test "tc2" do
      assert 79 ==
               Calculator.percentage_grade(%{
                 homework: [0.5,0.6,0.7],
                 labs: [0.9,0.8,0.7],
                 midterm: 0.9,
                 final: 0.9
               })
    end
    test "tc3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.3,
                 final: 0.3
               })
    end
    test "tc4" do
      assert "E" ==
               Calculator.letter_grade(%{
                 homework: [0.4],
                 labs: [0.4,0.4,0.4],
                 midterm: 0.4,
                 final: 0.4
               })
    end
    test "tc5" do
      assert "D" ==
               Calculator.letter_grade(%{
                 homework: [0.5],
                 labs: [0.5,0.5,0.5],
                 midterm: 0.5,
                 final: 0.5
               })
    end
    test "tc6" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [0.55],
                 labs: [0.55,0.55,0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end
    test "tc7" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework: [0.6],
                 labs: [0.6,0.6,0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end
    test "tc8" do
      assert "C+" ==
               Calculator.letter_grade(%{
                 homework: [0.65],
                 labs: [0.65,0.65,0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end
    test "tc9" do
      assert "B" ==
               Calculator.letter_grade(%{
                 homework: [0.7],
                 labs: [0.7,0.7,0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end
    test "tc10" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.75],
                 labs: [0.75,0.75,0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end
    test "tc11" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [0.8],
                 labs: [0.8,0.8,0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end
    test "tc12" do
      assert "A" ==
               Calculator.letter_grade(%{
                 homework: [0.85],
                 labs: [0.85,0.85,0.85],
                 midterm: 0.85,
                 final: 0.85
               })
    end
    test "tc13" do
      assert "A+" ==
               Calculator.letter_grade(%{
                 homework: [0.9],
                 labs: [0.9,0.9,0.9],
                 midterm: 0.9,
                 final: 0.9
               })
    end
    test "tc14" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.3,
                 final: 0.3
               })
    end
    test "tc15" do
      assert 1 ==
               Calculator.numeric_grade(%{
                 homework: [0.4],
                 labs: [0.4,0.4,0.4],
                 midterm: 0.4,
                 final: 0.4
               })
    end
    test "tc16" do
      assert 2 ==
               Calculator.numeric_grade(%{
                 homework: [0.5],
                 labs: [0.5,0.5,0.5],
                 midterm: 0.5,
                 final: 0.5
               })
    end
    test "tc17" do
      assert 3 ==
               Calculator.numeric_grade(%{
                 homework: [0.55],
                 labs: [0.55,0.55,0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end
    test "tc18" do
      assert 4 ==
               Calculator.numeric_grade(%{
                 homework: [0.6],
                 labs: [0.6,0.6,0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end
    test "tc19" do
      assert 5 ==
               Calculator.numeric_grade(%{
                 homework: [0.65],
                 labs: [0.65,0.65,0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end
    test "tc20" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [0.7],
                 labs: [0.7,0.7,0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end
    test "tc21" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.75],
                 labs: [0.75,0.75,0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end
    test "tc22" do
      assert 8 ==
               Calculator.numeric_grade(%{
                 homework: [0.8],
                 labs: [0.8,0.8,0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end
    test "tc23" do
      assert 9 ==
               Calculator.numeric_grade(%{
                 homework: [0.85],
                 labs: [0.85,0.85,0.85],
                 midterm: 0.85,
                 final: 0.85
               })
    end
    test "tc24" do
      assert 10 ==
               Calculator.numeric_grade(%{
                 homework: [0.9],
                 labs: [0.9,0.9,0.9],
                 midterm: 0.9,
                 final: 0.9
               })
    end
  end
end
