Here is a screenshot of Spot Bugs running for the first time on calculator app
![Spotbugs](assets/SpotBugs.png)

Here are all the bugs discovered by the program

![Bugs1](assets/Bugs1.png)
![Bugs2](assets/Bugs2.png)

Here is the calculator app running
![Calculator app running](assets/CalculatorAppRunning.png)

For the first bug we have Comparison of String parameter using == or !=. This means that we are using == operators which could cause issues. To fix this bug I would use s.equals("") instead. I modified the code using the equals method.
![Bug1](assets/bug1.png)


For the second bug we have certain swing methods need to be invoked in swing thread. That means that certain swing methods like setVisible() should be called on the event dispatcher thread (EDT) to avoid threading issues. To fix this bug I would use swingUtilities.invokeLater so that setVisible(true) is called on the EDT. I modified the code using what I described.
![Bug2](assets/bug2.png)

For the 3rd bug we have could be refactored into named static class. I have created a new private static class that takes care of this issue
![Bug3](assets/bug3.png)

4th bug is setClearscreen() is never called in CalCFrameTest.java. This is because we are never using setClearscreen() in the main code because it is part of the test code. I would either modify it so that it serves a purpose or get rid of it.
![Unused Test Method](assets/UnusedTestMethod.png)

5th bug is Boxing/unboxing to parse a primitive. This means that we are creating a double from a string just to get the primitive double value. I would fix this bug by using Double.parseDouble. I modified the code using Double.parseDouble.
![Bug5](assets/bug5.png)

6th, 7th and 8th Bugs is exactly the same as bug number 5. So I did pretty much the same thing using Double.parseDouble.
![Bug6](assets/bug6.png)
![bug7](assets/bug7.png)
![bug8](assets/bu8.png)

For the 9 through 14 bugs we have the same error: `Unread field: should this field be static?` This is because their values are known at compile time and their values never change (they are constant). To fix this I would use `private static final int` to reflect that they are class-level constants rather than instance level. I modified the code using what I suggested.

![Bugs 9-14](assets/bug9-14.png)

For the 15th bug we have `Switch statement found where default case is missing`. This is because we are missing a default case for the switch statement. I would fix that by adding a default case and making it throw an error as it did not receive a valid operation. I modified the code using the fix I described.
![bug15](assets/bug15.png)

The next 4 bugs are related to an if-else statment block of code. The first is `Method uses same code for two branches` and the others are `Condition has no effect`. Here is the buggy code:

![bugs 16-19](assets/bugs16-19_.png)

This is because the if-else branches are redundant since they perform the same action. I would fix this by simply removing the entire if-else block and replacing it with a single line: `getContentPane().add(buttons[i])`. I have modified the code with what I just described.

![bugs16-19](assets/bugs16-19.png)

The last bug is another `Condition has no effect`. This is because the if statement always produces the same results since the variable is always true when it reaches this point in the code. I would fix this bug by simplifying the code to make it clearer and more efficient. I have modified the code accordingly.

![bug20](assets/bug20.png)

And here is a re-run of the analysis after I took care of all the bugs:

![Spotbugs_after](assets/spotbugs_after.png)