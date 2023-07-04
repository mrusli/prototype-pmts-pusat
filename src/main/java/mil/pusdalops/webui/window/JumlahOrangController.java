package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.domain.plbn.PosLintasBN;
import mil.pusdalops.webui.common.GFCBaseController;

public class JumlahOrangController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1994030498427737637L;

	private static final Logger log = Logger.getLogger(JumlahOrangController.class);
	
	private Combobox plbnCombobox;
	
	public void onCreate$jumlahOrangPanel(Event event) throws Exception {
		log.info("JumlahOrangController Created...");
		
		Comboitem comboitem;
		for (PosLintasBN plbn : PosLintasBN.values()) {
			comboitem = new Comboitem();
			comboitem.setLabel(plbn.toString());
			comboitem.setValue(plbn);
			comboitem.setParent(plbnCombobox);
		}
	}
}
