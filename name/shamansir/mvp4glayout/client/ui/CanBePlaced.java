/**
 * 
 */
package name.shamansir.mvp4glayout.client.ui;

import name.shamansir.mvp4glayout.client.ui.structure.Place;

/**
 * <dl>
 * <dt>Project:</dt> <dd>gwt-mvp4g-layouting-demo</dd>
 * <dt>Package:</dt> <dd>name.shamansir.mvp4glayout.client.ui</dd>
 * </dl>
 *
 * <code>CanBePlaced</code>
 *
 * <p>Description</p>
 *
 * @author Ulric Wilfred <shaman.sir@gmail.com>
 * @date Jun 9, 2011 7:14:44 PM 
 *
 */
public interface CanBePlaced {
    
    public Place getPlace();
    public void setPlace(Place place);    

}
