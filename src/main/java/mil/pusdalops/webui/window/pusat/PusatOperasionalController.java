package mil.pusdalops.webui.window.pusat;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;

import mil.pusdalops.webui.common.GFCBaseController;

public class PusatOperasionalController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5883887400873004450L;

	private static final Logger log = Logger.getLogger(PusatOperasionalController.class);
	
	public void onCreate$pusatOperasionalPanel(Event event) throws Exception {
		log.info("PusatOperasionalController Created...");
	}
}
