bool loopLock = true;
void loop() {

		if(digitalRead(5) == HIGH){
			while(loopLock == true){
				blink();

				if(digitalRead(6) == HIGH){
					loopLock = false;
				}
			}
		}
		else {

			if(digitalRead(6) == HIGH){
				loopLock = true;
			}
		}
}

void blink() {
		digitalWrite(13, HIGH);
		delay(1000);
		digitalWrite(13, LOW);
		delay(1000);
}

void setup() {
	Serial.begin(9600);
	pinMode(13, OUTPUT);
	pinMode(5, INPUT);
	pinMode(6, INPUT);
}

