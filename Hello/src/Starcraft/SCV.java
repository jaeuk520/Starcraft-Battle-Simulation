package Starcraft;

public class SCV extends РЏДж {
	   
	   public int sc=4;
	  
	   
	   public SCV(int Hp, int st_power, int df_power) {
	      super(Hp, st_power, df_power);
	   }
	   
	   public void set_unit(int unit) {
	      this.unit=unit;
	   }
	   
	   public int get_unit() {
	      this.unit+=1;
	      return this.unit;
	   }

	   
	   public void first_set_unit()
	   {
	      for(int i=0; i<4; i++) {
	          p1_units_name[i]="scv";
	          p1_units[0][i]=Hp;
	          p1_units[1][i]=st_power;
	          p1_units[2][i]=df_power;
	       }
	   }
	   
}