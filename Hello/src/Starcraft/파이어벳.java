package Starcraft;

public class ÆÄÀÌ¾îºª extends À¯´Ö {
	   int fi=0;
	   public ÆÄÀÌ¾îºª(int Hp, int st_power, int df_power) {
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