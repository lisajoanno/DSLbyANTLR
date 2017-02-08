/*
 Rainbowduino v3.0 Library examples:

 Print Chars on 2D plane (8x8 matrix)

*/

#include <Rainbowduino.h>
 #include <SoftwareSerial.h>

void setup()
{
  Rb.init();

    // Open serial communications and wait for port to open:
  Serial.begin(9600);
  while (!Serial) {
    ; // wait for serial port to connect. Needed for native USB port only
  }


  Serial.println("Goodnight moon!");

  
}

unsigned char x,y,z;
char notes[] = {'A','B','C','D','E','F'};
int height[] = {0,0,0,0,0,0,0};
uint32_t color = 0xFFFFFF;
int currentNote = -1;
int descentTime = 20;

void fillCircle(int x,int y, uint32_t color){
//  Rb.setPixelXY(x+1,y, color);
//  Rb.setPixelXY(x,y+1, color);
//  Rb.setPixelXY(x-1,y, color);
///  Rb.setPixelXY(x,y-1, color);

  Rb.setPixelXY(x,y, color);
}

void loop() {


}
void serialEvent() {
 // while (Serial.available()) {
    // get the new byte:
    char inChar;
    char note;
    int duration = 0;
    inChar = (char)Serial.read();
    if(inChar == '\n' || inChar == '\r')
      return;
    note = inChar;
    if(inChar == 'z') {
      delay(1);
      Serial.println("received z");
      char colorV = (char)Serial.read();
      Serial.print("color:");
      Serial.println(colorV);
    
      if(colorV == 'b'){
        color = 0x0000FF;
      } else if(colorV == 'g'){
        color = 0x00FF00;
      } else if(colorV ==  'r') {
        color = 0xFF0000;
      }
      return;
    } 
    duration = Serial.parseInt();
    Serial.print("note:");
    Serial.println((char)note);
    Serial.print("duration: ");
    Serial.println(duration);

    drawAnim(note,duration);
}
void drawAnim(char c,int duration){
  Rb.blankDisplay();
  int pos = c - 'a';//position relative to A
  currentNote = pos;
  height[pos] = 7;
  int numInt = duration/descentTime;
  for(int j = 0; j < numInt; j++){
  for(int i = 0;i<7;i++){
    if(height[i] > 0){
      Rb.drawLine(0,i,height[i],i,color);
      if(i != pos){
        height[i]--;
      }
    }
  }
  delay(descentTime);
  if(j < numInt -1)
    Rb.blankDisplay();
  }
}

