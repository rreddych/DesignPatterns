package com.rajeshchinta.mvcpattern;

import com.rajeshchinta.mvcpattern.controller.BeatController;
import com.rajeshchinta.mvcpattern.controller.ControllerInterface;
import com.rajeshchinta.mvcpattern.controller.HeartController;
import com.rajeshchinta.mvcpattern.model.BeatModel;
import com.rajeshchinta.mvcpattern.model.HeartModel;
import com.rajeshchinta.mvcpattern.model.HeartModelInterface;

public class DJViewTest {

	public static void main(String[] args) throws InterruptedException {
		
		// Test BeatModel related features - Views, Controller, Model
		
		BeatModel beatModel = new BeatModel();
		ControllerInterface beatController = new BeatController(beatModel);
		 
		
		//Test HeartModel related features -Views, Controller, Model
		// Here DJView is re-used for MusicBeatControlling , HeartBeatControlling - By using 
		// Strategy pattern, by interchanging BeatController, HeartController accordingly
		// Adapter pattern is used to adapt HeartModel's interface to BeatModel interface
		HeartModelInterface heartModel = new HeartModel();
		ControllerInterface heartController = new HeartController(heartModel);
	}
}
