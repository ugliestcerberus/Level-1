import ddf.minim.*;     //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
PImage pictureOfRecord;
int angle= 45;
void setup(){
 pictureOfRecord= loadImage("record.png");
 size(pictureOfRecord.width, pictureOfRecord.height);
 minim = new Minim(this);    
  song = minim.loadFile("ROB.mp3", 512);
}
void draw(){
rotateImage(pictureOfRecord,angle);
image(pictureOfRecord, 10, 10);

if(mousePressed){
  angle+=1;
  song.play();
} 
else{
song.pause();
}

}
  void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}

