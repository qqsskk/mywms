/*
 * Copyright (c) 2009-2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.los.inventory.service;

import javax.ejb.Local;

import org.mywms.service.BasicService;

import de.wms2.mywms.picking.PickingUnitLoad;

/**
 * @author krane
 *
 */
@Local
public interface LOSPickingUnitLoadService extends BasicService<PickingUnitLoad>{
}
