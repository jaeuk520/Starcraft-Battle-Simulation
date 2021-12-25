package Starcraft;

public class À¯´Ö extends Å×¶õ{
    public int st_power;
    public int df_power;
     
    public À¯´Ö(int Hp, int st_power, int df_power) {
	      this.Hp=Hp;
	      this.st_power=st_power;
	      this.df_power=df_power;
	   }
	   public int p1_setHp() {
	      p1_units[0][unit]=this.Hp;
	      return Hp;
	   }
	   public int p1_setSt() {
	      p1_units[1][unit]=this.st_power;
	      return this.st_power;
	   }
	   public int p1_setDf() {
	      p1_units[2][unit]=this.df_power;
	      return this.df_power;
	   }
	   public int p2_setHp() {
	      p2_units[0][unit]=this.Hp;
	      return Hp;
	   }
	   public int p2_setSt() {
	      p2_units[1][unit]=this.st_power;
	      return this.st_power;
	   }
	   public int p2_setDf() {
	      p2_units[2][unit]=this.df_power;
	      return this.df_power;
	   }
}