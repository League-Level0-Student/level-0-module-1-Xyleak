import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {
	
	public static void main(String[] args) {
		String Riddle = JOptionPane.showInputDialog(null, "Which Word In The Dictionary Is Spelled Incorrectly? Say Dunno If You Give Up");
		
		if (Riddle.equals("Incorrectly")){
			JOptionPane.showMessageDialog(null, "Correct, Incorrectly Is Spelled Incorrectly");
			String Riddle2 = JOptionPane.showInputDialog(null, "What Gets Broken Without Being Held?");
			if (Riddle2.equals("A Promise")) {
				JOptionPane.showInputDialog(null, "Correct You Gave Answered 2 Riddles So CONGRATULATIONS");
			}
		}
		if (Riddle.equals("Dunno")) {
		JOptionPane.showMessageDialog(null, "The Answer Is Dictionary");
		}
		if (Riddle.equals("Dictionary")) {
		JOptionPane.showMessageDialog(null, "I Lied >:) It Was Something Else");
		}
		
		if (Riddle.equals("135798462")) {
			JOptionPane.showMessageDialog(null,"Initiating Message");
			JOptionPane.showMessageDialog(null, Riddle+ "Equals Too dhnsfndgldhdjjddhghddhhhklkldhjhdfklyujpoe5i 7e095yozpd57]op5790uer[oier907u09e5uy90e5u74u09eu509y78409ueuy09riui09euy54iu90dtiuy-rijoidty-0r6ujiope5-0rij0ruydwmudjwejuncsufkmiiftote4gp;64gp.y4g0654l0p654sgo065gl,465t74 m56do1gdkiky9od4tg65kji4okd6r5ijd4gi4t56igi4o,o53ry65gye46l0p45pdt4pl4pog65u4u7k6,5td4o56tg74i67t5dhu4,gh56ou4h56,l4ogy6g5u4i65dtk4ioh564olp53f14ohyp;4olh3tk1p;65y4ko54htlyog65iohokgyri18fdtplhi1,p18r15l591h0ytdkp60251oi6og62i621io65igi32yh1iy3g1vt32oi1vgroi23vg1uok23vg1grr23vrgrgv424i267fwc2km52w46fu05wf3e72jy52wr+4352wf34u52wgj43w5352wu4f45uwfififwifiufrifrifruirfifrififikrkifgurfeefyo6yolol9twol9toltolylool9wol8erolygol5ytotolol535ol6ylote85ololwr5olto8yoel5erlotlo08olyolt5eolteoly8olol5ol3tollou5yolol8yikeor5rtor8eijefj6dwku5cf5jnh+fenhdxwhgsxq65gb4dwc59gbw4xg5b6xws4gbfxw564gfbwxd56wdx465dwx4xd564g654xsgb56s4gfb89sxg ");
		}
		
         
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}