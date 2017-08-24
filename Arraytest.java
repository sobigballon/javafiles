package projecttest;

import java.util.Arrays;

public class Arraytest {
	/*
	 * // 第一次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 0; x++) {
	 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
	 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第一次排序后：");
	 * printArray(arr);
	 * 
	 * // 第二次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 1; x++) {
	 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
	 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第二次排序后：");
	 * printArray(arr);
	 * 
	 * // 第三次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 2; x++) {
	 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
	 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第三次排序后：");
	 * printArray(arr);
	 * 
	 * // 第四次比较 // 减1是为了防止越界 for (int x = 0; x < arr.length - 1 - 3; x++) {
	 * if (arr[x] > arr[x + 1]) { int temp = arr[x]; arr[x] = arr[x + 1];
	 * arr[x + 1] = temp; } } // 遍历数组 System.out.println("第四次排序后：");
	 * printArray(arr);
	 */
	public static void main(String[] args) {
	int[] arry= {4,3,9,5,1};
//	printArray(arry);
//	printArray(bubblesort(arry));
//	printArray(selectsort(arry));
	int[] ar=selectsort(arry);
	int af[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
//	System.out.println(binarySearch(ar,5));
	quicksort(af,0,af.length-1);
//	printArray(af);
	System.out.println(Arrays.toString(af));
	}
	
	public static void printArray(int[] a) {
		System.out.println("[");
		for (int i=0;i<=a.length-1;i++) {
			if(i==a.length-1) {
				System.out.println(a[i]);;
			}
			else {
				System.out.println(a[i]+",");
			}
		}
		System.out.println("]");
	}
	
	public static int[] bubblesort(int[] a) {
		for (int i=0;i<=a.length-1;i++) {
			for (int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	     }
		return a;
      }
	
	public static int[] selectsort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>=a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
	
	public static int binarySearch(int[] a,int value) {
		int minIndex=0;
		int maxIndex=a.length-1;
		int middle=(minIndex+maxIndex)/2;
		while(a[middle]!=value) {
			if (a[middle]>value) {
				maxIndex=middle-1;
			}else if(a[middle]<value){
				minIndex=middle+1;
			}
			middle=(minIndex+maxIndex)/2;
			
			if(maxIndex<minIndex) {
				return -1;
			}
		
		}
		return middle;
	}
//	快速排序
	public static void quicksort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j) {
//                a[i++] = a[j];// 用比基准小的记录替换低位记录
            	a[i]=a[j];
            	i++;
            }
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        quicksort(a, low, i - 1); // 对低子表进行递归排序
        quicksort(a, i + 1, hight); // 对高子表进行递归排序

    }
	
}
