void loop() {
		digitalWrite(1, HIGH);
		digitalWrite(2, HIGH);
}

void setup() {
	Serial.begin(9600);
	pinMode(1, OUTPUT);
	pinMode(2, OUTPUT);
}

