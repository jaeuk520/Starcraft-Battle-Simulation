package Starcraft;

public class 레이스 extends 유닛 {
	   public 레이스(int Hp, int st_power, int df_power) {
	      super(Hp, st_power, df_power);
	   }
	   public void set_unit(int unit) {
	      this.unit=unit;
	   }
	   
	   public int get_unit() {
	      this.unit+=1;
	      return this.unit;
	   }
	}