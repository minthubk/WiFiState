package com.toycode.wifistate;

import android.content.Context;
import android.content.Intent;

public class WiFiStateWidgetProvider2x1l extends WiFiStateWidgetProvider {

	@Override
	protected Intent getServiceIntent(Context context) {
		return new Intent( context, UpdateService2x1l.class);
	}

}