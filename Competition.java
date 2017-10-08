package learning_JAVA;

public class Competition {
	public static void main(String[] args) {
	char[] A= {'a','b','c'};
	char[] B= {'x','y','z'};
	for(int i=0;i<A.length;i++) {
		for(int j=0;j<B.length;j++) {
			if(A[i]=='a'&&B[j]=='x') {
				continue;
			}
			else if(A[i]=='c'&&B[j]=='x') {
				continue;
			}
			else if(A[i]=='c'&&B[j]=='z') {
				continue;
			}
			else if(A[i]=='a'&&B[j]=='y') {
				continue;
			}
			else if(A[i]=='b'&&B[j]=='y') {
				continue;
			}else if(A[i]=='b'&&B[j]=='z') {
				continue;
			}
			else {
				System.out.println(A[i]+" VS "+B[j]);
			}
		}
	}
	}

}
