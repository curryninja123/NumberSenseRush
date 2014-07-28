API
===

Current version: under development

If you want to create a new Trick
----------------------------------

. go to the src/info/questions/TrickList file
. Update Tricks.txt with a new 3-digit Trick code.
. Create a new class file called Trickxyz.java, where xyz is the three digit code of your trick.
. make sure your class file extends class Question
. override the abstract methods <code>setQuestion()</code> and <code>setAnswer()</code> in Question
. update the GUI