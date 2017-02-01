import serial
serIn = serial.Serial('/dev/ttyACM0', 9600)
serOut = serial.Serial('/dev/ttyUSB0',9600)
while True:
	value = serIn.read()
	print(value)
	serOut.write(value)