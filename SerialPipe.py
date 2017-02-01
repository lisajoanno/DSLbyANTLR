import serial
serIn = serial.Serial('/dev/ttyACM0', 9600)
serOut = serial.Serial('/dev/ttyUSB1',9600)
while True:
	value = serIn.readline()
	print(value)
	serOut.write(value)