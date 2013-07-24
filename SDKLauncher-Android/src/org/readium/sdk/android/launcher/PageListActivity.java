package org.readium.sdk.android.launcher;

import org.readium.sdk.android.components.navigation.NavigationTable;

public class PageListActivity extends NavigationTableActivity {

	protected NavigationTable getNavigationTable() {
		NavigationTable navigationTable = null;
        if (pckg != null) {
        	navigationTable = pckg.getPageList();
        }
		return (navigationTable != null) ? navigationTable : new NavigationTable("page-list", "", "");
	}
}

