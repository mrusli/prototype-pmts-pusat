package mil.pusdalops.webui.window.rupus;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class MainDashboardController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 338803347973212930L;

	private static final Logger log = Logger.getLogger(MainDashboardController.class);
	
	public void onCreate$rupusMainDashboardPanel(Event event) throws Exception {
		log.info("MainDashboardController (Rupus) Created...");
	}
}
