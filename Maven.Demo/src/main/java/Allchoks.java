
	class Sweet implements Comparable{
		int weight=1;
		String name="";
		String color="yellow";
		float calories=100;
		public int compareTo(Object o) {
		return 0;
		}
		}
		class chocolate extends Sweet{}
		class FiveStar extends chocolate
		{
		FiveStar ()
		{
		this.name="This is kitkat";
		}
		}
		class KitKat extends chocolate{
		KitKat()
		{
		this.name="This is fivestar";
		}
		}
		public class Allchoks {
		public static void main(String[] args) {
		Sweet[]  allsweets = new Sweet[3];
		allsweets [0]= new FiveStar();
		allsweets [1]= new FiveStar();
		allsweets [2]= new KitKat();
		float tw =0;
		for (int i = 0; i < allsweets.length; i++) {
		Sweet s = allsweets[i];
		tw += s.weight;
		}
		System.out.println(" tw = "+tw);

		for (int i = 0; i < allsweets.length; i++) {
		Sweet s = allsweets[i];
		System.out.println(s.name);
		}
		System.out.println("");

}
		}
