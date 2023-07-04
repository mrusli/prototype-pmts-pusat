package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.domain.plbn.PosLintasBN;
import mil.pusdalops.webui.common.GFCBaseController;

public class DaftarHitamController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7534880559805434774L;

	private static final Logger log = Logger.getLogger(DaftarHitamController.class);
	
	private Combobox plbnCombobox;
	
	public void onCreate$daftarHitamPanel(Event event) throws Exception {
		log.info("DaftarHitamController Created...");
		
		Comboitem comboitem;
		for (PosLintasBN plbn : PosLintasBN.values()) {
			comboitem = new Comboitem();
			comboitem.setLabel(plbn.toString());
			comboitem.setValue(plbn);
			comboitem.setParent(plbnCombobox);
		}
	}
	
}
