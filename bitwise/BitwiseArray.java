import java.util.*;
public class BitwiseArray{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner  input=new Scanner(System.in);
		int range=input.nextInt();
		int number;
		for(int i=0;i<range; i++){
           number=input.nextInt();
           list.add(number);
		}
		System.out.println(list);
		for(int i=0; i<list.size()-1; i++){
			if(list.size()>1){
			for(int j=i+1; j<list.size(); j++){
              if((list.get(i)^list.get(j))==0){
              	list.remove(j);
              }
			}
		}
			
		}
		System.out.println(list);
	}
}