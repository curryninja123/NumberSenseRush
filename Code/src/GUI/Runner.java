package GUI;
import info.questions.TrickList.*;
import javax.swing.*;

public class Runner extends JFrame
{
	public static void main (String [] args)
	{
		boolean bool = true;
		while (bool)
		{
			int score = 0;
			String num = JOptionPane.showInputDialog("How many questions do you want to generate?");
			int n = Integer.parseInt(num);
			for (int i = 0; i < n; i++)
			{
				Question quest = generateQuestion();
				String input = JOptionPane.showInputDialog(quest.toString());
				if (quest.correct(input))
				{
					score+=5;
				}
				else
				{
					score-=4;
				}
			}
			String st = JOptionPane.showInputDialog("Your score is " + score + ". Would you like to try again? Type yes or no");
			if (st.toLowerCase().equals("yes"))
			{
				bool = true;
			}
			else if (st.toLowerCase().equals("no"))
			{
				bool = false;
			}
			else
			{
				boolean bool2 = true;
				while (bool2)
				{
					String s = JOptionPane.showInputDialog("Do you want to try again? Please type yes or no");
					if (s.toLowerCase().equals("yes"))
					{
						bool = true;
						bool2 = false;
					}
					else if (s.toLowerCase().equals("no"))
					{
						bool = false;
						bool2 = false;
					}
				}
			}
		}
	}
	public static Question generateQuestion()
	{
		int numTricks = 4;	/* <===== Attention Developers, increase number of Tricks when adding a new Trick	*/
		int a = (int)(Math.random()*numTricks)+1;
		Question q;
		switch (a)		/* Developers add your trick to this switch case list */
		{
		case 1:
			q = new Trick001();
			break;
		case 2:
			q = new Trick002();
			break;
		case 3:
			q = new Trick003();
			break;
		case 4:
			q = new Trick004();
			break;
		default:
			q = new Trick001();
		}
		return q;
	}
}
