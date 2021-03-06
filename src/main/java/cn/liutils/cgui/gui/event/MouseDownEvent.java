/**
 * 
 */
package cn.liutils.cgui.gui.event;


/**
 * @author WeAthFolD
 */
public class MouseDownEvent implements GuiEvent {
	public final double x, y;
	
	public MouseDownEvent(double _x, double _y) {
		x = _x;
		y = _y;
	}
	
	public static abstract class MouseDownHandler extends GuiEventHandler<MouseDownEvent> {

		public MouseDownHandler() {
			super(MouseDownEvent.class);
		}

	}

}
