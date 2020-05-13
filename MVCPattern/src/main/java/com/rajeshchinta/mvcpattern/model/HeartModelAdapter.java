package com.rajeshchinta.mvcpattern.model;

public class HeartModelAdapter implements BeatModelInterface {
	
	HeartModelInterface heartModel = null;
	
	public HeartModelAdapter(HeartModelInterface heartModel) {
		this.heartModel = heartModel;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBPM() {
		return heartModel.getHeartRate();
	}

	@Override
	public void registerObserver(BeatObserver o) {
		heartModel.removeObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		heartModel.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		heartModel.registerObserver(o);
		
	}

	@Override
	public void removeObserver(BPMObserver o) {
		heartModel.registerObserver(o);
	}

}
