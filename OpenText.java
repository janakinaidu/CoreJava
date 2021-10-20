import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenText {
	public static void main(String[] args) {

		OpenText op = new OpenText();
		int output = op.findLeastSum(28);
		System.out.println("Final_Result=" + output);
	}

	int temp = 0;

	public int findLeastSum(int number) {
		temp = number;
		number = 28;
		int sum = 0, digit = 0;
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		int[] array = new int[sum];
		for (int i = 0; i <= sum - 1; i++) {
			array[i] = temp + i;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int newTemp = 0;
		int tempDigit = 0;

		for (int i = 0; i < array.length - 1; i++) {
			int tempSum = 0;
			int newNumber = array[i + 1];
			newTemp = newNumber;
			//System.out.println("newNumber=" + newNumber);
			while (newNumber > 0) {
				tempDigit = newNumber % 10;
				tempSum = tempSum + tempDigit;
				newNumber = newNumber / 10;
			}
			//System.out.println("newNumberSum=" + tempSum);
			//System.out.println("-------");

			map.put(newTemp, tempSum);
		}
		//System.out.println(map);
		List<Integer> keys = new ArrayList<Integer>();
		for (Integer key : map.keySet()) {
			if (map.get(key) == sum) {
				keys.add(key);
			}
		}
		Collections.sort(keys);
		//System.out.println(keys.get(0));
		return keys.get(0);
	}

}
