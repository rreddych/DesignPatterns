package com.rajeshchinta.mvcpattern.controller;

import com.rajeshchinta.mvcpattern.model.HeartModelAdapter;
import com.rajeshchinta.mvcpattern.model.HeartModelInterface;
import com.rajeshchinta.mvcpattern.view.DJView;

public class HeartController implements ControllerInterface {
	
	HeartModelInterface heartModel;
	DJView view;
	
	public HeartController(HeartModelInterface heartModel) {
		this.heartModel = heartModel;
		// DJ view can work with object of type ControllerInterface, BeatModelInterface
		// In this case they are HeartController, HeartModelAdapter
		this.view = new DJView(this, new HeartModelAdapter(heartModel));
		this.view.createView();
		this.view.createControls();
		this.view.setViewTitle("HeartRateView");
		this.view.setControlsViewTitle("HeartControlsView - Control Not Allowed");
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void increaseBPM() {
	}

	@Override
	public void decreaseBPM() {
	}

	@Override
	public void setBPM(int bpm) {
	}

}
