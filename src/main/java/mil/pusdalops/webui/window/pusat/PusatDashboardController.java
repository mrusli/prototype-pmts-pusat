package mil.pusdalops.webui.window.pusat;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class PusatDashboardController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8628375345838829973L;

	private static final Logger log = Logger.getLogger(PusatDashboardController.class);
	
	public void onCreate$pusatDashboardPanel(Event event) throws Exception {
		log.info("PusatDashboardController Created...");
	}
}
