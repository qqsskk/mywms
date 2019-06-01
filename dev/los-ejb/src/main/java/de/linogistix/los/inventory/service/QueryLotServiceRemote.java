/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.service;

import javax.ejb.Remote;

import de.wms2.mywms.inventory.Lot;
import de.wms2.mywms.product.ItemData;

@Remote
public interface QueryLotServiceRemote {

	/**
	 * Searches for the unique key of lot (name, {@link ItemData}).
	 * 
	 * @param name name of the lot
	 * @param item {@link ItemData} this lot is assigned to.
	 * @return return matching {@link Lot} or NULL if there is none.
	 */
	public Lot getByNameAndItemData(String name, ItemData item);
}
