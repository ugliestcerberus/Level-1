import ddf.minim.*;     
  Minim minim;       
  AudioPlayer song;     
  minim = new Minim(this);   


PImage pictureOfRecord;
int angle= 180;
void setup (){
  pictureOfRecord= loadImage("disc.png");
  size(500, 500);
  song = minim.loadFile("awesomeTrack.mp3", 512);
song.play();
}
void draw (){
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord,50,50);
  if(mousePressed){
    angle++;
}
}

void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}

