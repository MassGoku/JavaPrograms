package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		
		String str = "hexaware";
		int value;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				value = map.get(str.charAt(i))+1;
				map.put(str.charAt(i), value);
			}
			else
				map.put(str.charAt(i), 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i))<2) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		char[] charArray = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(!set.add(charArray[i]))
				set.remove(charArray[i]);
		}
		
		System.out.println(set);
		
		charArray = str.toCharArray();
		Arrays.sort(charArray);
		String temp = "";
		for (int i = 0; i < str.length()-1; i++) {
			if (charArray[i]==charArray[i+1]) {
				temp = temp+charArray[i];
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (!temp.contains(""+charArray[i])) {
				System.out.print(charArray[i]);
			}
		}
		System.out.println();
		//Set<String> set = new LinkedHashSet<String>();

		int[] data = {0,2,1,0,7,7,0,3};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==0)
			{
				list.remove(i);
				list.add(list.size(), 0);
			}
		}
		System.out.println(list);
		
		int count=0;
		temp="";
		for (int i = 0; i < data.length; i++) {
			if(data[i]==0)
				count++;
			else
				temp=temp+data[i]+" ";
		}
		
		for (int i = 0; i < count; i++) {
			temp=temp+0+" ";
		}
		System.out.println(temp);
		
		
	}

}
