float x = 0;
float y = 0;
void setup() {
  size(500,500);
  background(0, 0, 255);
}
void draw() {
  for(int i = 0; i < 300; i ++){
    ellipse(x, y, 1, 1);
    x++;
    y++;
}
}
