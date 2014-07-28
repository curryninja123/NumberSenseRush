package info.questions.TrickList;

public class Trick002 extends Question 		//Squaring numbers ending in 5
{
	@Override
	public int getAnswerType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateQuestion() 
	{
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*12)+3;
		int b = a*10+5;
		String c = b + " x " + b;
		String d = (b*b)+"";
		setQuestion(c);
		setAnswer(d);
	}

}
