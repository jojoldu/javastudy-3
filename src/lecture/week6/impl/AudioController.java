package lecture.week6.impl;

import lecture.week6.interfaces.RemoteController;

public class AudioController implements RemoteController {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.MAX_VOLUME){
			
			this.volume = RemoteController.MAX_VOLUME;
		
		}else if(volume < RemoteController.MIN_VOLUME){
			
			this.volume = RemoteController.MIN_VOLUME;
		
		}else{
			
			this.volume = volume;
		}
	}
	
	@Override
	public void showVolume() {
		System.out.println("현재 오디오 볼륨은 " + volume + "입니다.");
	}

}
