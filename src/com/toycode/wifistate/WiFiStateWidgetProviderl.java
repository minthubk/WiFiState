/*
 * Copyright (C) 2010 Hiroshi Okada <h-okada@toycode.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.toycode.wifistate;

import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;

public class WiFiStateWidgetProviderl extends AbstractWiFiStateWidgetProvider {

	@Override
	protected Intent getServiceIntent(Context context) {
		return new Intent( context, UpdateServicel.class);
	}

	public static class UpdateServicel extends AbstractUpdateService {

		@Override
		protected int getButtonID() {
			return R.id.Buttonl;
		}

		@Override
		protected int getLayoutID() {
			return R.layout.state_widgetl;
		}

		@Override
		protected ComponentName getComponentName() {
			return new ComponentName(this, WiFiStateWidgetProviderl.class);
		}

	}
}

