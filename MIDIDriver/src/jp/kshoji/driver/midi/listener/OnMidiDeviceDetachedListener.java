package jp.kshoji.driver.midi.listener;

import android.hardware.usb.UsbDevice;

/**
 * Listener for MIDI detached events
 * 
 * @author K.Shoji
 */
public interface OnMidiDeviceDetachedListener {
	/**
	 * device has been detached
	 * 
	 * @param device
	 */
	void onDeviceDetached(UsbDevice device);
}