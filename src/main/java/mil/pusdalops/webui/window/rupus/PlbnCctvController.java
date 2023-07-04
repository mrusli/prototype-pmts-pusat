package mil.pusdalops.webui.window.rupus;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.webui.common.GFCBaseController;

public class PlbnCctvController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1798890149075685264L;

	private static final Logger log = Logger.getLogger(PlbnCctvController.class);
	
	private Combobox configCombobox;
	
	public void onCreate$plbnCctvPanel(Event event) throws Exception {
		log.info("PlbnCctvController Created...");
		
		String[] config = { "2x3", "1x3" };
		
		Comboitem comboitem;
		for (String string : config) {
			comboitem = new Comboitem();
			comboitem.setLabel(string);
			comboitem.setParent(configCombobox);
		}
	}
}
