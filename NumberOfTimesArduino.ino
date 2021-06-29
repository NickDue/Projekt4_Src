float NumberOfTimes = 0;
void loop() {
		while(digitalRead(7) == LOW){

			if(digitalRead(6) == HIGH){
				NumberOfTimes = NumberOfTimes + 1;
			}
		}
		for(int value = 0; value < NumberOfTimes; value++) {
			digitalWrite(4, HIGH);
			delay(1000);
			digitalWrite(4, LOW);
			delay(1000);
		}
		NumberOfTimes = 0;
}

void setup() {
	Serial.begin(9600);
	pinMode(4, OUTPUT);
	pinMode(6, INPUT);
	pinMode(7, INPUT);
}

