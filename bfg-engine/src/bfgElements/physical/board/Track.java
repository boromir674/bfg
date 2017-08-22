package bfgElements.physical.board;

import java.util.HashMap;
import java.util.Map;

import bfgElements.physical.BfgItem;
import bfgExceptions.MarkerOutOfTrackException;
import bfgExceptions.PositionsMarkersMissmatchException;

public class Track {
	
	private Square[] spots;
	private Map<BfgItem, Integer> marker2position; 
	
	public Track(Square[] spots) {
		super();
		this.spots = spots;
		this.marker2position = new HashMap<BfgItem, Integer>();
	}
	
	public void initialize(BfgItem[] markers, int[] positions) throws PositionsMarkersMissmatchException, MarkerOutOfTrackException {
		if (markers.length != positions.length)
			throw new PositionsMarkersMissmatchException(String.format("Number of markers and starting positions must be equal. Instead %d and %d were given", markers.length, positions.length));
		for (int i=0; i< markers.length; i++) {
			this.place(markers[i], positions[i]);
		}
	}

	private void place(BfgItem bfgItem, int position) throws MarkerOutOfTrackException {
		if (position < 0 || position >= this.spots.length)
			 throw new MarkerOutOfTrackException(String.format("Requested to move marker %s at position %d which is out of the allowed range [%d, %d]", bfgItem.getLabel(), position, 0, this.spots.length-1));
		this.marker2position.put(bfgItem, position);
	}
	
	public void moveMarker(BfgItem marker, int position) throws MarkerOutOfTrackException {
		 this.place(marker, position);
	}
	
	public int getPosition(BfgItem marker) {
		return this.marker2position.get(marker);
	}
}
