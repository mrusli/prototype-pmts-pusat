package mil.pusdalops.webui.window.rupus;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class PlbnArchiveController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1862692619423641613L;

	private static final Logger log = Logger.getLogger(PlbnArchiveController.class);
	
	public void onCreate$plbnArchivePanel(Event event) throws Exception {
		log.info("PlbnArchiveController Created...");
	}
}
