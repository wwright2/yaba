package sfbrokerapi

import ca.odell.glazedlists.EventList
import ca.odell.glazedlists.BasicEventList
import ca.odell.glazedlists.SortedList
import groovy.beans.Bindable

class SfMsgModel extends AbstractDialogModel {
	EventList plugins = new SortedList(new BasicEventList(),
			{a, b -> a.name <=> b.name} as Comparator)
	@Bindable String description

	protected String getDialogKey() { 'Stockfinder' }
	protected String getDialogTitle() { 'Stockfinder' }

	void mvcGroupInit(Map<String, Object> args) {
		super.mvcGroupInit(args)
		resizable = true
		description = app.getMessage('application.dialog.StockFinder.short_description', [Metadata.current.getGriffonVersion()])

		List tmp = []
		for(String addonName : app.addonManager.addonDescriptors.keySet().sort()) {
			GriffonAddonDescriptor gad = app.addonManager.findAddonDescriptor(addonName)
			tmp << [name: gad.pluginName, version: gad.version]
		}
		plugins.addAll(tmp)
	}

}



