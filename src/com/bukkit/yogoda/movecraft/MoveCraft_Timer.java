package com.bukkit.yogoda.movecraft;
//import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

import org.bukkit.ChatColor;

public class MoveCraft_Timer {
	//Toolkit toolkit;

	Timer timer;
	Craft craft;
	//public String state = "";

	public MoveCraft_Timer(int seconds, Craft vehicle, String state) {
		//toolkit = Toolkit.getDefaultToolkit();
		this.craft = vehicle;
		timer = new Timer();
		if(state.equals("engineCheck"))
			timer.scheduleAtFixedRate(new EngineTask(), 5000, 5000);
		else
			timer.schedule(new ReleaseTask(), seconds * 1000);
	}
	
	public void SetState(String newState) {
		//state = newState;
	}
	
	public void Destroy() {
		timer.cancel();
		craft = null;
	}
	
	class EngineTask extends TimerTask {
		public void run() {
			if(craft == null)
				timer.cancel();
			else
				craft.engineTick();
			return;
		}
	}

	class ReleaseTask extends TimerTask {
		public void run() {
			/*
			if(state.equals("engineCheck")) {
				craft.engineTick();
			}else
			if(state.equals("abandonCheck")) {
			*/				
				if(craft != null) {
					craft.player.sendMessage(ChatColor.YELLOW + craft.type.sayOnRelease);
					Craft.removeCraft(craft);
				}
				timer.cancel();
				return;
				
			//}
		}
	}
}

