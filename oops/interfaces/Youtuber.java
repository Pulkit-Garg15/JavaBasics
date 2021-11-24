package oops.interfaces;

public abstract interface Youtuber extends VideoEditor {
	
	public abstract void makeVideos();
	
	default void editVideos() {
		
	}

}
