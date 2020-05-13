package com.rajeshchinta.mvcpattern.controller;

import com.rajeshchinta.mvcpattern.model.BeatModelInterface;
import com.rajeshchinta.mvcpattern.view.DJView;

public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
   
	public BeatController(BeatModelInterface model) {
		this.model = model;
		// DJ view can work with object of type ControllerInterface, BeatModelInterface
		// In this case they are BeatController, BeatModel
		view = new DJView(this, model);
        view.createView();
        view.createControls();
        this.view.setViewTitle("Music Beat View");
		this.view.setControlsViewTitle("Music Beat Controller");
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}
  
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
  
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
    
	public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
	}
    
	public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
  	}
  
 	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
