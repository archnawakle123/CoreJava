package main.bean;

public class Quetions1 {
		private int id;
		private String Quetions;
		private String OptionA;
		private String OptionB;
		private String OptionC;
		private String OptionD;
		private String Ans;
		
		public Quetions1(int id,String Quetions,String OptionA,String OptionB,
				String OptionC,String OptionD,String Ans)
		{
			this.id=id;
			this.Quetions=Quetions;
			this.OptionA=OptionA;
			this.OptionB=OptionB;
			this.OptionC=OptionC;
			this.OptionD=OptionD;
			this.Ans=Ans;
		}

		public int getId() {
			return id;
		}

		public String getQuetions() {
			return Quetions;
		}

		public String getOptionA() {
			return OptionA;
		}

		public String getOptionB() {
			return OptionB;
		}

		public String getOptionC() {
			return OptionC;
		}

		public String getOptionD() {
			return OptionD;
		}

		public String getAns() {
			return Ans;
		}

		
		
}