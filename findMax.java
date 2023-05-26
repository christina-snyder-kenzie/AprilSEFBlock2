int[] attackValues = {88, 56, 83};
String[] pokeNames = {"Pikachu", "Squirtle", "Bulbasaur"};
//parallel arrays

int maxPosition = 0;
int maxAttack = attackValues[0]; //initializing it within the range of numbers
for (int i = 0; i < attackValues.length; i++){
	int currAttack = attackValues[i];

	if (currAttack > maxAttack){
		maxAttack = currAttack;
		maxPosition = i;
	}
}
Sop("The strongest Attack is: " + maxAttack);
Sop("The position of the attack is: " + maxPosition);
Sop("The name of the strongest pokemon is: " + pokeNames[maxPosition]);


