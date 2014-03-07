package sfbrokerapi

import javax.swing.KeyStroke

actions {
	action(saveAction, enabled: false)
	action(saveAsAction, enabled: false)
	action(undoAction, enabled: false)
	action(redoAction, enabled: false)
	action(cutAction, enabled: false)
	action(copyAction, enabled: false)
	action(pasteAction, enabled: false)
	action(deleteAction, accelerator: KeyStroke.getKeyStroke(app.getMessage('application.action.Delete.accelerator',
			'meta DELETE')),  enabled: false )
	action(stockfinderAction, enabled: false)
}