package curriculum_A;

public class lession_23 {

	/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	
	 private String animalName;
	    private double bodyLength;
	    private double speed;

	    public String getAnimalName() {
	        return animalName;
	    }

	    public void setAnimalName(String animalName) {
	        this.animalName = animalName;
	    }

	    public double getBodyLength() {
	        return bodyLength;
	    }

	    public void setBodyLength(double bodyLength) {
	        this.bodyLength = bodyLength;
	    }

	    public double getSpeed() {
	        return speed;
	    }

	    public void setSpeed(double speed) {
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	    	lession_23 animal = new lession_23();
	        animal.setAnimalName("ライオン");
	        animal.setBodyLength(2.1);
	        animal.setSpeed(80);

	        System.out.println("動物名：" + animal.getAnimalName());
	        System.out.println("体長：" + animal.getBodyLength() + "m");
	        System.out.println("速度：" + animal.getSpeed() + "km/h");
	    }
	}