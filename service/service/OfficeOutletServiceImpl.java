package com.cg.datajpa.mts.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.datajpa.mts.entities.CourierOfficeOutlet;
import com.cg.datajpa.mts.exception.OutletClosedException;
import com.cg.datajpa.mts.exception.OutletNotFoundException;
import com.cg.datajpa.mts.repository.IOfficeOutletDao;
import com.cg.datajpa.mts.repository.OfficeOutletDaoImpl;

public class OfficeOutletServiceImpl implements IOfficeOutletService {
	
	@Autowired
	OfficeOutletDaoImpl dao;
	public void setOfficeOutletDAO(OfficeOutletDaoImpl officeDAO) {
		this.dao=officeDAO;
	}
	
	
	
	@Override
	public void addNewOffice(CourierOfficeOutlet officeoutlet) {
		// TODO Auto-generated method stub
		dao.addNewOffice(officeoutlet);
	}

	@Override
	public void removeNewOffice(CourierOfficeOutlet officeoutlet) {
		// TODO Auto-generated method stub
		dao.removeNewOffice(officeoutlet);
	}

	@Override
	public CourierOfficeOutlet getOfficeInfo(int officeid) throws OutletNotFoundException {
		CourierOfficeOutlet o=null;
		try {
			o=dao.getOfficeInfo(officeid);
		}
		catch(OutletNotFoundException ex) {
			
		}
		return o;
	}

	@Override
	public List<CourierOfficeOutlet> getAllOfficesData() {
		List<CourierOfficeOutlet> data=new ArrayList<>();
		data=dao.getAllOfficesData();
		return data;
	}

	@Override
	public boolean isOfficeOpen(CourierOfficeOutlet officeoutlet) throws OutletClosedException {
		boolean status=false;
		LocalTime currentTime=java.time.LocalTime.now();
		try {
			if(currentTime.compareTo(officeoutlet.getOpeningTime())>=0 && currentTime.compareTo(officeoutlet.getClosingTime())<0) {
				status=true;
			}
			else
				throw new OutletClosedException();
		}
		catch(OutletClosedException ex) {
			
		}
		return status;
	}

	@Override
	public boolean isOfficeClosed(CourierOfficeOutlet officeoutlet) throws OutletClosedException {
		boolean status=false;
		LocalTime currentTime=java.time.LocalTime.now();
		try {
			if(currentTime.compareTo(officeoutlet.getOpeningTime())<0 && currentTime.compareTo(officeoutlet.getClosingTime())>=0)
				status=true;
			else
				throw new OutletClosedException();
		}
		catch(OutletClosedException ex) {
			
		}
		return status;
	}
	
}
