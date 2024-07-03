defmodule Grades.Calculator do
  #added avg method to calculate the average of a list of items. returns 0 if list is empty
  defp avg(list) do
    if Enum.count(list) == 0 do
      0
    else
      Enum.sum(list) / Enum.count(list)
    end
  end

  #added failed_to_participate? method to determine if the grades are low enough to fail
  defp failed_to_participate?(avg_homework, avg_exams, num_labs) do
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
  end

  #added calculate_grade method that calculates the final grade
  defp calculate_grade(avg_labs, avg_homework, midterm, final) do
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end

  #added count_valid_labs to counts if there are enough labs to pass
  defp count_valid_labs(labs) do
    labs
    |> Enum.reject(fn mark -> mark < 0.25 end)
    |> Enum.count()
  end

  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework =
      avg(homework) #refractored all code where the average was calculated

    avg_labs =
      avg(labs)

    mark = calculate_grade(avg_labs, avg_homework, midterm, final) #refractored all code where grade calculation was required
    round(mark * 100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework =
      avg(homework)

    avg_labs =
      avg(labs)

    avg_exams = (midterm + final) / 2

    num_labs =
      count_valid_labs(labs) #refractored all code where num_labs was calculated

    if failed_to_participate?(avg_homework, avg_exams, num_labs) do #refractored all code where participation is calculated
      "EIN"
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)

      cond do
        mark > 0.895 -> "A+"
        mark > 0.845 -> "A"
        mark > 0.795 -> "A-"
        mark > 0.745 -> "B+"
        mark > 0.695 -> "B"
        mark > 0.645 -> "C+"
        mark > 0.595 -> "C"
        mark > 0.545 -> "D+"
        mark > 0.495 -> "D"
        mark > 0.395 -> "E"
        :else -> "F"
      end
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework =
      avg(homework)

    avg_labs =
      avg(labs)

    avg_exams = (midterm + final) / 2

    num_labs =
      count_valid_labs(labs)

    if failed_to_participate?(avg_homework, avg_exams, num_labs) do
      0
    else
      mark = calculate_grade(avg_labs, avg_homework, midterm, final)

      cond do
        mark > 0.895 -> 10
        mark > 0.845 -> 9
        mark > 0.795 -> 8
        mark > 0.745 -> 7
        mark > 0.695 -> 6
        mark > 0.645 -> 5
        mark > 0.595 -> 4
        mark > 0.545 -> 3
        mark > 0.495 -> 2
        mark > 0.395 -> 1
        :else -> 0
      end
    end
  end
end
