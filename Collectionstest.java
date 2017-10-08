package learning_JAVA;

public class Collectionstest {
	public static void main(String[] args) {
		PermutationAll("abc".toCharArray(),0);
	}
	public static void PermutationAll(char[] Stringto,int indexs) {
		char temp;
		int clength=Stringto.length;
		if(indexs<0||Stringto==null||clength==0) {
			return;
		}
		if(indexs==clength) {
			System.out.println(Stringto);
		}else {
			for(int j=indexs;j<clength;j++) {
				temp=Stringto[j];
				Stringto[j]=Stringto[clength-1];
				Stringto[clength-1]=temp;
				PermutationAll(Stringto,indexs+1);
				temp=Stringto[j];
				Stringto[j]=Stringto[clength-1];
				Stringto[clength-1]=temp;
			}
		}
		
	}

}
