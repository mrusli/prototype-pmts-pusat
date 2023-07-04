package mil.pusdalops.webui.window;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Include;

import mil.pusdalops.webui.common.GFCBaseController;

public class MainWindowController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5672033070925008437L;

	private static final Logger log = Logger.getLogger(MainWindowController.class);
	
	private Include mainInclude;
	
	public void onCreate$mainWindow(Event event) throws Exception {
		log.info("MainWindowController activated");
	}

	public void onClickDashboardMenu(Event event) throws Exception {
		log.info("onClickDashboardMenu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/Dashboard.zul");
	}
	
	public void onClickPencatatanMenu(Event event) throws Exception {
		log.info("onClickPencatatanMenu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/Pencatatan.zul");
	}
	
	public void onClickDaftarHitamMenu(Event event) throws Exception {
		log.info("onClickDaftarHitamMenu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/DaftarHitam.zul");
	}

	public void onClickPengawasan01Menu(Event event) throws Exception {
		log.info("onClickPengawasan01Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/Pengawasan.zul");
	}
	
	public void onClickPengawasan02Menu(Event event) throws Exception {
		log.info("onClickPengawasan02Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/Pengawasan02.zul");
	}	
	
	public void onClickEventAlarm01Menu(Event event) throws Exception {
		log.info("onClickEventAlarm01Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/EventAlarm.zul");
	}
	
	public void onClickEventAlarm02Menu(Event event) throws Exception {
		log.info("onClickEventAlarm02Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/EventAlarm02.zul");
	}	
	
	public void onClickJumlahOrang01Menu(Event event) throws Exception {
		log.info("onClickJumlahOrang01Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/JumlahOrang.zul");
	}

	public void onClickJumlahOrang02Menu(Event event) throws Exception {
		log.info("onClickJumlahOrang02Menu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/JumlahOrang02.zul");
	}	
	
	public void onClickProducerMenu(Event event) throws Exception {
		log.info("onClickProducerMenu..."+event.getData());
		
		mainInclude.setSrc("~./integrasi/Producer.zul");
	}
}
