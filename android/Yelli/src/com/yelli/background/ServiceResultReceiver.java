package com.yelli.background;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class ServiceResultReceiver extends ResultReceiver{
	
	private Receiver receiver;

	public ServiceResultReceiver(Handler handler) {
		super(handler);
	}
	
	public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
	
	public interface Receiver {
        public void onReceiveResult(int resultCode, Bundle resultData);
    }

    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        if (receiver != null) {
        	receiver.onReceiveResult(resultCode, resultData);
        }
    }

}
