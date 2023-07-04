package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.domain.plbn.PosLintasBN;
import mil.pusdalops.webui.common.GFCBaseController;

public class ProducerController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5474234748485733418L;

	private static final Logger log = Logger.getLogger(ProducerController.class);
	
	private Combobox plbnCombobox;
	
	public void onCreate$producerPanel(Event event) throws Exception {
		log.info("ProducerController Created...");
		
		Comboitem comboitem;
		for (PosLintasBN plbn : PosLintasBN.values()) {
			comboitem = new Comboitem();
			comboitem.setLabel(plbn.toString());
			comboitem.setValue(plbn);
			comboitem.setParent(plbnCombobox);
		}		
	}
}
