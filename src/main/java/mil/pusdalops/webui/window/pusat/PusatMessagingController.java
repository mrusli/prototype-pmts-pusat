package mil.pusdalops.webui.window.pusat;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.webui.common.GFCBaseController;

public class PusatMessagingController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2632311122159636762L;

	private static final Logger log = Logger.getLogger(PusatMessagingController.class);
	
	private Combobox clusterCombobox, clusterUserCombobox, clusterMessageCombobox;
	
	public void onCreate$pusatMessagingPanel(Event event) throws Exception {
		log.info("PusatMessagingController Created...");
		
		String[] clusters = {"Entikong", "Aruk", "Badau", "Montaain"};
		Comboitem comboitem;
		
		for (String string : clusters) {
			comboitem = new Comboitem();
			comboitem.setLabel(string);
			comboitem.setParent(clusterCombobox);
		}
		
		for (String string : clusters) {
			comboitem = new Comboitem();
			comboitem.setLabel(string);
			comboitem.setParent(clusterUserCombobox);
		}
		
		for (String string : clusters) {
			comboitem = new Comboitem();
			comboitem.setLabel(string);
			comboitem.setParent(clusterMessageCombobox);
		}
		
	}
}
