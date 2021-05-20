float num = 0;
float iteration = 0;
float equality = 0;
float d = 0;
void loop() {
		bool bools[2] = {true, false};
		while(digitalRead(1) == LOW){
			Serial.println("Press the button to continue");

			if(digitalRead(1) == HIGH){

				if(num == 0){
					num = num + 1;
					iteration = iteration + 1;
				}
				else {
					num = num + iteration;
				}
			}
		}
		EqualOrNot(num);
		for(int value = 0; value < 15; value++) {
			Serial.println(value);
		}
		delay(30000);
		do {
			Serial.println("Num was equals to iteration, added 2 to num");
			num = num + 2;
		} while (num == iteration);
		d = DoubleMyInt(num);
}

void EqualOrNot(float a) {
		while(equality < a){
			equality = equality + 2;
		}

		if(equality == a){
			digitalWrite(2, HIGH);
			digitalWrite(3, LOW);
		}
		else if(equality > a){
			digitalWrite(3, HIGH);
			digitalWrite(2, LOW);
		}
		else {
			digitalWrite(2, HIGH);
			digitalWrite(3, HIGH);
			Serial.println("Something went wrong..");
		}
		return;
}

float DoubleMyInt(float numb) {
		return numb + 2;
}

void setup() {
	Serial.begin(9600);
	pinMode(1, INPUT);
	pinMode(2, OUTPUT);
	pinMode(3, OUTPUT);
}

