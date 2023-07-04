package mil.pusdalops.webui.window.rupus;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class PlbnDashboardController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2064441820040827574L;

	private static final Logger log = Logger.getLogger(PlbnDashboardController.class);
	
	public void onCreate$plbnDashboardPanel(Event event) throws Exception {
		log.info("PlbnDashboardController Created...");
	}
}
