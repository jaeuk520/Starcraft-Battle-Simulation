package Starcraft;

public class 발키리 extends 유닛 {
	   public 발키리(int Hp, int st_power, int df_power) {
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