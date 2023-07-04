package mil.pusdalops.webui.window.rupus;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zul.Include;

import mil.pusdalops.webui.common.GFCBaseController;

public class MainWindowController extends GFCBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -199139191632140585L;

	private static final Logger log = Logger.getLogger(MainWindowController.class);
	
	private Include mainInclude, profileInclude;
	
	public void onCreate$mainRupusWindow(Event event) throws Exception {
		log.info("RupusMainWindowController Created...");
		
		mainInclude.setSrc("~./rupus/RupusMainDashboard.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");
	}
	
	public void onClickDashboardMenu(Event event) throws Exception {
		log.info("onClickDashboardMenu..."+event.getData());
		
		mainInclude.setSrc("~./rupus/RupusMainDashboard.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");
	}
	
	public void onClickPLBNMenu(Event event) throws Exception {
		log.info("onClickPLBNMenu..."+event.getData());
		
		mainInclude.setSrc("~./rupus/PLBNDashboard.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");
	}
	
	public void onClickPLBNOperasionalMenu(Event event) throws Exception {
		log.info("onClickPLBNOperasionalMenu..."+event.getData());
		
		mainInclude.setSrc("~./rupus/PLBNOperasionalDashboard.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");		
	}
	
	public void onClickPLBNArchiveMenu(Event event) throws Exception {
		log.info("onClickPLBNArchiveMenu..."+event.getData());
		
		mainInclude.setSrc("~./rupus/PLBNArchive.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");	
	}
	
	public void onClickPLBNCctvMenu(Event event) throws Exception {
		log.info("onClickPLBNCctvMenu..."+event.getData());
		
		mainInclude.setSrc("~./rupus/PLBNCctv.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");			
	}
	
	public void onClickPusatMenu(Event event) throws Exception {
		log.info("onClickPusatMenu..."+event.getData());
		
		mainInclude.setSrc("~./pusat/PusatDashboard.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");			
	}
	
	public void onClickPusatOperasionalMenu(Event event) throws Exception {
		log.info("onClickPusatOperasionalMenu..."+event.getData());

		mainInclude.setSrc("~./pusat/PusatOperasional.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");	
	}
	
	public void onClickPusatCctvMenu(Event event) throws Exception {
		log.info("onClickPusatCctvMenu..."+event.getData());
		
		mainInclude.setSrc("~./pusat/PusatCctv.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");	
	}
	
	public void onClickPusatMessaginMenu(Event event) throws Exception {
		log.info("onClickPusatMessaginMenu..."+event.getData());
		
		mainInclude.setSrc("~./pusat/PusatMessaging.zul");
		profileInclude.setSrc("~./rupus/RupusMainProfile.zul");			
	}
}
