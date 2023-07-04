package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class DashboardController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1360163499106594435L;

	private static final Logger log = Logger.getLogger(DashboardController.class);
	
	public void onCreate$dashboardPanel(Event event) throws Exception {
		log.info("DashboardController Created...");
	}
}
