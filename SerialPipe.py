import serial
serIn = serial.Serial('/dev/ttyACM1', 9600)
serOut = serial.Serial('/dev/ttyUSB0',9600)
while True:
	value = serIn.readline()
	print(value)
	serOut.write(value)
