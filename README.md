The code was modifed to run on a Windows OS. If you run Unix-based system (i.e Mac or Linux), change the following lines:
- In *newmath_py/bin/test*: export PYTHONPATH="$PYTHONPATH$(dirname "$0")/../src" **TO** export PYTHONPATH="$PYTHONPATH:$(dirname "$0")/../src" (line 3)
- In *newmath_java/bin/compile*: javac -encoding UTF-8 --source-path test -d dist -cp "dist;lib/junit-platform-console-standalone-1.7.1.jar" test/*.java* **TO** javac -encoding UTF-8 --source-path test -d dist -cp "dist;lib/junit-platform-console-standalone-1.7.1.jar" test/*.java (line 7)

Make sure you have Java, JavaSDK, Elixir and Python installed.

To run the code open a Unix-based command line interface (I used git bash).

Navigate to the directory you want to run the code, for example: "./seg3103_playground/newmath_java"  for running the java code.

Run the command: "./bin/run" in the current working directory (cwd) to run the program.

Run the command: "./bin/test" in the CWD to run the test program.