package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Comboitem;

import mil.pusdalops.domain.plbn.PosLintasBN;
import mil.pusdalops.webui.common.GFCBaseController;

public class JumlahOrang02Controller extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8122065251866344017L;
	
	private static final Logger log = Logger.getLogger(JumlahOrang02Controller.class);
	
	private Combobox plbnCombobox;
	
	public void onCreate$jumlahOrang02Panel(Event event) throws Exception {
		log.info("JumlahOrang02Controller Created...");
		
		Comboitem comboitem;
		for (PosLintasBN plbn : PosLintasBN.values()) {
			comboitem = new Comboitem();
			comboitem.setLabel(plbn.toString());
			comboitem.setValue(plbn);
			comboitem.setParent(plbnCombobox);
		}
	}

}
