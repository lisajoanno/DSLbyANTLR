import serial
import sys

if len(sys.argv) < 3:
	print("Error not enough argument")
	print("usage: SerialPipe [inPortNumber] [outPortNumber]")
	sys.exit(-1)

serIn = serial.Serial('/dev/ttyACM'+sys.argv[1], 9600)
serOut = serial.Serial('/dev/ttyUSB'+sys.argv[2],9600)
while True:
	value = serIn.readline()
	print(value)
	serOut.write(value)
