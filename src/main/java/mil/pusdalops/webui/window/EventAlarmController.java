package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.domain.plbn.PosLintasBN;
import mil.pusdalops.webui.common.GFCBaseController;

public class EventAlarmController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1790657777287507403L;

	private static final Logger log = Logger.getLogger(EventAlarmController.class);
	
	private Combobox plbnCombobox;
	
	public void onCreate$eventAlarmPanel(Event event) throws Exception {
		log.info("EventAlarmController Created...");
		
		Comboitem comboitem;
		for (PosLintasBN plbn : PosLintasBN.values()) {
			comboitem = new Comboitem();
			comboitem.setLabel(plbn.toString());
			comboitem.setValue(plbn);
			comboitem.setParent(plbnCombobox);
		}		
		
	}
}
