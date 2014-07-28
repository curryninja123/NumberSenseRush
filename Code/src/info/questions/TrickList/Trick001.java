/**
 * 
 */
package info.questions.TrickList;

/**
 * @author Vishnu
 *
 */
public class Trick001 extends Question 		// FOIL Trick
{
	public int getAnswerType()
	{
		return 0;
	}
	public void generateQuestion()
	{
		int a = (int)(Math.random()*85)+13;
		int b = (int)(Math.random()*85)+13;
		String str = a + " x " + b;
		setQuestion(str);
		String s = (a*b)+"";
		setAnswer(s);
	}
}