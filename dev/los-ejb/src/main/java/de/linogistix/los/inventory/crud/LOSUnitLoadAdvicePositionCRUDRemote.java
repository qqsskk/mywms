/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.crud;

import javax.ejb.Remote;

import de.linogistix.los.crud.BusinessObjectCRUDRemote;
import de.linogistix.los.inventory.model.LOSUnitLoadAdvicePosition;

@Remote
public interface LOSUnitLoadAdvicePositionCRUDRemote extends
		BusinessObjectCRUDRemote<LOSUnitLoadAdvicePosition> {

}
