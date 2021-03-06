/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.policy.adminui.client.view.common;

import org.ebayopensource.turmeric.policy.adminui.client.Display;
import org.ebayopensource.turmeric.policy.adminui.client.model.UserAction;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

/**
 * The Interface PolicyTemplateDisplay.
 */
public interface PolicyTemplateDisplay {
	
	/**
	 * This interface manages the menu of the template display.
	 * @author nuy
	 *
	 */
	public interface MenuDisplay extends Display {

		
		/**
		 * The Interface MenuSelectionEventHandler.
		 */
		public interface MenuSelectionEventHandler extends EventHandler {
			void onSelection(UserAction action);
		}
		
		/**
		 * The Class MenuSelectionEvent.
		 */
		public class MenuSelectionEvent extends GwtEvent<MenuSelectionEventHandler> {
			
			/** The Constant TYPE. */
			public static final Type<MenuSelectionEventHandler> TYPE = new Type<MenuSelectionEventHandler>();

			private UserAction action;
			
			/**
			 * Instantiates a new menu selection event.
			 * 
			 * @param action
			 *            the action
			 */
			public MenuSelectionEvent(UserAction action) {
				this.action = action;
			}
			
			/* (non-Javadoc)
			 * @see com.google.gwt.event.shared.GwtEvent#dispatch(com.google.gwt.event.shared.EventHandler)
			 */
			@Override
			protected void dispatch(MenuSelectionEventHandler handler) {
				handler.onSelection(action);
			}

			/* (non-Javadoc)
			 * @see com.google.gwt.event.shared.GwtEvent#getAssociatedType()
			 */
			@Override
			public Type<MenuSelectionEventHandler> getAssociatedType() {
				return TYPE;
			}
		}
	}
	
	
	/**
	 * This interface describes the template display. It has a menu, content, and logout components.
	 * @author nuy
	 *
	 */
	public interface PolicyPageTemplateDisplay extends Display {
		//Minimun size required in a elements list to be rendered with scrollbar
		/** The MI n_ scrollba r_ size. */
		int MIN_SCROLLBAR_SIZE = 5;
		Display getContentView();
	
	}
}
