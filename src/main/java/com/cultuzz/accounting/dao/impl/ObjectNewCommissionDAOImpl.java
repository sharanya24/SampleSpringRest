package com.cultuzz.accounting.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.dao.AbstractDAO;
import com.cultuzz.accounting.dao.ObjectNewCommissionDAO;

@Repository
public class ObjectNewCommissionDAOImpl extends AbstractDAO implements ObjectNewCommissionDAO {

	@Override
	public ObjectNewCommissionStatus fetchObjectNewCommissionStatus(int objectId) {
		ObjectNewCommissionStatus beanObjectNewCommissionStatus = null;
		
		Session session = getReadSession();
		
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.ObjectNewCommissionStatus.class);
		
		criteria.add(Restrictions.eq("objectId", objectId));
		
		ProjectionList projectionList = Projections.projectionList();
		
		projectionList.add(Projections.property("objectId"), "objectId");
		projectionList.add(Projections.property("newCommissionStatus"), "newCommissionStatus");
		projectionList.add(Projections.property("effectiveDate"), "effectiveDate");
		projectionList.add(Projections.property("assignedUserId"), "assignedUserId");
		projectionList.add(Projections.property("lastUpdated"), "lastUpdated");
		
		criteria.setProjection(projectionList);
		
		criteria.setResultTransformer(Transformers.aliasToBean(ObjectNewCommissionStatus.class));
		
		beanObjectNewCommissionStatus = (ObjectNewCommissionStatus)criteria.uniqueResult();
		
		return beanObjectNewCommissionStatus;
	}

}
