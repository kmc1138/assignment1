## Feedback from Kieran

**Score as of Nov 20, 2021:** 72/75

Really excellent work.  I can see that you really WROTE your own 
implementations, rather than copying from what we did in class.  GREAT JOB!

I have entered comments in your code, just as feedback.

The only reason I'm taking 3 points off is that the assignment asked
for a Gradle project, but this was an Eclipse project.  I remember that you had some trouble with Brew and Gradle.  I don't
remember where that ended.  If you still have trouble with Gradle,
let's get it sorted out.

I had to remove the Eclipse files from my working copy of your repo
in order to work with it in IntelliJ (IntelliJ wouldn't lead the project
at all otherwise, and couldn't even create its own IntelliJ project).  This 
is why I pushed my version to a branch.

If it's a Gradle project then it's not bound to the IDE that 
created it.  Gradle is like a neutral third party in that respect:
it handles the "project" tasks like knowing which files to compile,
which version of Java to use, etc., so we can do those things
outside of the IDE, or in a different IDE.

You can look at the commit history in GitHub to see what I did, and 
you can look at the file called `.gitignore` to see how I told Git
not to include those files.  We will cover `.gitignore` in lab on December 2.

One comment that applies to all of your code: you are using what most would call "C-style"
open braces, rather than "Java-style" open braces.  This refers to putting the `{` that
opens a block (class, method, conditional block, etc.) on a separate line, which is
C-style.  Java-style is to put it on the same line as the statement that declares it.

Really, really great work!


