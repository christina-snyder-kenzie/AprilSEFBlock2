public static int countMysteryLetter(String str, char mysteryLetter){
	int count = 0;
	for (int i = 0; i < str.length(); i++){
		char curr = str.charAt(i);
		if (curr == mysteryLetter){
			count++;
		}
	}
	return count;
}



int one = countMysteryLetter("apple", 'a');
int two = countMysteryLetter("academy", 'a');
int three = countMysteryLetter("happy", 'p');
