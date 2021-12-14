import processing.core.PApplet;

public class Sketch extends PApplet {
	

  public void settings() {
	// put your size call here
    int intSize = 500;
    size(intSize, intSize);
  }

  
  public void setup() {
    // Checks for the time and syncs it with an appropriate background
    int intHour = hour();
    if (intHour >= 6 && intHour <= 14) {
      background(38, 166, 235);
    }
    else if (intHour >= 15 && intHour <= 20) {
      background(77, 27, 135);
    }
    else {
      background(50, 25, 60);
    } 
  }

  
  public void draw() {
	  int intHour = hour();
    int intSize = 500;
    float fRandom = random(intSize);

    // Draws Moon
    if (intHour >= 15) {
      strokeWeight(3);
      stroke(97, 48, 65);
      fill(222, 177, 177);
      stroke(222, 177, 177);
      ellipse(width / 1.18f, height / 10, width / 10, width / 10);
      fill(77, 27, 135);
      stroke(77, 27, 135);
      ellipse(width * 0.89f, height / 10, width / 10, width / 10);
    }
    // Draws Sun
    else {
      stroke(222, 208, 80);
      fill(222, 208, 80);
      ellipse(width / 1.18f, height / 10, width / 10, width / 10);
    }
    
    
    // Draws Buildings (Back Layer)
    strokeWeight(3);
    stroke(45);
    fill(60);
    rect(0, 120, 85, 300);
    rect(85, 155, 80, 300);
    rect(165, 140, 80, 300);
    rect(310, 170, 70, 300);
    rect(220, 190, 100, 300);
    rect(360, 135, 80, 300);
    rect(430, 125, 80, 300);
    
    // Draws Buildings (Front Layer)
    stroke(50);
    fill(70);
    rect(0, 210, 80, 300);
    stroke(48);
    fill(65);
    rect(65, 180, 105, 340);
    rect(250, 235, 85, 300);
    stroke(50);
    fill(70);
    rect(width * 0.32f, height * 0.6f, 140, 340);
    triangle(158, 300, 230, 250, 302, 300);
    rect(320, 255, 100, 300);
    rect(385, 215, 80, 300);
    rect(440, 285, 80, 300);
    
    // Draws Stars
    stroke(255);
    if (intHour <= 15) {
      for (int i = 0; i < 15; i++) {
        fRandom = random(intSize);
        point(fRandom, fRandom);
      }
    }
  }
}