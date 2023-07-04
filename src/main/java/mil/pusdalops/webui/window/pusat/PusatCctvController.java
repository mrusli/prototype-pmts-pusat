package mil.pusdalops.webui.window.pusat;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.webui.common.GFCBaseController;

public class PusatCctvController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7269042041964001895L;

	private static final Logger log = Logger.getLogger(PusatCctvController.class);
	
	private Combobox configCombobox;
	
	public void onCreate$pusatCctvPanel(Event event) throws Exception {
		log.info("PusatCctvController Created...");
		
		String[] config = { "1x4", "2x4", "4x4" };
		
		Comboitem comboitem;
		
		for (String string : config) {
			comboitem = new Comboitem();
			comboitem.setLabel(string);
			comboitem.setParent(configCombobox);
		}
	}
}
