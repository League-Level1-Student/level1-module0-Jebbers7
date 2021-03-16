int raindropY = 0;
int score = 0;
void setup() {
  size(500,500);
}
void draw() {
  int randomNumber = (int) random(width);
  background(0, 255, 0);
  fill(0, 0, 255);
  stroke(0, 0, 255);
  ellipse(randomNumber, raindropY, 25, 25);
  raindropY += 1;
  if(raindropY == 500) {
    raindropY = 0;
}
  rect(mouseX, 500, 75,75);
  checkCatch(mouseX);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x) {
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
