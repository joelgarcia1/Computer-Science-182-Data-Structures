import java.util.*;
public class TestHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] list = {-44, -5, -3, 3, 1, -4, 0, 1, 2, 4, 5, 53}; 
		HeapSort<Integer> hs = new HeapSort<>();
		hs.sort(list);
		for(int i=0;i<list.length;++i) {
			System.out.print(list[i]+ "  ");
		} // end for
	} // end main
			
} // end TestHeapSort


//Sample Run:
//-44  -5  -4  -3  0  1  1  2  3  4  5  53 
