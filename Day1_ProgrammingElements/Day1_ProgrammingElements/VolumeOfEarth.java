public class VolumeOfEarth{
	public static void main(String[] args){
		int radius = 6378;
		double pi = 3.14;
		double volume = (4.0/3) * pi * radius*radius*radius;
		double inMiles = volume*1.6;
		System.out.println("The volume of earth in cubic kilometers is "+volume+ " and cubic miles is "+inMiles );
		
		
	}

}