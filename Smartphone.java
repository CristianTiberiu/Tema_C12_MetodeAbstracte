package tech;

public class Smartphone {

	/* 	The role of abstraction is to create different functionality for each subtypes and to know
	what the derivated classes have in common.
		A class that inherits an abstract class is also abstract if will not implement
	all the abstract methods of the parent class.
	*/
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;
//	private Dimensions dimensions;
//	private Pixel pixel;

	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
			int microMaxVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theSpeaker = new Speaker(speakerMaxVol);
		this.theMicrophone = new Microphone(microMaxVol);
		this.theCase = new Case();
	}

	public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
			int speakerCrtVol, int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
		this.theCase = new Case();
	}

	public Smartphone(Screen aPhoneScreen, Case aPhoneCase, Speaker aPhoneSpeaker, 
			Microphone aPhoneMicrophone) {
	}

	public void pressVolumeUp() {
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}
	
	public void pressVolumeDown() {
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}


	public void setPixel(int pixelScreen, String color) {
		this.theScreen.setPixel(pixelScreen, color);
	}
	
	public void colorScreen(String color) {
		this.theScreen.colorScreen(color);
	}
		
	
	public void increaseMicrophoneVolume() {
		this.theMicrophone.increaseVolume();
	}

	
	public void decreaseMicrophoneVolume() {
		this.theMicrophone.decreaseVolume();
	}


	public void muteMicrophone() {
		this.theMicrophone.muteMicrophone();
	}

	
	public void setSilenceMode() {
		this.theSpeaker.setSilenceMode();
	}

//	public Case getTheCase() {
//		return theCase;
//	}
}
