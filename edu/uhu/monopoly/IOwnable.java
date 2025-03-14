package edu.uhu.monopoly;

public interface IOwnable {

	Player getOwner();

	boolean isAvailable();

	void setAvailable(boolean available);

	void setOwner(Player owner);

}