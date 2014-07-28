<h1>Number Sense Rush</h1>
=================

Nethra

Number Sense Rush is an open-sourced application to practice UIL Number Sense Questions from a Java Console. This project is currently under development and alpha testing by Dulles High School SNHS Developer Program. If you would like to start collaborating on this project, please talk to an author.

<h2>Details</h2>
-------

Current Version: 1.0 alpha
Tricks included: 4
Authors: 1

<h2>Authors</h2>
-------

Vishnu Iyer: vishnu72498@gmail.com

<h2>API Help for Developers</h2>
-----------------------

If you are a developer collaborating on this project, there are a few steps you must take in order to advance the program. First things first, the structure of the application is so: there is a GUI package in which all the user interface programs shall be placed as of now, only a package info and a Runner (void main) file are in the package. There is another package called info.TrickList, which contains an abstract class by the name of Question. There are many classes which extend Question, and they take the suffix "Trick" followed by a three digit number code.For example:
<code>public class Trick003 extends Question</code>
Each of these represents a question type. To add a new question type, you must create a new class and then update the GUI and API.

Here's a detailed guide to updating the project. It's as easy as 1,2,3!

<ol>
	<li>	Create a new Trick class
		<ul>
			<li>	create a class named Trickxyz, where xyz is a three digit number code (keep it in order please)</li>
			<li>	extend class Question</li>
			<li>	add your three digit numerical code and brief trick name to  the TrickList text file in package TrickList</li>
			<li>	DO NOT OVERRIDE THE CONSTRUCTOR</li>
			<li> 	override method <code>getAnswerType()</code> and return the number of the type of desired answer seen in the AnswerTypes file in package TrickList</li>
			<li>	override method <code>generateQuestion()</code>, which is where your code bulk will be. use <code>setQuestion(String question)</code> to set your question and <code>setAnswer(String answer)</code> to set your answer</li>
		</ul>
	</li>
	<li>	Update the GUI
		<ul><li>	go to the GUI package and open the Runner class</li>
		<li>	Under <code>void generateQuestion()</code>you will see a line of code similar to <code>int numTricks = 4;</code>. Increase the number by the number of tricks you added.</li>
		<li>	add your tricks to the switch-case loop in <code>void generateQuestion()</code></li>
		<li>	test your program!</li></ul>
	</li>
	<li> Update the README
		<ul>	<li>add a trick to the number of Tricks included as seen above</li>
		<li>	after your trick has been successfully added, add your name to the list of authors if it is not already there.</li>
		<li>	if any extra documentation is required for your trick, please include it</li>
		<li>	if more software support is needed or there is a bug that needs to be fixed, please contact another developer</li>
		<li>	thank you for helping this project move forward!</li></ul>
	</li>
</ol>
